package org.igetwell.common.exhandler.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 3, 2016
 */
public class TokenExpiredException extends AuthenticationException {
    private static final long serialVersionUID = -5959543783324224864L;

    public TokenExpiredException(String msg) {
        super(msg);
    }

    public TokenExpiredException( String msg, Throwable t) {
        super(msg, t);
    }

}
