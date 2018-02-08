package com.TestTask.Exceptions;

public class CastPublicException extends PublicException {
    private final String value, type;
    private final static String formatError;

    static {
        formatError = "Please, check your input file. String '%s' can't be cast to %s";
    }

    public CastPublicException(String value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return String.format(formatError, value, type);
    }
}
