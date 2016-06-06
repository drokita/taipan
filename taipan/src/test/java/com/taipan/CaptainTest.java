package com.taipan;

import junit.framework.TestCase;

public class CaptainTest extends TestCase {
    public void testGetName() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        String result = captain.getName();
        assertEquals("Taipan", result);
    }

    public void testGetCash() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.getCash();
        assertEquals(10000, result);
    }

    public void testGetBank() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.getBank();
        assertEquals(2100, result);
    }

    public void testGetDebt() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.getDebt();
        assertEquals(3500, result);
    }

    public void testCommitCash() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.commitCash(100);
        assertEquals(10100,result);
    }

    public void testCommitCashException() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        try {
            int result = captain.commitCash(-20000);
            // assertEquals(1000000, result);
        } catch (IllegalArgumentException exception) {
            String result = "IllegalArgumentException";
            assertEquals("IllegalArgumentException", result);
        }
    }

    public void testCommitBank() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.commitBank(100); {
            assertEquals(2200, result);
        }
    }

    public void testCommitBankException() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        try {
            int result = captain.commitBank(-20000);
        } catch (IllegalArgumentException exception) {
            String result = "IllegalArgumentException";
            assertEquals("IllegalArgumentEception", result);
        }
    }

    public void testCommitDebt() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.commitDebt(200); {
            assertEquals(3700, result);
        }
    }

    public void testCommitInterest() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        int result = captain.commitInterest(.10); {
            assertEquals(3850, result);
        }
    }

    public void testCommitDebtException() throws Exception {
        Captain captain = new Captain("Taipan", 10000, 2100, 3500);
        try {
            int result = captain.commitDebt(-20000);
        } catch (IllegalArgumentException exception) {
            String result = "IllegalArgumentException";
            assertEquals("IllegalArguemntEception", result);
        }
    }
}