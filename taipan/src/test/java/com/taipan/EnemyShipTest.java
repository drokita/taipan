package com.taipan;

import junit.framework.TestCase;

public class EnemyShipTest extends TestCase {
    public void testEnemyShip() {
        for(Enumerations.ShipClass st : Enumerations.ShipClass.values()) {
            for (int i=0; i < 100; i++) {
                EnemyShip new_ship = new EnemyShip(st);
                String ship_type = new_ship.getShipType();
                int guns = new_ship.getGuns();
                int hp = new_ship.getHp();

                switch (st) {
                    case BATTLESHIP:
                        assertTrue(guns >= 3 && guns <= 6);
                        assertTrue(hp >= 200 && hp <= 400);
                        assertEquals("Battleship", ship_type);
                        break;
                    case CRUISER:
                        assertTrue(guns >= 1 && guns <= 3);
                        assertTrue(hp >= 100 && hp <= 250);
                        assertEquals("Cruiser", ship_type);
                        break;
                    case SCOUT:
                        assertTrue(guns >= 1 && guns <= 2);
                        assertTrue(hp >= 50 && hp <= 100);
                        assertEquals("Scout", ship_type);
                        break;
                    case DESTROYER:
                        assertTrue(guns >= 2 && guns <= 4);
                        assertTrue(hp >= 150 && hp <= 300);
                        assertEquals("Destroyer", ship_type);
                        break;
                }
            }
        }
    }
}