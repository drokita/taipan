package com.taipan;
import java.util.Random;

class EnemyShip {
   private int guns;
   private int hp;
   private Enumerations.ShipClass ship_type;
   private int Rand;

   EnemyShip(Enumerations.ShipClass ship_type) {
      this.ship_type = ship_type;
      Random randFactory = new Random();
      switch (ship_type) {
 
        case SCOUT:
            // Generate number of guns min=1 max=2
            guns = randFactory.nextInt(2) + 1;
            // Generate number of hp min=50 max=100
            hp = randFactory.nextInt(51) + 50;
            // Assingn enum string to vairable
            break;

         case BATTLESHIP:
            // Generate number of guns min=3 max=6
            guns = randFactory.nextInt(4) + 3;
            // Generate number of hp min=200 max=400
            hp = randFactory.nextInt(201) + 200;
            break;

         case DESTROYER:
            // Generate number of guns min=2 max=4
            guns = randFactory.nextInt(3) + 2;
            // Generate number of hp min=150 max=300
            hp = randFactory.nextInt(151) + 150;
            break;
    
         case CRUISER:
            // Generate number of guns min=1 max=3
            guns = randFactory.nextInt(3) + 1;
            // Generate number of hp min=100 max=250
            hp = randFactory.nextInt(101) + 150;
            break;
      }
   }
 
   public int getGuns() {
      return guns;
   }

   public int getHp() {
      return hp;
   }

   public String getShipType() { return ship_type.getValue(); }
}

