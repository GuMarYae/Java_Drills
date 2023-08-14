import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLineItem {
    private String description;
    private double price;

    public AbstractLineItem(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public abstract double calculateCost();

    // Getters and setters for description and price
    // ...

}

class QuantityItem extends AbstractLineItem {
    private int quantity;

    public QuantityItem(String description, double price, int quantity) {
        super(description, price);
        this.quantity = quantity;
    }

    @Override
    public double calculateCost() {
        return getPrice() * quantity;
    }

    // Getters and setters for quantity
    // ...
}

class FixedChargeItem extends AbstractLineItem {
    private double charge;

    public FixedChargeItem(String description, double price, double charge) {
        super(description, price);
        this.charge = charge;
    }

    @Override
    public double calculateCost() {
        return charge;
    }

    // Getters and setters for charge
    // ...
}

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String name, String street, String city, String state, String zipCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and setters for the address attributes
    // ...

}

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
        sb.append("-------\n");
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

    // Getters and setters for address and lineItems
    // ...

}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters for the product attributes
    // ...

}

public class InvoicePrinter {
    public static void main(String[] args) {
        Address samsAddress = new Address("Sam's Small Appliances", "100 Main Street", "Anytown", "CA", "98765");

        Invoice samsInvoice = new Invoice(samsAddress);

        // Adding QuantityItems to the invoice
        QuantityItem toasterItem = new QuantityItem("Toaster", 29.95, 3);
        samsInvoice.add(toasterItem);

        // Adding FixedChargeItems to the invoice
        FixedChargeItem hairDryerItem = new FixedChargeItem("Hair dryer", 24.95, 0);
        samsInvoice.add(hairDryerItem);

        FixedChargeItem carVacuumItem = new FixedChargeItem("Car vacuum", 19.99, 0);
        samsInvoice.add(carVacuumItem);

        System.out.println(samsInvoice.format());
    }
}