package com.ues21;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import com.ues21.algoritmos.Quicksort;
import com.ues21.algoritmos.Shellsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int[] hundredIntegers = generateRandomArray(100);
        final int[] thousandIntegers = generateRandomArray(1000);
        final int[] tensThousandIntegers = generateRandomArray(10000);
        final int[] hundredThousandsIntegers = generateRandomArray(100000);
        final int[] millionIntegers = generateRandomArray(1000000);
        final List<int[]> arrays = new ArrayList<>();
        arrays.add(hundredIntegers);
        arrays.add(thousandIntegers);
        arrays.add(tensThousandIntegers);
        arrays.add(hundredThousandsIntegers);
        arrays.add(millionIntegers);
        testShellSort(arrays);
        testQuickSort(arrays);
    }

    private static void testQuickSort(List<int[]> integersList) {
        for (int[] integers :  integersList) {
            executeQuickSort(integers);
        }
    }

    private static void executeQuickSort(int[] integers) {
        long startTime = System.currentTimeMillis();
        Quicksort.quicksort(integers, integers[0], integers[integers.length - 1]);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Performance using quicksort for " + integers.length + " items is: " + elapsedTime + "ms.");
    }

    private static void testShellSort(List<int[]> integersList) {
        for (int[] integers : integersList) {
            executeShellsort(integers);
        }
    }

    private static int[] generateRandomArray(int n){
        int[] integers = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integers[i] = random.nextInt(1000);
        }
        return integers;
    }

    private static void executeShellsort(int[] integers) {
        long startTime = System.currentTimeMillis();
        Shellsort.shellsort(integers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Performance using shellsort for " + integers.length + " items is: " + elapsedTime + "ms.");
    }
}
