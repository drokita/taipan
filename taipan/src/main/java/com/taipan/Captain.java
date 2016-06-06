package com.taipan;
import java.lang.Math.*;

public class Captain {
    private String name;
    private int cash = 0;
    private int bank = 0;
    private int debt = 0;

    Messages messages = new Messages();
    Captain(String name, int cash, int bank, int debt) {
        this.name = name;
        this.cash = cash;
        this.bank = bank;
        this.debt = debt;
    }

    public String getName() { return name; }

    public int getCash() { return cash; }

    public int getBank() { return bank; }

    public int getDebt() { return debt; }

    public int commitCash(int amount) {
        try {
            if (cash + amount >= 0) {
                cash = cash + amount;
                return cash;
            } else {
                throw new IllegalArgumentException();
            }
        } catch(IllegalArgumentException exception) {
            messages.printMessage("You don't have enough money for that " + name  + "!");
            return amount - cash;
        }
    }

    public int commitBank(int amount) {
        try {
            if(bank + amount >= 0) {
                bank = bank + amount;
                return bank;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException exception) {
            messages.printMessage("You don't have enough money in the bank for that " + name + "!");
            return amount - bank;
        }
    }

    public int commitDebt(int amount) {
        try {
            if(debt + amount >= 0) {
                debt = debt + amount;
                return debt;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException exception) {
            messages.printMessage("You can't carry negative debt " + name + "!");
            return amount - debt;
        }
    }

    public int commitInterest(double interest) {
        try {
            if (interest <= 0) {
                throw new IllegalArgumentException();
            } else {
                debt = debt + (int)Math.round(debt * interest);
                return debt;
            }
        } catch (IllegalArgumentException exception) {
            messages.printMessage("Interest rate must be greater than zero !");
            return debt;
        }
    }
}
