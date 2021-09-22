package kg.geektech.les8.players;

import java.util.Random;

public class TrickyBastard extends Hero {
    private int health;

    @Override
    public int getHealth() {
        return health;
    }

    public TrickyBastard(int health, int damage) {

        super(health, damage, SuperAbility.PRETENDS_DEAD);
        this.health=health;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {


        Random r = new Random();
       if (r.nextInt(4)==1){
       if (this.getHealth()>0){
           health=this.getHealth();
       }
       this.setHealth(0);
           System.out.println("TrickyBastard pretended dead");
       }else{
           this.setHealth(health);
       }
    }
}
