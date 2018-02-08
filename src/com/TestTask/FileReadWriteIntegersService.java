package com.TestTask;

import com.TestTask.Exceptions.CastPublicException;
import com.TestTask.Interfaces.IReadWriteIntegersService;

public class FileReadWriteIntegersService extends FileReadWriteServiceBase<Integer>
        implements IReadWriteIntegersService {
    public FileReadWriteIntegersService(String fileInputName, String fileOutputName) {
        super(fileInputName, fileOutputName);
    }
    @Override
    protected Integer cast(String str) throws CastPublicException {
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            throw new CastPublicException(str, "Integer");
        }
    }

    @Override
    protected String castToString(Integer obj) {
        return obj.toString();
    }
}
