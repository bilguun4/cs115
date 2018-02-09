package edu.ldsbc.assingment3;

public class Sundae extends IceCream {
    private int cost;
    private String topping;
    private int costOfIceCream;
    private int costOfTopping;
    public Sundae (String nameOfIceCream, int costOfIceCream, String nameOfTopping, int costOfTopping){
        super(nameOfIceCream, costOfIceCream);
        topping = nameOfTopping;
        this.costOfIceCream = costOfIceCream;
        this.costOfTopping = costOfTopping;
    }

    @Override
    public int calculateItemCost(){
        cost = costOfIceCream + costOfTopping;
        return cost;
    }

    @Override
    public String toString() {
        return name + " with " + topping + " - " + cost;
    }
}
