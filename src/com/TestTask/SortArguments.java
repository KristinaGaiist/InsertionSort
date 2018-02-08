package com.TestTask;

import com.TestTask.Interfaces.ISortArguments;

public class SortArguments implements ISortArguments {
    private String _fileInputName, _fileOutputName;
    private SortType _type;
    private boolean _asceding;

    public SortArguments(String fileInputName, String fileOutputName, SortType type, boolean asceding) {
        _fileInputName = fileInputName;
        _fileOutputName = fileOutputName;
        _type = type;
        _asceding = asceding;
    }

    @Override
    public String getFileInputName() {
        return _fileInputName;
    }

    @Override
    public String getFileOutputName() {
        return _fileOutputName;
    }

    @Override
    public SortType getType() {
        return _type;
    }

    @Override
    public boolean isAsceding() {
        return _asceding;
    }
}
