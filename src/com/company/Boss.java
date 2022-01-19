package com.company;

public class Boss {
    private int halth;
    private int damage;
    private String skill;

    public Boss(int halth, int damage, String skill){
        this.halth = halth;
        this.damage = damage;
        this.skill = skill;

    }

    public int getHalht(){
        return halth;
    }
    public void setHalht(){
        this.halth = halth;
    }
    public int getDamage(){
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
