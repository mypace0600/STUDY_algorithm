package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

public class InsertionSort {

    public static void main(String[] args){
        int[] randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println(" ");
        InsertionSort sorter = new InsertionSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] array){
        /*
        삽입정렬 : 각 숫자를 적절한 위치에 삽입하면 어떨까? 필요할 때만 위치를 바꾼다.
        */
        int i,j,temp;
        int size = array.length;
        for(i=0;i<size-1;i++){
            j=i;
            while(j>=0 && array[j] > array[j+1]){
                temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                j--;
            }
        }

        return array;
    }
}
