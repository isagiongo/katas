package com.isagiongo.katas.SomaSemMaiorSemMenor;

import org.junit.Assert;
import org.junit.Test;

public class SomaSemMaiorSemMenorTest {

    @Test
    public void deveRetornarSomaSemMaiorSemMenorNumero(){
        Assert.assertEquals(5, SomaSemMaiorSemMenor.soma(new int []{1,2,3,4}));
        Assert.assertEquals(24, SomaSemMaiorSemMenor.soma(new int []{12,4,6,8,10}));
        Assert.assertEquals(21, SomaSemMaiorSemMenor.soma(new int []{11,15,10,2}));
    }
}
