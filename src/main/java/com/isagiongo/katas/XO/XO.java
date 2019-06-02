package com.isagiongo.katas.XO;

public class XO {

    public static Boolean getXO(String string) {
        string = string.toLowerCase();
        return string.replace("x", "").length() == string.replace("o","").length();
    }
}
