package kg.geektech.les8.players;

import java.util.Random;

public class Tank extends Hero {

    public Tank(int health, int damage) {

        super(health, damage, SuperAbility.TOOK_ONE_FIFTH_OF_DAMAGE);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int oneFifthOfBossDamage = boss.getDamage() / 5;
        if (!boss.isDeafen()) {
            for (Hero hero : heroes) {
                if (hero != this && hero.getHealth() > 0) {
                    hero.setHealth(hero.getHealth() + oneFifthOfBossDamage);
                }

            }
            this.setHealth(this.getHealth() - oneFifthOfBossDamage * heroes.length +
                   + oneFifthOfBossDamage);
            System.out.println("Tank took 1/5 of Boss Damage");
        }
    }


}
