package com.isagiongo.katas.squaresum;

import org.junit.Assert;
import org.junit.Test;

public class SquareSumTest {

    @Test
    public void deveRetornarSomaDosQuadrados() {
        int[] array = new int[]{1, 1, 2};
        Assert.assertSame(6, SquareSum.calculateSquare(array));

    }

}
