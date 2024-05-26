package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {

    private static final Logger LOGGER = Logger.getLogger(SelectionSort.class.getName());

    public static void main(String[] args){
        int[]  randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.print("\n");

        BubbleSort sorter = new BubbleSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] array){
        /*
        버블정렬 : 옆의 값과 비교해서 더 작은 값을 앞으로 보낸다.
        */
        int i=0;
        int j=0;
        int temp=0;
        int size = array.length;
        for(i=0;i<size;i++){
            for(j=0;j<size-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
