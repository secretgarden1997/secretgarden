package com.mycompany.assignmenty1y2g5;

public abstract class Transport implements Movable {
    protected String type;
    protected String name;
    protected int currentLoad;
    protected int maxLoad;

    public Transport(String type, String name, int maxLoad) {
        this.type = type;
        this.name = name;
        this.maxLoad = maxLoad;
        this.currentLoad = 0;
    }

    public void load(int weight) {
        if (weight <= 0) {
            System.out.println("Invalid weight to load. Loading cancelled.");
        } else if (currentLoad + weight > maxLoad) {
            System.out.println("Cannot load. Exceeds maximum load capacity.");
        } else {
            currentLoad += weight;
            System.out.println("Loaded successfully.");
        }
    }

    public void unload(int weight) {
        if (weight <= 0) {
            System.out.println("Invalid weight to unload. Unloading cancelled.");
        } else if (weight > currentLoad) {
            System.out.println("Cannot unload. Exceeds current load.");
        } else {
            currentLoad -= weight;
            System.out.println("Unloaded successfully.");
        }
    }

    @Override
    public String toString() {
        return String.format("Type=%s, Name=%s, max Load=%d kg, current Load=%d kg", 
                              type, name, maxLoad, currentLoad);
    }
}

