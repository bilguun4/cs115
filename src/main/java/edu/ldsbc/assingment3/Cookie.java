package edu.ldsbc.assingment3;

public class Cookie extends DessertItem {
    private int cost;
    private double costPerDozen;
    private int number;
    public Cookie(String name, int number, double costPerDozen){
        super(name);
        this.costPerDozen = costPerDozen;
        this.number = number;
    }


    @Override
    public int calculateItemCost(){
        cost = (int) (costPerDozen / 12 * number);
        return cost;
    }


    @Override
    public String toString() {
        return name + " - " + cost;
    }
}

