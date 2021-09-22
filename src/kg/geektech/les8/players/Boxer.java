package kg.geektech.les8.players;

import java.util.Random;

public class Boxer extends Hero {

    public Boxer(int health, int damage) {
        super(health, damage, SuperAbility.KNOCKOUT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int knockout = r.nextInt(2);
        int bossDamage = boss.getDamage();
        if (knockout == 1){
            boss.setDamage(0);
            System.out.println("Boxer sent in knockout Boss");}
        else {
            boss.setDamage(50);
        }
        }
    }

