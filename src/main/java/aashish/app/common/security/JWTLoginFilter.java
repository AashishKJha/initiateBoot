package aashish.app.common.security;


import aashish.app.auth.models.AuthModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StringUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    private
    AuthModel authModel;

    JWTLoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }


    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException, IOException, ServletException {

        //Change here if user login with mobile number

        this.authModel = new ObjectMapper()
                .readValue(req.getInputStream(), AuthModel.class);
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(this.authModel.getUserEmail(), this.authModel.getUserPassword(), Collections.emptyList());
        return getAuthenticationManager().authenticate(token);
    }

    @Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
        if (auth.getPrincipal() == null) {
            throw new UserPrincipalNotFoundException("User Principals Not Found");
        }
        LoginUserData loginUserData = (LoginUserData) auth.getPrincipal();
        TokenAuthenticationService
                .addAuthentication(res, loginUserData);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest req, HttpServletResponse res, AuthenticationException failed) throws IOException, ServletException {

        res.setStatus(HttpStatus.UNAUTHORIZED.value());
        res.setContentType(MediaType.APPLICATION_JSON_VALUE);

        Map<String, String> mp = new HashMap<>();
        if (StringUtils.isEmpty(this.authModel.getUserEmail()) || this.authModel.getUserEmail() == null) {
            mp.put("message", SecurityConstants.USER_NAME_NOT_FOUND);
        } else if (StringUtils.isEmpty(this.authModel.getUserPassword()) || this.authModel.getUserPassword() == null) {
            mp.put("message", SecurityConstants.USER_PASSWORD_NOT_FOUND);
        } else {
            mp.put("message", SecurityConstants.BAD_CREDENTIALS);
        }

        res.getWriter().write(new ObjectMapper().writeValueAsString(mp));

    }
}