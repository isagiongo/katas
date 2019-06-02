package com.isagiongo.katas.pin;

import org.junit.Assert;
import org.junit.Test;

public class ValidatePinTest {

    @Test
    public void deveValidarPin(){
        Assert.assertTrue(ValidatePin.valid("1234"));
        Assert.assertTrue(ValidatePin.valid("123456"));

        Assert.assertFalse(ValidatePin.valid("lalala1234"));
        Assert.assertFalse(ValidatePin.valid("nowork1234nowork"));
    }

}
