package entities;

public class OutsourcedEmployee extends Employee {
		
	private double addicionalChard;
	
	public OutsourcedEmployee() {}

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double addicionalChard) {
		super(name, hours, valuePerHour);
		this.addicionalChard = addicionalChard;
	}

	public double getAddicionalChard() {
		return addicionalChard;
	}
	
	@Override
	public double payment() {
		return (getHours() * getValuePerHour()) + addicionalChard;
	}
	
}
