package com.company;

public class Hero {
    private int halth;
    private int damage;
    private String skill;
    public Hero (int halth, int damage, String skill){
        this.halth = halth;
        this.damage = damage;
        this.skill = skill;
    }
    public Hero(int halth, int damage){
        this.halth = halth;
        this.damage = damage;

    }

    public int getHalth(){
        return halth;
    }
    public void setHalth(){
        this.halth = halth;
    }
    public  int getDamage(){
        return damage;
    }
    public void setDamage(){
        this.damage = damage;
    }
    public String getSkill(){
        return skill;
    }
    public void setSkill(){
        this.skill = skill;
    }

}
