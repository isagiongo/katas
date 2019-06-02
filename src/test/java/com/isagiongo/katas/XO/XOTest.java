package com.isagiongo.katas.XO;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XOTest {

    @Test
    public void deveRetornarTrueComXsIguaisAOs(){
        String string = "xXxggrqw51626OoO";
        assertTrue(XO.getXO(string));
    }

    @Test
    public void deveRertornarFalseComXsDiferentesDeOs(){
        String string = "Xxtqrwtqtwfs156512XojhhdhwjehwjehO";
        assertFalse(XO.getXO(string));
    }
}
