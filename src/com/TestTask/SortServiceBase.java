package com.TestTask;

import java.util.ArrayList;

abstract public class SortServiceBase<T> {
    abstract protected boolean compare(T a, T b);

    public void sort(ArrayList<T> list, boolean asceding) {
        if (asceding == compare(list.get(0), list.get(1))) {
            list.add(0, list.get(1));
            list.remove(2);
        }

        for (int i = 2; i < list.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (asceding == !compare(list.get(j), list.get(i))) {
                    list.add(j + 1, list.get(i));
                    list.remove(i+1);

                    break;
                } else if (j == 0) {
                    list.add(j, list.get(i));
                    list.remove(i+1);

                    break;
                }
            }
        }
    }
}

