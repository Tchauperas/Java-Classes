package util;

public class CurrencyConverter {
    public double real;
    public final double IOF = 0.06;

    public double calculation(double dollarPrice, double dollarBought) {
        real = (dollarPrice * dollarBought);
        return real += real * IOF;
    }
}
