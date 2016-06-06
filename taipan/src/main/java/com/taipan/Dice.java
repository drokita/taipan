package com.taipan;
import java.util.Random;

class Dice {
  private int result;
  private int sum;
 
  public int rollDice(int number, int faces) {
     sum = 0;
     for ( int i = 0; i < number; i++ ) {
        result = new Random().nextInt(faces) + 1;
        sum = sum + result;
      }    
      return sum;
   }
}    
