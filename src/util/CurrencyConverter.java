package util;

public class CurrencyConverter {
    private static final double IOF_RATE = 0.06;

    public static double convertDollarsToReais(double dollarPrice, double amountInDollars) {
        double totalAmount = amountInDollars * dollarPrice;
        return totalAmount + (totalAmount * IOF_RATE);
    }
}
