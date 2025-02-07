package EmpMgmt;

public class PTE extends Employee implements WorkHours{
	
	private int noOfHours;
	private double hourlyRate;

	public PTE(String empName, int empID, String dept, double baseSalary, int leaveBalance, int noOfHours, double hourlyRate) {
		super(empName, empID, dept, baseSalary, leaveBalance);
		this.noOfHours=noOfHours;
		this.hourlyRate=hourlyRate;
	}
	//no taxable interface used, only work hours interface -> constant(not applicable here), getworkhours(define this differently)
	//hourly rate, no. of hours

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
		return noOfHours;
	}

	@Override
	double calSalary() {
		return noOfHours*hourlyRate;
	}

	@Override
	String getEmpType() {
		return "Part Time Employee";
	}

	@Override
	void provideBenefits() {
		System.out.println("Health Insurance, PF");
	}
}
