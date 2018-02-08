package com.TestTask.Interfaces;

import com.TestTask.SortType;

public interface ISortArguments {
    String getFileInputName();

    String getFileOutputName();

    boolean isAsceding();

    SortType getType();
}
