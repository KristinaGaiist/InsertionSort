package com.TestTask.Exceptions;

public class IncorrectArgumentsPublicException extends PublicException {
    private final static String message =
            "Please, check your parameters. " +
            "You need to enter parameters in this format: " +
            "file_input_name file_output_name type(-i or -s) asceding(-a or -d)";

    @Override
    public String getMessage() {
        return message;
    }
}
