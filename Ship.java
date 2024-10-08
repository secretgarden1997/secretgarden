package com.mycompany.assignmenty1y2g5;
public class Ship extends Transport {
    public Ship(String name, int maxLoad) {
        super("Ship", name, maxLoad);
    }

    @Override
    public void move() {
        System.out.println(name + " sails.");
    }
}
