package bonus;

public class Employee {
	// attributes
	private String name;
	private int hours;
	private double totalPay;
	// constants
	private final double regPay=15, overPay=16.5;
	private final int limit=40;
	
	// constructor
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
		setTotalPay();
	}

	public void setTotalPay() {
		if (hours <= limit)
			totalPay = regPay * hours;
		else
			totalPay = regPay * limit + overPay*(hours-limit);
	}
	
	public double getTotalPay() {
		return totalPay;
	}
	
	// use JUnit to test setTotalPay()
}
