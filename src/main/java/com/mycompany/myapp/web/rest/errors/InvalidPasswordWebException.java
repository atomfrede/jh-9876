package com.mycompany.myapp.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class InvalidPasswordWebException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordWebException() {
        super(ErrorConstants.INVALID_PASSWORD_TYPE, "Incorrect password", Status.BAD_REQUEST);
    }
}
