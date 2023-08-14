
/*
 * +------------------+
 * | AbstractLineItem|
 * +------------------+
 * | - description |
 * | - price |
 * +------------------+
 * | + calculateCost()|
 * +------------------+
 * ^
 * |
 * |
 * +-------------------+
 * | QuantityItem |
 * +-------------------+
 * | - quantity |
 * +-------------------+
 * | + calculateCost() |
 * +-------------------+
 * ^
 * |
 * |
 * +-------------------+
 * | FixedChargeItem |
 * +-------------------+
 * | - charge |
 * +-------------------+
 * | + calculateCost() |
 * +-------------------+
 */
////////////////////////////////////////////
package week4adv;

import java.util.ArrayList;
import java.util.List;



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
