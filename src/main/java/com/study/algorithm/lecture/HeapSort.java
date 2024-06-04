package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

import java.util.logging.Logger;

public class HeapSort {


    private static final Logger LOGGER = Logger.getLogger(SelectionSort.class.getName());

    public static void main(String[] args){
        int[]  randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.print("\n");

        HeapSort sorter = new HeapSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] array){

    }
}
