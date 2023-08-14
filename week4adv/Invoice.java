package week4adv;
import week4adv.AbstractLineItem;
import week4adv.Address;
import java.util.ArrayList;
import java.util.List;


class Invoice {
    private Address address;
    private List<AbstractLineItem> lineItems;

    public Invoice(Address address) {
        this.address = address;
        this.lineItems = new ArrayList<>();
    }

    public void add(AbstractLineItem lineItem) {
        lineItems.add(lineItem);
    }

    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice\n");
       
        sb.append("Customer: ").append(address.getName()).append("\n");
        sb.append("Address: ").append(address.getStreet()).append(", ").append(address.getCity()).append(", ")
                .append(address.getState()).append(", ").append(address.getZipCode()).append("\n");
        sb.append("Line Items:\n");
        for (AbstractLineItem lineItem : lineItems) {
            sb.append(lineItem.getDescription()).append("\t").append(lineItem.calculateCost()).append("\n");
        }
        sb.append("Total: ").append(calculateTotal()).append("\n");
        return sb.toString();
    }

    public double calculateTotal() {
        double total = 0;
        for (AbstractLineItem lineItem : lineItems) {
            total += lineItem.calculateCost();
        }
        return total;
    }

    

}