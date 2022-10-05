package com.berkaytutal.troopgenerator.aspect;

import com.berkaytutal.troopgenerator.exception.CustomException;
import com.berkaytutal.troopgenerator.exception.InvalidRequestException;
import com.berkaytutal.troopgenerator.model.dto.CustomExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomRestExceptionHandler {

    @ExceptionHandler(InvalidRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomExceptionResponse handleNotFoundException(CustomException ce) {

        return CustomExceptionResponse.from(ce);
    }

}
