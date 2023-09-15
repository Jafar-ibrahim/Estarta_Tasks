package com.example.twitterApi.Exception;

import org.springframework.security.core.AuthenticationException;

public class UserImpersonatingException extends AuthenticationException {

    public UserImpersonatingException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UserImpersonatingException(String msg) {
        super(msg);
    }
}
