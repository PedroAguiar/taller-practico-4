package com.ues21;

import com.ues21.algoritmos.Quicksort;
import com.ues21.algoritmos.Shellsort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        testSortingWithOrderedArrays();
        testSortingWithUnOrderedArrays();
    }

    private static void testSortingWithUnOrderedArrays() {
        final int[] tenIntegers = generateRandomArray(10);
        final int[] hundredIntegers = generateRandomArray(100);
        final int[] thousandIntegers = generateRandomArray(1000);
        final int[] tenThousandIntegers = generateRandomArray(10_000);
        final int[] hundredThousandsIntegers = generateRandomArray(100_000);
        final int[] millionIntegers = generateRandomArray(1_000_000);
        final int[] tenMillionIntegers = generateRandomArray(10_000_000);
        final int[] hundredMillionIntegers = generateRandomArray(100_000_000);


        final List<int[]> unorderedArrays = new ArrayList<>();
        unorderedArrays.add(tenIntegers);
        unorderedArrays.add(hundredIntegers);
        unorderedArrays.add(thousandIntegers);
        unorderedArrays.add(tenThousandIntegers);
        unorderedArrays.add(hundredThousandsIntegers);
        unorderedArrays.add(millionIntegers);
        unorderedArrays.add(tenMillionIntegers);
        unorderedArrays.add(hundredMillionIntegers);

        testShellSort(unorderedArrays);
        testQuickSort(unorderedArrays);
    }

    private static void testSortingWithOrderedArrays() {
        final int[] orderedTenIntegers = generateRandomArray(10);
        final int[] orderedHundredIntegers = generateRandomArray(100);
        final int[] orderedThousandIntegers = generateRandomArray(1000);
        final int[] orderedTenThousandIntegers = generateRandomArray(10_000);
        final int[] orderedHundredThousandsIntegers = generateRandomArray(100_000);
        final int[] orderedMillionIntegers = generateRandomArray(1_000_000);
        final int[] orderedTenMillionIntegers = generateRandomArray(10_000_000);
        final int[] orderedHundredMillionIntegers = generateRandomArray(100_000_000);


        Arrays.sort(orderedTenIntegers);
        Arrays.sort(orderedHundredIntegers);
        Arrays.sort(orderedThousandIntegers);
        Arrays.sort(orderedTenThousandIntegers);
        Arrays.sort(orderedHundredThousandsIntegers);
        Arrays.sort(orderedMillionIntegers);
        Arrays.sort(orderedTenMillionIntegers);
        Arrays.sort(orderedHundredMillionIntegers);


        final List<int[]> orderedArrays = new ArrayList<>();
        orderedArrays.add(orderedTenIntegers);
        orderedArrays.add(orderedHundredIntegers);
        orderedArrays.add(orderedThousandIntegers);
        orderedArrays.add(orderedTenThousandIntegers);
        orderedArrays.add(orderedHundredThousandsIntegers);
        orderedArrays.add(orderedMillionIntegers);
        orderedArrays.add(orderedTenMillionIntegers);
        orderedArrays.add(orderedHundredMillionIntegers);

        testShellSort(orderedArrays);
        testQuickSort(orderedArrays);
    }

    private static void testQuickSort(List<int[]> integersList) {
        for (int[] integers :  integersList) {
            executeQuickSort(integers);
        }
    }

    private static void executeQuickSort(int[] integers) {
        long startTime = System.currentTimeMillis();
        Quicksort.sort(integers);
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
