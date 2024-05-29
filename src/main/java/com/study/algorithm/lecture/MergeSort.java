package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

public class MergeSort {

    static  int[]  randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10,9);

    public static void main(String[] args){

        for(int i=0;i<10;i++){
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println(" ");
        MergeSort sorter = new MergeSort();
        int[] sortedNumbers = sorter.solution(randomNumbers);
        for(int i=0;i<10;i++){
            System.out.print(sortedNumbers[i]+" ");
        }
    }

    public int[] sortedArr = new int[randomNumbers.length];

    private void merge(int a[], int m, int middle, int n){
        int i = m;
        int j = middle+1;
        int k = m;

        while(i<=middle && j<=n){
            if(a[i]<=a[j]){
                sortedArr[k]=a[i];
                i++;
            } else {
                sortedArr[k]=a[j];
                j++;
            }
            k++;
        }

        if(i>middle){
            for(int t=j;t<=n;t++){
                sortedArr[k]=a[t];
                k++;
            }
        } else {
            for(int t=i;t<=middle;t++){
                sortedArr[k]=a[t];
                k++;
            }
        }

        for(int t=m;t<=n;t++){
            a[t] = sortedArr[t];
        }
    }

    private void mergeSort(int a[],int m,int n){
        if(m<n){
            int middle = (m+n)/2;
            mergeSort(a,m,middle);
            mergeSort(a,middle+1,n);
            merge(a,m,middle,n);
        }
    }

    private int[] solution(int[] arr){
        /*
        * 병합정렬 : 일단 반으로 나누고 나중에 합쳐서 정렬하면 어떨까?
        */
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
}
