package edu.ldsbc.assingment3;

public class Candy extends DessertItem {

    private double weight;
    private double costPerLb;

    public Candy(String name, double weight, double costPerLb){
        super(name);
        this.weight = weight;
        this.costPerLb = costPerLb;
    }

    @Override
    public int calculateItemCost(){
        return (int) (weight * costPerLb);
    }

    @Override
    public String toString() {
        return name + " - " + (weight * costPerLb);
    }
}
