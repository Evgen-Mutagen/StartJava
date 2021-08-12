package com.startjava.lesson_2_3_4.animal;


public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfy = new Wolf();

        wolfy.setSex("man");
        wolfy.setPetName("Akella");
        wolfy.setWeight(15);
        wolfy.setAge(12);
        wolfy.setColor("Gray");

        System.out.println(wolfy.getSex());
        System.out.println(wolfy.getPetName());
        System.out.println(wolfy.getWeight());
        System.out.println(wolfy.getAge());
        System.out.println(wolfy.getColor());

        wolfy.walk();
        wolfy.sit();
        wolfy.run();
        wolfy.howl();
        wolfy.hunt();
    }
}