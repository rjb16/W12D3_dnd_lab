package player;

import behaviours.Melee;

public class Dwarf extends Player implements Melee {
    public Dwarf(int healthPoints, String weapon) {
        super(healthPoints);
        this.weapon = weapon;
        this.damageResistance = 1;
    }

    public String fight() {
        return "Dwarf is fighting";
    }

    public void changeWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fightEnemy() {
        System.out.println(fight());
        takeDamage();
        if (healthPoints <= 0) {
            System.out.println("You have died! Your total loot was " + getLoot() + " gold pieces");
        } else {
            System.out.println("Dwarf has killed the " + currentRoom.getEnemy().getName());
        }
    }
}
