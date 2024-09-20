package entities;

public class CompanyTaxPayer extends TaxPayer {
    
    private int numberEmployee;

    public CompanyTaxPayer() {}

    public CompanyTaxPayer(String name, double anualIncome, int numberEmployee) {
        super(name, anualIncome);
        this.numberEmployee = numberEmployee;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    @Override
    public double taxesPaid() {
        return 0;
    }
}
