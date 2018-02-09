package edu.ldsbc.assingment3;

public class IceCream extends DessertItem {

    private int cost;

    IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " - " + cost;
    }

    @Override
    public int calculateItemCost() {
        return cost;
    }

}
