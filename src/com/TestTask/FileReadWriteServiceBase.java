package com.TestTask;

import com.TestTask.Exceptions.CastPublicException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

abstract public class FileReadWriteServiceBase<T> {
    private final String _fileInputName;
    private final String _fileOutputName;
    private ArrayList<T> _lines = new ArrayList<>();

    public FileReadWriteServiceBase(String fileInputName, String fileOutputName) {
        _fileInputName = fileInputName;
        _fileOutputName = fileOutputName;
    }

    abstract protected T cast(String str) throws CastPublicException;
    abstract protected String castToString(T obj);

    public ArrayList<T> read() throws CastPublicException {
        try (FileReader fileReader = new FileReader(new File(_fileInputName))) {
            Scanner inputFile = new Scanner(fileReader);

            while (inputFile.hasNextLine()) {
                _lines.add(cast(inputFile.nextLine()));
            }
        } catch (IOException e) {
            // ignore
        }

        return _lines;
    }

    public void write(ArrayList<T> ints) {
        try (FileWriter outputFile = new FileWriter(new File(_fileOutputName))) {
            for (int i = 0; i < ints.size(); i++) {
                outputFile.write(castToString(ints.get(i)) + "\n");
            }
            outputFile.close();
        }
        catch (IOException e) {
            System.out.println("The entered file was not found. Check that the input is correct.");
        }
    }
}
