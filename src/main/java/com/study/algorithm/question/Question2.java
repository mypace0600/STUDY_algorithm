package com.study.algorithm.question;

import com.study.algorithm.common.RandomNumbers;

import java.util.Collections;

public class Question2 {

    public static void main(String[] args){
        int[] randomNumbers = {1,5,2,6,3,7,4};;
        for(int i=0;i<randomNumbers.length;i++){
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.print("\n");
        Question2 sorter = new Question2();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<sortedNumbers.length;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private int[] solution(int[] arr){
        int[][] brr = {{2,5,3},{4,4,1},{1,7,3}};
        int[] result = new int[brr.length];
        for(int i=0;i<brr.length;i++){
            int[] crr = new int[100];
            int s = brr[i][0]-1;
            int e = brr[i][1];
            int target = brr[i][2]-1;
            int index = 0;
            for(int j=s;j<e;j++){
                crr[index] = arr[j];
                index++;
            };
            int temp = 0;
            for(int t=0;t<index;t++){
                int min = 101;
                int cIndex = 0;
                for(int v=t;v<index;v++){
                    if(crr[v]<min){
                        min = crr[v];
                        cIndex = v;
                    }
                }
                temp = crr[t];
                crr[t] = crr[cIndex];
                crr[cIndex] = temp;
            }
            result[i] = crr[target];
        }
        return result;
    }
}
