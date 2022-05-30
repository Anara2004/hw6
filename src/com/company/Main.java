package com.company;

public class Main {


    public static void main(String[] args) {


        Boss boss = new Boss(new Weapon("gunshot","gun"));
        boss.setDamage(70);
        boss.setHealth(500); 


        System.out.println("Boss damage: " + boss.getDamage() + ", " + "Boss health: " + boss.getHealth() + " TypeWeapon: " + boss.getWeapon().getTypeWeapon() + ", " + " nameWeapon: "
                + boss.getWeapon().getNameWeapon() + ". ");
    }

}