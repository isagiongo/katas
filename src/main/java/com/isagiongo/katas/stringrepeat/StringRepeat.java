package com.isagiongo.katas.stringrepeat;

public class StringRepeat {

    public static String repeat(int quantidade, String palavra) {

        StringBuilder string  = new StringBuilder();
        for (int i = 0; i < quantidade ; i++) {
            string.append(palavra);
        }
        return string.toString();
    }
}
