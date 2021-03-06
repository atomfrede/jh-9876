package com.mycompany.myapp.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class EmailNotFoundWebException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public EmailNotFoundWebException() {
        super(ErrorConstants.EMAIL_NOT_FOUND_TYPE, "Email address not registered", Status.BAD_REQUEST);
    }
}
