package com.helloworld2.greet2;

import java.util.List;

public class Place {
    private String name;
    private List<Spot> spots;

    public Place(String name, List<Spot> spots) {
        this.name = name;
        this.spots = spots;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", spots=" + spots +
                '}';
    }
}
