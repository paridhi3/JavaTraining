package EmpMgmt;

abstract class Employee implements Person{
	protected String empName;
	protected int empID;
	protected String dept;
	protected double baseSalary;
	protected int leaveBalance;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	
	public Employee(String empName, int empID, String dept, double baseSalary, int leaveBalance) {
		super();
		this.empName = empName;
		this.empID =empID;
		this.dept=dept;
		this.baseSalary=baseSalary;
		this.leaveBalance=leaveBalance;
	}
	
	abstract double calSalary();
	abstract String getEmpType();
	abstract void provideBenefits();
	
	public boolean requestLeaves(int days) {
		if(days<=leaveBalance) {
			leaveBalance -= days;
			System.out.println("Leaves approved for "+days+" days");
			return true;
		}
		else {
			System.out.println("Leave not granted");
			return false;
		}
	}
	
	public void displayInfo() {
		System.out.println("-------------------------");
		System.out.println("EmpName: "+empName+", EmpID: "+empID+", empDept: "+dept);
		System.out.println("Employment type: "+getEmpType());
		System.out.println("Monthly salary: "+calSalary());
		System.out.println("Leave balance: "+leaveBalance);
		provideBenefits();
	}
	
}
