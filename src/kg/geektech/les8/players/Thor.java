package kg.geektech.les8.players;


import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (new Random().nextInt(2)==1){
            System.out.println("Thor deafen the Boss");
            boss.setDeafen(true);
        }else{
            boss.setDeafen(false);
        }


    }
}


