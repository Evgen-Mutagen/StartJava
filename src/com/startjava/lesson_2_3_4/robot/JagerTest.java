package com.startjava.lesson_2_3_4.robot;

public class JagerTest {

    public static void main(String[] args) {
        Jager gipsyDanger = new Jager("Mark-5","Arc-9 reactor (analog)", 6, 7);
        
        System.out.println(gipsyDanger.getMark());
        System.out.println(gipsyDanger.getEnergyCore());
        System.out.println(gipsyDanger.getArmor());
        System.out.println(gipsyDanger.getSpeed());
        gipsyDanger.launchWeapons();
        
        Jager strikerEureka = new Jager("Mark-3","XIG Supercell Chamber", 9, 10);
       
        System.out.println(strikerEureka.getMark());
        System.out.println(strikerEureka.getEnergyCore());
        System.out.println(strikerEureka.getArmor());
        System.out.println(strikerEureka.getSpeed());
        gipsyDanger.launchWeapons();
    }
}

