package com.aryan;

public class Alien {

    Computer comp;

    public void start()
    {
        comp.compile();
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    public Alien()
    {
        System.out.println("These is alien constructor");
    }
}
