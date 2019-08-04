package com.mycompany.myapp.service;

public class LoginAlreadyUsedException extends RuntimeException {

    public LoginAlreadyUsedException() {
        super("Login name already used!");
    }
}
