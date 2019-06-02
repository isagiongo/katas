package com.isagiongo.katas.growthpopulation;

import org.junit.Assert;
import org.junit.Test;

public class GrowthPopulationTest {

    @Test
    public void deveRetornar3AnosParaPopulacaoSuperarMaximo() {
        Assert.assertSame(3, GrowthPopulation.countYears(1000, 2.0, 50, 1200));
    }
}
