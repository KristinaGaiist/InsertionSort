package com.TestTask.Interfaces;

import com.TestTask.Exceptions.CastPublicException;

import java.util.ArrayList;

public interface IReadWriteStringsService {
    ArrayList<String> read() throws CastPublicException;

    void write(ArrayList<String> strings);
}
