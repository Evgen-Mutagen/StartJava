package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String sex;
    private String petName;
    private int weight;
    private int age;
    private String color; 

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
        }    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Ходит");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}
