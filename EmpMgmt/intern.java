package EmpMgmt;

public class intern extends Employee implements WorkHours{
	
	private int noOfHours;
	
	public intern(String empName, int empID, String dept, double baseSalary, int leaveBalance, int noOfHours) {
		super(empName, empID, dept, baseSalary, leaveBalance);
		this.noOfHours=noOfHours;
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
		return noOfHours;
	}

	@Override
	double calSalary() {
		return baseSalary;
	}

	@Override
	String getEmpType() {
		return "Employee type: Part Time Employee";
	}

	@Override
	void provideBenefits() {
		System.out.println("Benefits: Health Insurance, PF");
	}

}
