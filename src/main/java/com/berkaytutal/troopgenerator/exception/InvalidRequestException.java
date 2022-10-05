package com.berkaytutal.troopgenerator.exception;

import com.berkaytutal.troopgenerator.model.Errors;

public class InvalidRequestException extends CustomException {

    public InvalidRequestException(Errors errors) {

        super(errors);
    }
}
