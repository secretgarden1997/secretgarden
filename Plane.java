package com.mycompany.assignmenty1y2g5;
public class Plane extends Transport {
    public Plane(String name, int maxLoad) {
        super("Aeroplane", name, maxLoad);
    }

    @Override
    public void move() {
        System.out.println(name + " flies.");
    }
}
