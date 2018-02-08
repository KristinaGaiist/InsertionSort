package com.TestTask;

import com.TestTask.Interfaces.ISortStringsService;

public class SortStringsService extends SortServiceBase<String> implements ISortStringsService {
    @Override
    protected boolean compare(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

