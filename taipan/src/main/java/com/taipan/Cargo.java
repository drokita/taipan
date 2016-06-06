package com.taipan;
import java.util.HashMap;


// Need to add remove methods

class Cargo {
   private int guns;
   private int opium;
   private int silk;
   private int hashish;
   private int arms;
   private int general;
   private int gun_volume = 10;
   private int volume;
   private int cargo_hold;

   Cargo(int cargo_hold ) {
      this.cargo_hold = cargo_hold;
   }

   private HashMap<String, Integer> allCargo = new HashMap<String, Integer>();

   public int getVolume() {
       volume = (guns * gun_volume) + opium + silk + hashish + arms + general;
       return volume;
   }

   public int getCargoHold() { return cargo_hold; }

   public int getGuns() {
      return guns;
   }

   public int getOpium() {
      return opium;
   }

   public int getSilk() {
      return silk;
   }

   public int getHashish() {
      return hashish;
   }
   
   public int getArms() {
      return arms;
   }
   
   public int getGeneral() {
      return general;
   }

   public HashMap<String, Integer> getAllCargo() {
      allCargo.put("guns", guns);
      allCargo.put("opium",opium);
      allCargo.put("silk",silk);
      allCargo.put("hashish",hashish);
      allCargo.put("arms", arms);
      allCargo.put("gener2al",general);
      
      return allCargo;
   }

   public boolean addGuns(int number) {
      int request = number * gun_volume;
      if(checkCargoHold(request)) {
         guns = guns + number;
         return true;
      } else {
         return false;
      }
   }

   public boolean addOpium(int request) {
      if(checkCargoHold(request)) {
         opium = opium + request;
         return true;
      } else {
         return false;
      }
   }

   public boolean addSilk(int request) {
      if(checkCargoHold(request)) {
         silk = silk + request;
         return true;
      } else {
         return false;
      }
   }

   public boolean addHashish(int request) {
      if(checkCargoHold(request)) {
         hashish = hashish + request;
         return true;
      } else {
         return false;
      }
   }

   public boolean addArms(int request) {
      if(checkCargoHold(request)) {
         arms = arms + request;
         return true;
      } else {
         return false;
      }
   }

   public boolean addGeneral(int request) {
      if(checkCargoHold(request)) {
         general = general + request;
         return true;
      } else {
         return false;
      }
   }

   private boolean checkCargoHold(int request) {
      if (((guns * gun_volume) + opium + silk + hashish + arms + general + request) <= cargo_hold) {
         return true;
      } else {
         return false;
      }
   }
}
