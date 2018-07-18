package com.ues21.algoritmos;

public class Shellsort {

    public static void shellsort (int[] a) {
        for (int intervalo = a.length / 2; intervalo > 0; intervalo = increment(intervalo)) {
            for (int i = intervalo; i < a.length; i++ ) {
                int temp = a[i];
                int j = i;
                for (;j >= intervalo && temp < a[j - intervalo]; j -= intervalo) {
                    a [j] = a[j - intervalo];
                }
                a[j] = temp;
            }
        }
    }

    private static int increment(int intervalo) {
        return intervalo == 2 ? 1 : (int) (intervalo / 2.2);
    }
}
