package week4adv;

class QuantityItem extends AbstractLineItem {
    private int quantity;

    public QuantityItem(String description, double price, int quantity) {
        super(description, price);
        this.quantity = quantity;
    }

  
    public double calculateCost() {
        return getPrice() * quantity;
    }

    // Getters and setters for quantity
    // ...
}