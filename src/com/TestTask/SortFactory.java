package com.TestTask;

import com.TestTask.Exceptions.CastPublicException;
import com.TestTask.Interfaces.*;

import java.util.ArrayList;

public class SortFactory {
    private ISortIntegersService sortIntegersService;
    private ISortStringsService sortStringsService;

    public SortFactory() {
        sortIntegersService = new SortIntegersService();
        sortStringsService = new SortStringsService();
    }

    public void sort(ISortArguments arguments) throws CastPublicException {
        SortType type = arguments.getType();
        if(type == SortType.Integers) {
            sortIntegers(arguments);
        } else if(type == SortType.Strings) {
            sortStrings(arguments);
        }
    }
    private void sortIntegers(ISortArguments arguments) throws CastPublicException {
        IReadWriteIntegersService fileIntegers =
                new FileReadWriteIntegersService(arguments.getFileInputName(), arguments.getFileOutputName());
        ArrayList<Integer> arrayIntegers = fileIntegers.read();

        sortIntegersService.sort(arrayIntegers, arguments.isAsceding());

        fileIntegers.write(arrayIntegers);
    }
    private void sortStrings(ISortArguments arguments) throws CastPublicException {
        IReadWriteStringsService fileStrings =
                new FileReadWriteStringsService(arguments.getFileInputName(), arguments.getFileOutputName());
        ArrayList<String> arrayStrings = fileStrings.read();

        sortStringsService.sort(arrayStrings, arguments.isAsceding());

        fileStrings.write(arrayStrings);
    }
}
