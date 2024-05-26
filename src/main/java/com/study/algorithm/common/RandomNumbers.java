package com.study.algorithm.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {

    public static int[]  makeDistinctRandomNumbers(int size, int max) {
        if (size > max + 1) {
            throw new IllegalArgumentException("Size cannot be larger than max + 1");
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = numbers.get(i);
        }
        return randomNumbers;
    }
}
