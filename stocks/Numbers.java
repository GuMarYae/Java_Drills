package stocks;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Numbers {

    public static void main(String[] args) {
        double decimal = 0.07;
        // make sure to use parens for (decimal *100) or itll round it to 0
        int percent = (int) (decimal * 100);
        double limit_1 = 600.01;
        double limit_2 = 100.01;
        int contractsCeiling_1 = 3;
        int contractsCeiling_2 = 11;

        ///////////////////////////////////////////// Questions//////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the contract/Investment you purchases: ");
        double userInputInvestmentCost;

        userInputInvestmentCost = input.nextDouble();
        System.out.println("Enter the number of contracts you purchased:");
        int userInputContractsPurchased;
        userInputContractsPurchased = input.nextInt();
        System.out.println("Koo. Now, Enter best target resistance on the chart, yo: ");
        double userInputTarget_Resistance;
        userInputTarget_Resistance = input.nextDouble();
        System.out.println("Boom!!. Aight Now, Enter best closest support on the chart, too: ");
        double userInputSupport;
        userInputSupport = input.nextDouble();
        // it needs to go down here because thats when the uninitialized variable above,
        // become initialized
        double valid = reward_riskRatio(userInputInvestmentCost, userInputTarget_Resistance, userInputSupport);
        input.close();
        // Purchases
        //////////////////////////////// is/it/normal?///////////////////////////////////////////////////////
        if (userInputContractsPurchased == 1) {
            System.out.println("-------------- \nSo, you bought a contract that costed $"
                    + userInputInvestmentCost + "? Ok.");
        } else {
            System.out.println(
                    "-------------- \nSo, you bought " + userInputContractsPurchased + " contracts that costed $"
                            + userInputInvestmentCost + " each? Ok.");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out
                .print("Your total spendings is: $"
                        + purchaseTotal(userInputInvestmentCost, userInputContractsPurchased) + "\n");
        System.out
                .print("And based off %" + percent + ", Your stoploss should be around: $"
                        + stopLoss(userInputInvestmentCost, userInputContractsPurchased, decimal)
                        + "\n");
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        if (valid >= 2) {
            System.out
                    .println("Recommended reward to risk ration is 2. Yours is: " + valid + ". That's wassup.");
        } else {
            System.out.println("Recommended reward to risk ration is 2. Yours is: " + valid
                    + ". Joint too low, yo.");
        }
        System.out.println("Breakdown\n ----------------------------------------------\nInvestment cost: "
                + userInputInvestmentCost + "\n" + "Number of contracts: "
                + userInputContractsPurchased + "\n" + "Investment total: "
                + purchaseTotal(userInputInvestmentCost, userInputContractsPurchased) + "\n" + "Stop loss: "
                + stopLoss(userInputInvestmentCost, userInputContractsPurchased, decimal) + "\n" + "Ratio vs 2 is: "
                + valid);
    }

    // since the function is outside of main, always add static in JAVA
    // also, pass the variable inside the parameter since all the variables are
    // inside the main
    // you would have to pass them by invoking a function with the parameter inside
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double purchaseTotal(double investmentCost, int contractsPurchased) {
        double purchaseTOT = investmentCost * contractsPurchased; // convert
        return purchaseTOT; //
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String stopLoss(double investmentCost, int contractsPurchased, double percentage) {
        double stopLoss = investmentCost * contractsPurchased * (1 - percentage);
        return String.format("%.2f", stopLoss);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double reward_riskRatio(double investmentCost, double targetResistance, double support) {
        double rr = (targetResistance - investmentCost) / (investmentCost - support);

        return rr;
    }

}
