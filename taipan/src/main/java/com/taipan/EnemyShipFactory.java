package com.taipan;
import java.util.Random;

public class EnemyShipFactory {
    private Random randGenerator = new Random();
    //private String ship_type[] = {"Battleship", "Destroyer", "Cruiser", "Scout"};
    private Enumerations.ShipClass ship_type;
    public EnemyShip createEnemyShip() {
        int rand = randGenerator.nextInt(ship_type.values().length);
        EnemyShip new_ship = new EnemyShip(ship_type.values()[rand]);
        return new_ship;
    }
}