package com.study.algorithm.question;


public class Question3 {

    public static void main(String[] args){
        int[] randomNumbers = {6,10,2};;
        for(int i=0;i<randomNumbers.length;i++){
            System.out.print(randomNumbers[i]+" ");
        }
        System.out.print("\n");
        Question3 sorter = new Question3();
        String result = sorter.solution(randomNumbers);

        System.out.print(result);

    }

    private static int compare(String a, String b) {
        String order1 = a + b;
        String order2 = b + a;
        return order1.compareTo(order2);
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) > 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private String solution(int[] numbers){
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        quickSort(strNumbers, 0, strNumbers.length - 1);
        StringBuilder result = new StringBuilder();
        for (String str : strNumbers) {
            result.append(str);
        }

        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}
