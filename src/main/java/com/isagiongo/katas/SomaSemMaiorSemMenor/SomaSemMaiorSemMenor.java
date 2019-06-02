package com.isagiongo.katas.SomaSemMaiorSemMenor;

import java.util.Arrays;

public class SomaSemMaiorSemMenor {

    public static int soma(int[] numeros) {
        if (numeros == null || numeros.length < 2) return 0;
        Arrays.sort(numeros);
        return Arrays.stream(numeros).skip(1).limit(numeros.length-2).sum();
    }
}
