package com.TestTask.Interfaces;

import com.TestTask.Exceptions.IncorrectArgumentsPublicException;

public interface ISortArgumentsParser {
    ISortArguments parse(String[] arguments) throws IncorrectArgumentsPublicException;
}
