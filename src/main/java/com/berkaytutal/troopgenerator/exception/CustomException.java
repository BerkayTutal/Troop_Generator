package com.berkaytutal.troopgenerator.exception;

import com.berkaytutal.troopgenerator.model.Errors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class CustomException extends RuntimeException {
    private final Errors errors;
}
