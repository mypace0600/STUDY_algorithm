package com.study.algorithm.question;

import com.study.algorithm.common.RandomNumbers;


public class Question1 {

    public static void main(String[] args){
        int[] randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<randomNumbers.length;i++){
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.print("\n");
        Question1 sorter = new Question1();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<randomNumbers.length;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] arr){
        int randomNumber = RandomNumbers.makeRandomNumber(10,9);
        System.out.println(randomNumber);
        for(int i=0;i<arr.length;i++){
            arr[i]-=randomNumber;
        }
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            int min = 10001;
            int index = 0;
            for(int j=i;j<arr.length;j++){
                int abs = Math.abs(arr[j]);
                if(abs<min){
                    min = abs;
                    index = j;
                } else if(abs == min){
                    if(arr[index]<arr[j]){
                        index = j;
                    }
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]+=randomNumber;
        }
        return arr;
    }
}
