package com.taipan;

/**
 * Taipan - An Interpretation of the Classic Apple IIe Game
 *
 * Class Description of Ship
 * @author David M. Rokita
 * @version 0.9 June 01, 2016
 *
 * This class produces a Ship object.  The Ship object is instatiated with
 * cargo_hold and hp_total where cargo_hold is the total value of cargo that
 * the ship can hold.  The Ship also has a field of hp_total.  This is the
 * total number of damage points that the Ship can take.  Finally, hp_current
 * is the current number of hit points that the Ship has after taking damage
 */

public class Ship {
    /** cargo_hold is the total volume of the cargo_hold */
    private int cargo_hold;
    /** hp_total is the total number of hit point when health is 100% */
    private int hp_total;
    /** hp_current is the number of hit_points total minus an damage taken */
    private int hp_current;

    /** Ship Constructor
     * @param cargo_hold
     * @param hp_total */
    Ship(int cargo_hold, int hp_total ) {
        this.cargo_hold = cargo_hold;
        this.hp_total = hp_total;
        this.hp_current = hp_total;
    }

    /** getCargoHold()
     * @return cargo_hold */
    public int getCargoHold() {
        return cargo_hold;
    }

    /** getHpCurrent()
     * @return hp_current */
    public int getHpCurrent() { return hp_current; }

    /** getHpTotal()
     * @return hp_total */
    public int getHpTotal() { return hp_total; }

    /** commitDamage
     * @param damage Number of dmage hit points
     * @return hp_current */
    public int commitDamage(int damage) {
        if ( hp_current - damage > 0 ) {
            hp_current = hp_current - damage;
        } else {
            hp_current = 0;
        }
        return hp_current;
    }

    /** repairDamage
     * @return hp_current */
    public int repairDamage() {
        hp_current = hp_total;
        return hp_current;
    }
}
