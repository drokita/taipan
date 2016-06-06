package com.taipan;

import junit.framework.TestCase;

public class ShipTest extends TestCase {

    Ship ship = new Ship(1000, 500);

    public void testGetCargoHold() throws Exception {
        int result = ship.getCargoHold();
        assertEquals(1000, result);
    }

    public void testGetHpCurrent() throws Exception {
        int result = ship.getHpCurrent();
        assertEquals(500, result);
    }

    public void testGetHpTotal() throws Exception {
        int result = ship.getHpTotal();
        assertEquals(500, result);
    }

    public void testCommitDamage() throws Exception {
        int result = ship.commitDamage(100);
        assertEquals(400, result);
    }

    public void testGetHpTotal2() throws Exception {
        int result = ship.getHpCurrent();
        assertEquals(500, result);
    }

    public void testRepairDamage() throws Exception {
        int result = ship.repairDamage();
        assertEquals(500, result);

    }
}