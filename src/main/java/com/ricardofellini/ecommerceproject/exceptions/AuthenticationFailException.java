package com.ricardofellini.ecommerceproject.exceptions;

public class AuthenticationFailException extends IllegalArgumentException{

    public AuthenticationFailException(String msg){
        super(msg);
    }
}
