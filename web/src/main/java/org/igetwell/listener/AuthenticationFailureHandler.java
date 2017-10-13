package org.igetwell.listener;

import org.igetwell.common.constans.HttpStatus;
import org.igetwell.common.exhandler.exception.TokenExpiredException;
import org.igetwell.common.util.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springside.modules.utils.text.JsonMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
//        if (exception instanceof BadCredentialsException) {
//            response.getWriter().write("Bad credentials");
//        } else if (exception instanceof TokenExpiredException) {
//            response.getWriter().write("Token has expired");
//        }
        super.onAuthenticationFailure(request, response, exception);
    }
}
