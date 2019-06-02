package com.isagiongo.katas.invert;

import org.junit.Assert;
import org.junit.Test;

public class InvertTest {

    @Test
    public void deveRetornarPalavraInvertida(){
        Assert.assertEquals("drow", Invert.invert("word"));
        Assert.assertEquals("arodasI", Invert.invert("Isadora"));
        Assert.assertEquals("edcba", Invert.invert("abcde"));
    }
}
