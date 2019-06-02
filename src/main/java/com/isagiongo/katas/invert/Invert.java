package com.isagiongo.katas.invert;

public class Invert {

    public static String invert(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
