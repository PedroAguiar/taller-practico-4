package com.ues21.algoritmos;

public class Quicksort {
    private static final int CUTOFF = 10;

    public static void quicksort(int[] a, int low, int high) {
        if(low + CUTOFF > high) {
            insertionSort(a, low, high);
        } else {
            // Sort low, middle, high
            int middle = (low + high) / 2;
            if(a[middle] < a[low]) {
                swapReferences(a, low, middle);
            }
            if(a[high] < a[low]) {
                swapReferences(a, low, high);
            }
            if(a[high] < a[middle]) {
                swapReferences(a, middle, high);
            }
            swapReferences(a, middle, high - 1);
            int pivot = a[high - 1];
            int i, j;
            for(i = low, j = high - 1;;) {
                while(a[++i] <  pivot);
                while(pivot < a[--j]);
                if(i < j) {
                    swapReferences( a, i, j );
                } else {
                    break;
                }
            }
            swapReferences(a, i,high - 1);
            quicksort(a, low,i - 1);
            quicksort(a,i + 1, high);
        }
    }

    private static void swapReferences(int[] a, int index1, int index2) {
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }

    private static void insertionSort(int[] a, int low, int high) {
        for(int p = low + 1; p <= high; p++) {
            int tmp = a[p];
            int j;
            for(j = p; j > low && tmp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

}
