package com.TestTask;

import com.TestTask.Exceptions.FileNotFoundPublicException;
import com.TestTask.Exceptions.PublicException;
import com.TestTask.Interfaces.ISortArgumentsParser;
import com.TestTask.Interfaces.ISortArguments;

import java.io.File;
import java.io.IOException;

public class CommandHandler {
    private ISortArgumentsParser argumentParser;
    private SortFactory sortFactory;

    public CommandHandler() {
        argumentParser  = new SortArgumentsParser();
        sortFactory = new SortFactory();
    }

    public void handle(String[] arguments) {
        try {
            ISortArguments sortArguments = argumentParser.parse(arguments);
            EnsureFilesExists(sortArguments);
            sortFactory.sort(sortArguments);

            System.out.println("Success!");
        } catch (PublicException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            System.out.println("Internal error: " + e.getMessage());
        }
    }

    private void EnsureFilesExists(ISortArguments sortArguments)
            throws FileNotFoundPublicException {
        String fileInputName = sortArguments.getFileInputName();
        String fileOutputName = sortArguments.getFileOutputName();

        File file = new File(fileInputName);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundPublicException(file.getAbsolutePath());
        }

        File fileOutput = new File(fileOutputName);
        try {
            if (!fileOutput.exists()) {
                fileOutput.createNewFile();
            }
        } catch (IOException e) {
            throw new FileNotFoundPublicException(fileOutput.getAbsolutePath());
        }
    }
}
