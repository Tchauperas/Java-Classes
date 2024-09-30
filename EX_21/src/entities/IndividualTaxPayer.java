package entities;

public class IndividualTaxPayer extends TaxPayer {

    private double healthExp;

    public IndividualTaxPayer() {}

    public IndividualTaxPayer(String name, double anualIncome, double healthExp) {
        super(name, anualIncome);
        this.healthExp = healthExp;
    }

    public double getHealthExp() {
        return healthExp;
    }

    @Override
    public double taxesPaid() {
        double basicTax = (getAnualIncome() < 20000) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        basicTax -= (healthExp * 0.5);
        if (basicTax <= 0) {
            return 0;
        } else {
            return basicTax;
        }
    }

    @Override
    public String toString() {
        return getName() + ": " + String.format("%.2f", taxesPaid());
    }
}