package week4adv;


class FixedChargeItem extends AbstractLineItem {
    private double chargeItem;

    public FixedChargeItem(String description, double price, double chargeItem) {
        super(description, price);
        this.chargeItem = chargeItem;
    }

 
    public double calculateCost() {
        return chargeItem;
    }

}
