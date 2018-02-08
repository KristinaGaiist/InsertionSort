package com.TestTask;

import com.TestTask.Interfaces.*;
import com.TestTask.Exceptions.IncorrectArgumentsPublicException;

public class SortArgumentsParser implements ISortArgumentsParser {
    public ISortArguments parse(String[] arguments) throws IncorrectArgumentsPublicException {
        if (arguments.length != 4) {
            throw new IncorrectArgumentsPublicException();
        }

        SortType type = parseSortType(arguments[2]);
        boolean asceding = parseAsceding(arguments[3]);

        return new SortArguments(arguments[0], arguments[1], type, asceding);
    }
    private SortType parseSortType(String type) throws IncorrectArgumentsPublicException {
        switch (type) {
            case "-i" : return SortType.Integers;
            case "-s" : return SortType.Strings;
            default: throw new IncorrectArgumentsPublicException();
        }
    }
    private boolean parseAsceding(String asceding) throws IncorrectArgumentsPublicException {
        switch (asceding) {
            case "-a" : return true;
            case "-d" : return false;
            default: throw new IncorrectArgumentsPublicException();
        }
    }
}
