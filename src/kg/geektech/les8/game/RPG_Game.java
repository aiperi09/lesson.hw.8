package kg.geektech.les8.game;

import kg.geektech.les8.players.*;

import java.util.Random;

public class RPG_Game {

    public static void start() {
        Boss boss = new Boss(700, 50);
        Tank tank = new Tank(400, 5);
        TrickyBastard bastard = new TrickyBastard(280, 20);
        Witcher witcher = new Witcher(130, 0);
        Boxer boxer = new Boxer(100, 10);
        Thor thor = new Thor(220, 15);
        Warrior warrior = new Warrior(250, 15);
        Hunter hunter = new Hunter(260, 10);
        Medic doctor = new Medic(230, 10, 15);
        Magic magic = new Magic(270, 20);
        Medic youngDr = new Medic(290, 20, 5);
        Hero[] heroes = {warrior, tank, bastard, boxer, witcher, thor, hunter, doctor, magic, youngDr};


        int roundNumber = 0;

        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            roundNumber++;
            System.out.println("ROUND: " + roundNumber);
            round(boss, heroes);
        }

    }

    private static void round(Boss boss, Hero[] heroes) {

        if (boss.getHealth() > 0 && !boss.isDeafen()) {
            bossHits(boss, heroes);
        }

        heroesHit(boss, heroes);
        applySuperAb(boss, heroes);
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {

        System.out.println("---------------");
        System.out.println("Boss health: " + boss.getHealth());
        for (int i = 0; i < heroes.length; i++) {

            System.out.println(heroes[i].getClass().getSimpleName() +
                    " health: " + heroes[i].getHealth());

        }
        System.out.println("---------------");
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(
                        heroes[i].getHealth() - boss.getDamage());

            }
        }

    }

    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }


    private static void applySuperAb(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].applySuperAbility(boss, heroes);
            }
        }
    }

}
