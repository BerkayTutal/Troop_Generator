package com.berkaytutal.troopgenerator.model.dto;

import com.berkaytutal.troopgenerator.exception.CustomException;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomExceptionResponse {
    private String message;

    public static CustomExceptionResponse from(CustomException customException) {
        return CustomExceptionResponse.builder()
                .message(customException.getErrors().getErrorDescription())
                .build();
    }
}
