package com.sample.service.service;

import java.util.Arrays;

public class FibonocciService {

    public String getSeriesData(Integer input) {

        Integer[] arr = new Integer[input];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < input; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return Arrays.toString(arr);
    }
}
