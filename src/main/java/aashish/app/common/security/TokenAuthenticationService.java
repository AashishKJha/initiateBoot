package aashish.app.common.security;

import aashish.app.common.helper.StoreLoginUser;
import aashish.app.users.DTO.UserDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.UUID;

import static java.util.Collections.emptyList;

class TokenAuthenticationService {

    static void addAuthentication(HttpServletResponse res, StoreLoginUser storeLoginUser) throws IOException, ServletException {


        //Creating Access Token
        String ACCESS_TOKEN = Jwts.builder()
                .setSubject(new ObjectMapper().writeValueAsString(storeLoginUser))
                .setId(UUID.randomUUID().toString())
                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.ACCESS_TOKEN_EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET)
                .compact();

        //Creating Refresh token
        String REFRESH_TOKEN = Jwts.builder()
                .setSubject(new ObjectMapper().writeValueAsString(storeLoginUser))
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.REFRESH_TOKEN_EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET)
                .compact();


        //res.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + " " + JWT);

        //Used to send auth_token and other data in body not in headers.
        res.setHeader("Content-Type", "application/json");
        res.getWriter().write(TokenAuthenticationService.createResponseMap(ACCESS_TOKEN, REFRESH_TOKEN));
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

    private static String createResponseMap(String access_token, String refresh_token) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("ACCESS_TOKEN", access_token);
        map.put("REFRESH_TOKEN", refresh_token);
        map.put("HEADER_STRING", SecurityConstants.HEADER_STRING);
        map.put("TOKEN_PREFIX", SecurityConstants.TOKEN_PREFIX);
        map.put("GRANT_TYPE", "password");
        map.put("ACCESS_TOKEN_EXPIRATION_TIME", SecurityConstants.ACCESS_TOKEN_EXPIRATION_TIME);
        map.put("REFRESH_TOKEN_EXPIRATION_TIME", SecurityConstants.REFRESH_TOKEN_EXPIRATION_TIME);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(map);
    }
}