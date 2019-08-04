package com.mycompany.myapp.web.rest.errors;

public class LoginAlreadyUsedWebException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsedWebException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Login name already used!", "userManagement", "userexists");
    }
}
