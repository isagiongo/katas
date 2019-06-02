package com.isagiongo.katas.OppositeNumber;

import org.junit.Assert;
import org.junit.Test;

public class OppositeNumberTest {

    @Test
    public void deveRetornarNumeroOposto(){

        Assert.assertEquals(25.0, OppositeNumber.opposite(-25.0), 0.0);
        Assert.assertEquals(-18.0, OppositeNumber.opposite(18.0), 0.0);
    }
}
