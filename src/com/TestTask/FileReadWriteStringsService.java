package com.TestTask;

import com.TestTask.Exceptions.CastPublicException;
import com.TestTask.Interfaces.IReadWriteStringsService;

public class FileReadWriteStringsService extends FileReadWriteServiceBase<String>
        implements IReadWriteStringsService {
    public FileReadWriteStringsService(String fileInputName, String fileOutputName) {
        super(fileInputName, fileOutputName);
    }

    @Override
    protected String cast(String str) throws CastPublicException {
        return str;
    }

    @Override
    protected String castToString(String obj) {
        return obj;
    }
}
