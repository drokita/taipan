package com.taipan;

import junit.framework.TestCase;

public class CargoTest extends TestCase {
    Cargo cargo = new Cargo(1000);

    public void testVolume() throws Exception {
        int result = cargo.getVolume();
        assertEquals(0, result);
    }

    public void testGuns() throws Exception {
        boolean result = cargo.addGuns(2);
        assertEquals(true, result);
        int result2 = cargo.getGuns();
        assertEquals(2, result2);
    }

    public void testOpium() throws Exception {
        boolean result = cargo.addOpium(10);
        assertEquals(true, result);
        int result2 = cargo.getOpium();
        assertEquals(10,result2);
    }

    public void testSilk() throws Exception {
        boolean result = cargo.addSilk(10);
        assertEquals(true,result);
        int result2 = cargo.getSilk();
        assertEquals(10,result2);
    }

    public void testHashish() throws Exception {
        boolean result = cargo.addHashish(10);
        assertEquals(true, result);
        int result2 = cargo.getHashish();
        assertEquals(10,result2);
    }

    public void testArms() throws Exception {
        boolean result = cargo.addArms(10);
        assertEquals(true, result);
        int result2 = cargo.getArms();
        assertEquals(10, result2);
    }

    public void testGeneral() throws Exception {
        boolean result = cargo.addGeneral(10);
        assertEquals(true, result);
        int result2 = cargo.getGeneral();
        assertEquals(10, result2);
    }
}