package com.aryan;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop lap;
    private int price;

    @ConstructorProperties({"age","lap","price"}) //used only when we use name value in constructor injection in .xml
    public Alien(int age,Laptop lap,int price)
    {
        System.out.println("These is parameterized constructor");
        this.age=age;
        this.lap=lap;
        this.price=price;
    }
    public void startlaptop()
    {
        lap.cpurunning();
    }

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public int getPrice() {
        return price;
    }
}
