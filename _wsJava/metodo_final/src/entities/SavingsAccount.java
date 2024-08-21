package entities;

public final class SavingsAccount extends Account{
	
	private double interestRate;
	
	public SavingsAccount() {}

	public SavingsAccount(int number, String holder, double balance, double iterestRate) {
		super(number, holder, balance);
		this.interestRate = iterestRate;
	}

	public double getIterestRate() {
		return interestRate;
	}

	public void setIterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
