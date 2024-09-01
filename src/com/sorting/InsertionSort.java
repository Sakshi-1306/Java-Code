package com.sorting;

import java.util.*;
public class InsertionSort{
    public static void PrintArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        //Insertion Sort
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
           arr[j+1] = current;
        }
      PrintArray(arr);
    }
}