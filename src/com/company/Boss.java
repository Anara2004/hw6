
package com.company;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }

}