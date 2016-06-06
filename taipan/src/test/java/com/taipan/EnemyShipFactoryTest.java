package com.taipan;

import junit.framework.TestCase;

public class EnemyShipFactoryTest extends TestCase {
    public void testCreateEnemyShip() throws Exception {
        EnemyShipFactory ship_factory = new EnemyShipFactory();
        for(int i=0;i<1000;i++){
            EnemyShip new_ship = ship_factory.createEnemyShip();
            String ship_type = new_ship.getShipType();
            int hp = new_ship.getHp();
            int guns = new_ship.getGuns();

            assertTrue(ship_type.equals("Battleship") || ship_type.equals("Cruiser") || ship_type.equals("Scout") || ship_type.equals("Destroyer"));

        }
    }
}