package com.isagiongo.katas.squaresum;

import java.util.List;

public class SquareSum {

    public static int calculateSquare(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i] * numeros[i];
        }
        return sum;
    }
}

