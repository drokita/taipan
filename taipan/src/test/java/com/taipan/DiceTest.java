package com.taipan;

import junit.framework.TestCase;

public class DiceTest extends TestCase {

    public void testRollDice() throws Exception {
        Dice bones = new Dice();
        int result;

        for (int i = 0; i < 10000; i++) {
            result = bones.rollDice(2, 4);
            assertTrue(result >= 2 && result <= 8);
            // System.out.println(result);

            result = bones.rollDice(2, 6);
            assertTrue(result >= 2 && result <= 12);
            // System.out.println(result);

            result = bones.rollDice(2, 8);
            assertTrue(result >= 2 && result <= 16);
            // System.out.println(result);

            result = bones.rollDice(2, 10);
            assertTrue(result >= 2 && result <= 20);
            // System.out.println(result);

            result = bones.rollDice(2, 12);
            assertTrue(result >= 2 && result <= 24);
            // System.out.println(result);

            result = bones.rollDice(2, 20);
            assertTrue(result >= 2 && result <= 40);
            // System.out.println(result);

            result = bones.rollDice(2, 100);
            assertTrue(result >= 1 && result <= 200);
            // System.out.println(result);
        }
    }
}