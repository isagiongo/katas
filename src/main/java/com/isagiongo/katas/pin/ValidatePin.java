package com.isagiongo.katas.pin;

public class ValidatePin {

    public static boolean valid(String pin){
        return pin.matches("\\d{4}|\\d{6}");
    }
}
