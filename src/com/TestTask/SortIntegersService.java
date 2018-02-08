package com.TestTask;

import com.TestTask.Interfaces.ISortIntegersService;

public class SortIntegersService extends SortServiceBase<Integer> implements ISortIntegersService {
    @Override
    protected boolean compare(Integer a, Integer b) {
        return a > b;
    }
}

