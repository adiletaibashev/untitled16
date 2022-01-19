package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(100,50,"sas");
        int bossHalth = boss.getHalht();
        int bossDamage = boss.getDamage();
        String bossSkill = boss.getSkill();
        System.out.println("жизнь босса " + bossHalth + "урон босса " +
                bossDamage + "скилл босса " + bossSkill);
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHalth() + " " +
                    createHeroes()[i].getDamage() + " " + createHeroes()[i].getSkill());
        }

    }
    public  static Herro[] createHeroes(){
        Herro ursa = new Herro(100, 20,"hohma");
        int ursaHalth = ursa.getHalth();
        int ursaDamage = ursa.getDamage();
        String ursaSkill = ursa.getSkill();

        Herro titan = new Herro(150,30,"shapalak");
        int titanHalth = titan.getHalth();
        int titanDamage = titan.getDamage();
        String titanSkill = titan.getSkill();

        Herro sabziro = new Herro(110,45,"chainik");
        int sabziroHalth = sabziro.getHalth();
        int sabziroDamage = sabziro.getDamage();
        String sabziroSkill = sabziro.getSkill();

         Herro[] heroes = {ursa,titan,sabziro };
         return heroes;
    }
}
