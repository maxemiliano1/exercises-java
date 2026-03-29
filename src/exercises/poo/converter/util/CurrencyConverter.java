package exercises.poo.converter.util;

public class CurrencyConverter {

    static final double IOF = 6.0;

    public static double priceInReais(double amount, double dollarPrice) {
        double total = amount * dollarPrice;
        return total + (total * IOF / 100);
    }
}
