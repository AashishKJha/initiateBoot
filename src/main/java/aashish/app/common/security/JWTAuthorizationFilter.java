package aashish.app.common.security;

import aashish.app.common.response.ClientResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.security.core.Authentication;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthorizationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        /**
         * Creating instance of HttpServelet Response.
         */
        HttpServletResponse hsr = (HttpServletResponse) response;
        try {
            Authentication authentication = TokenAuthenticationService
                    .getAuthentication((HttpServletRequest) request);
            SecurityContextHolder.getContext()
                    .setAuthentication(authentication);
            filterChain.doFilter(request, response);
        } catch (RuntimeException e) {
            hsr.setContentType(SecurityConstants.APPLICATION_JSON);
            //402 for unauthorized request.
            hsr.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            ObjectMapper mapper = new ObjectMapper();
            hsr.getWriter().write(mapper.writeValueAsString(ClientResponse.createFailure(false, e.getMessage())));
        }
    }
}