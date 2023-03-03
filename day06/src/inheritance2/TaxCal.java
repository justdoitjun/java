package inheritance2;

public class TaxCal {
	public double getTax(Employee e) {
		double result = 0.0;
		result = e.getAnnSalary() * 0.17;
		return result;
	}
}
