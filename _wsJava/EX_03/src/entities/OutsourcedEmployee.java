package entities;

public class OutsourcedEmployee extends Employee {
		
	private double addicionalChard;
	
	public OutsourcedEmployee() {}

	public OutsourcedEmployee(String name, int hours, double valuePerHour) {
		super(name, hours, valuePerHour);
	}

	public double getAddicionalChard() {
		return addicionalChard;
	}

	public void setAddicionalChard(double addicionalChard) {
		this.addicionalChard = addicionalChard * 1.1;
	}
	
	
}
