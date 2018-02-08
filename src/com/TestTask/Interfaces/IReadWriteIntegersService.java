package com.TestTask.Interfaces;

import com.TestTask.Exceptions.CastPublicException;

import java.util.ArrayList;

public interface IReadWriteIntegersService {
    ArrayList<Integer> read() throws CastPublicException;

    void write(ArrayList<Integer> ints);
}
