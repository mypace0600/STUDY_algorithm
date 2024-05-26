package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

public class QuickSort {

    public static void main(String[] args){
        int[]  randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);
        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println(" ");
        QuickSort sorter = new QuickSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    private void quickSort(int[] data, int start, int end){
        if (start >= end) { // 원소가 1개인 경우
            return;
        }

        int key = start; // 키는 첫번째 원소
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) { // 엇갈릴 때까지 반복
            while (i <= end && data[i] <= data[key]) { // 키값보다 큰 값을 만날 때 까지 이동
                i++;
            }
            while (j > start && data[j] >= data[key]) { // 키값보다 작은 값을 만날 때 까지 이동
                j--;
            }
            if (i > j) { // 현재 엇갈린 상태면 키값과 교체
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }

        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    private int[] solution(int[] array){
        /*
        퀵정렬 : 분할정복 알고리즘으로 평균 속도가 O(N*logN) 입니다.
                특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나누면 어떨까?
                보통 기준값(pivot)을 맨 첫번째 값으로 설정함.
                하지만 기준값을 잘못 설정하게 되면 O(N^2)로 느려진다.
        */
        quickSort(array, 0, array.length - 1); // 끝 인덱스 수정
        return array;
    }
}