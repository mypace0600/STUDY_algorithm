package com.study.algorithm.lecture;

import com.study.algorithm.common.RandomNumbers;

import java.util.logging.Logger;

public class HeapSort {


    private static final Logger LOGGER = Logger.getLogger(HeapSort.class.getName());

    public static void main(String[] args){
        int[] randomNumbers = RandomNumbers.makeDistinctRandomNumbers(10, 9);
        for(int i=0; i<10; i++){
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.print("\n");

        HeapSort sorter = new HeapSort();
        sorter.solution(randomNumbers);
        for(int i=0; i<10; i++){
            System.out.print(randomNumbers[i] + " ");
        }
    }

    private void solution(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
