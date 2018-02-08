package com.TestTask.Exceptions;

public class FileNotFoundPublicException extends PublicException {
    private final String fileName;
    private final static String formatError;

    static {
        formatError = "File with name '%s' not found.";
    }

    public FileNotFoundPublicException(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getMessage() {
        return String.format(formatError, fileName);
    }
}
