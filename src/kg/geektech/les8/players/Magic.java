package kg.geektech.les8.players;

public class Magic extends Hero{

    public Magic(int health, int damage) {

        super(health, damage, SuperAbility.BOOST);
    }

   //@Override
    //public void applySuperAbility(Boss boss, Hero[] heroes) {


    //}


    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getDamage() > 0)
                heroes[i].setDamage(heroes[i].getDamage() + 10);



        }
        System.out.println("Magic increased everyones atack on 10");
    }

}
