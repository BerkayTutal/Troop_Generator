package com.berkaytutal.troopgenerator.model;

public enum Errors {
    INVALID_MINIMUM_SUM_ERROR("Input must be at least 6 to have unique set of soldiers!");

    private final String errorDescription;

    public String getErrorDescription() {
        return this.errorDescription;
    }

    Errors(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
