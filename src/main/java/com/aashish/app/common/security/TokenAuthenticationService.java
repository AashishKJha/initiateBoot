package com.aashish.app.common.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security
        .authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.emptyList;

class TokenAuthenticationService {

    static void addAuthentication(HttpServletResponse res, String username) throws IOException, ServletException {
        String JWT = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET)
                .compact();
        //res.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + " " + JWT);

        //Used to send auth_token and other data in body not in headers.
        Map<String, Object> map = new HashMap<>();

        map.put("token", JWT);
        map.put("HEADER_STRING", SecurityConstants.HEADER_STRING);
        map.put("TOKEN_PREFIX", SecurityConstants.TOKEN_PREFIX);
        map.put("grant_type", "password");
        map.put("EXPIRATION_TIME", SecurityConstants.EXPIRATIONTIME);
        res.setContentType("application/json");

        ObjectMapper ob = new ObjectMapper();

        res.getWriter().write(ob.writeValueAsString(map));
    }

    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(SecurityConstants.HEADER_STRING);
        if (token != null) {
            // parse the token.
            String user = Jwts.parser()
                    .setSigningKey(SecurityConstants.SECRET)
                    .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                    .getBody()
                    .getSubject();
            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, emptyList()) :
                    null;
        }
        return null;
    }
}