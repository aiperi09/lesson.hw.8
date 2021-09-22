package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        //создать рандом ген сл число зен взять атаку дамаг война и умнож на число

        int rand = (int) ((Math.random() * 4) + 2);
        //boss.setHealth(boss.getHealth()+this.getDamage())-
        this.setDamage(this.getDamage()*rand);
        System.out.println("Warrior crits");
    }
}
