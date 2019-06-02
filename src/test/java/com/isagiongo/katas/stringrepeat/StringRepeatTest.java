package com.isagiongo.katas.stringrepeat;

import org.junit.Assert;
import org.junit.Test;

public class StringRepeatTest {

    @Test
    public void deveRepetirString(){
        Assert.assertEquals("HelloHelloHello", StringRepeat.repeat(3, "Hello"));
    }
}
