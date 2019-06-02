package com.isagiongo.katas.tostring;

import org.junit.Assert;
import org.junit.Test;

public class ToStringTest {

    @Test
    public void deveRetornarString(){
        Assert.assertEquals("123", ToString.retornaString(123));
    }
}
