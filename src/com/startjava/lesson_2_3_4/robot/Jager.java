package com.startjava.lesson_2_3_4.robot;

public class Jager {

    private String mark;
    private String energyCore;
    private int armor;
    private int speed;

    public Jager(String mark, String energyCore, int armor,int speed ) {
        this.mark = mark;
        this.energyCore = energyCore;
        this.armor = armor;
        this.speed = speed;
    } 

    public String getMark() {
        return mark;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }     

    public String launchWeapons() {
        return "launching";
    }    
}  
