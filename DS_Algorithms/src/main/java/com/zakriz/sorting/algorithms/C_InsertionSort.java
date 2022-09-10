package com.zakriz.sorting.algorithms;

public class C_InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1 , -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){

            int nextElement = arr[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i>0 && arr[i-1] > nextElement; i--){

                arr[i] = arr[i-1];
            }
            arr[i] = nextElement;
        }

        for(int j = 0; j< arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
