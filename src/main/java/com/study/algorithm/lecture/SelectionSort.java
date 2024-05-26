package com.study.algorithm.lecture;

import ch.qos.logback.classic.Level;
import com.study.algorithm.common.RandomNumbers;

import java.util.*;
import java.util.logging.Logger;

public class SelectionSort {

    private static final Logger LOGGER = Logger.getLogger(SelectionSort.class.getName());

    public static void main(String[] args){
        int[]  randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println(" ");
        SelectionSort sorter = new SelectionSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] randomNumbers){
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
