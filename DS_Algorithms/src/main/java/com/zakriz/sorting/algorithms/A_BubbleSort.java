package com.zakriz.sorting.algorithms;

public class A_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1 , -22};

        for(int lastSortedIndex = arr.length-1; lastSortedIndex > 0; lastSortedIndex--){

            for(int i = 0; i < lastSortedIndex; i++){

                if(arr[i] >  arr[i+1]){
                    swap(arr, i , i+1);
                }
            }
        }
        for(int j = 0; j< arr.length; j++){
            System.out.println(arr[j]);
        }
    }

    public static void swap(int[] arr, int i , int j){

        if(i == j)return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
