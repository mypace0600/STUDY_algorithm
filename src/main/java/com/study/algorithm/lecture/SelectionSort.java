package com.study.algorithm.lecture;

import ch.qos.logback.classic.Level;

import java.util.*;
import java.util.logging.Logger;

public class SelectionSort {

    private static final Logger LOGGER = Logger.getLogger(SelectionSort.class.getName());

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

    public static void main(String[] args){
        int[]  randomNumbers = makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println(" ");

        int[] sortedNumbers = solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    public static int[] solution(int[] randomNumbers){
        /*
        선택정렬 : 가장 작은 것을 선택해서 제일 앞으로 보내면 어떨까?
        */

        int size = randomNumbers.length;
        int i=0;
        int j=0;
        int index =0;
        int temp = 0;

        for(i=0;i<size;i++){
            int min=10000;
            for(j=i;j<size;j++){
                if(min>randomNumbers[j]){
                    min = randomNumbers[j];
                    index = j;
                }
            }
            temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[index];
            randomNumbers[index] = temp;
        }

        return randomNumbers;
    }
}
