package EmpMgmt;

public class FTE extends Employee implements Taxable, WorkHours{
	
	private double bonus;
	
	public FTE(String empName, int empID, String dept, double baseSalary, int leaveBalance, double bonus) {
		super(empName, empID, dept, baseSalary, leaveBalance);
		this.bonus = bonus;
	}

	@Override
	public String getName() {
		return empName;
	}

	@Override
	public int getID() {
		return empID;
	}

	@Override
	public int getWorkHours() {
		return stdWorkHours;
	}

	@Override
	public double calTax(double salary) {
		return salary*taxRate;
	}

	@Override
	double calSalary() {
		return baseSalary+bonus;
	}

	@Override
	String getEmpType() {
		return "Full Time Employee";
	}

	@Override
	void provideBenefits() {
		System.out.println("Benefits: Health Insurance, PF");
	}

}
