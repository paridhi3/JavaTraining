package EmpMgmt;

public class PayrollManager {
	public static void generatePayroll(Employee emp) {
		double salary = emp.calSalary();
		
		// instanceof ->
		// if fte,pte: tax yes, else no
//		double tax = (emp instanceof Taxable) ? (((Taxable) emp).calTax(salary)) : 0;
		
		double extraBonus = (emp instanceof Manager)?((Manager)emp).calBonus(salary):0;
		double tax = (emp instanceof Taxable)?((Taxable)emp).calTax(salary+extraBonus):0;
		
		double netSalary = salary - tax;
		System.out.println("Payroll for: "+emp.getEmpName());
		System.out.println("Monthly Salary after bonus: "+salary+extraBonus);
		System.out.println("Tax deduction: "+tax);
		System.out.println("Net Salary: "+netSalary);		
	}
}
