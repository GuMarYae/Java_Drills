package week4adv;


abstract class AbstractLineItem {
    private String description;
    private double price;

    public AbstractLineItem(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public abstract double calculateCost();

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}