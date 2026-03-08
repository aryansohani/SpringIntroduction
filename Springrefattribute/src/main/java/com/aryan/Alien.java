package com.aryan;

public class Alien {

    private int age;

    private Laptop lap;

    public void runlaptop()
    {
        lap.startcpu();
    }
    public Alien()
    {
        System.out.println("These is Alien object");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
