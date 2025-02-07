package EmpMgmt;

import java.util.*;

class NoEmployeeException extends Exception {
    public NoEmployeeException(String message) {
        super(message);
    }
}

class MaxEmployeesReachedException extends Exception {
    public MaxEmployeesReachedException(String message) {
        super(message);
    }
}

class NoLeaveBalance extends Exception {
    public NoLeaveBalance(String message) {
        super(message);
    }
}


public class EmpApp {
	
	static Employee[] employees;
	static int totalEmployees = 0;
	static int maxEmployees = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employees = new Employee[5];
		
		while(true) {
			System.out.println("Employee Menu");
			System.out.println("Press 1: To create employee");
			System.out.println("Press 2: To display all employees");
			System.out.println("Press 3: Apply leave");
			System.out.println("Press 4: Exit");
			
			int choice = sc.nextInt();
			try {
				switch(choice) {
				case 1:
					createEmployee(sc);
					break;
				case 2:
					displayAllEmployees();
					break;
				case 3:
					applyLeave(sc);
					break;
				case 4:
					System.out.println("Thank you");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice");
				}
			} catch (MaxEmployeesReachedException | NoLeaveBalance e) {
                System.out.println(e.getMessage());
            }
		}
			

}
	
	
	public static void createEmployee(Scanner sc) throws MaxEmployeesReachedException{
		if(totalEmployees >= maxEmployees) {
			throw new MaxEmployeesReachedException("Cannot create more employees");
		}
		
		System.out.println("Enter Employee ID: ");
		int empID = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String empName = sc.next();
		
		System.out.println("Enter Employee Dept: ");
		String dept = sc.next();
		
		System.out.println("Enter Employee base salary: ");
		double baseSalary = sc.nextDouble();
		
		System.out.println("Enter Employee Leave balance: ");
		int leaveBalance = sc.nextInt();
		
		System.out.println("Enter Employee Type: ");		
		System.out.println("Press 1: FTE");
		System.out.println("Press 2: PTE");
		System.out.println("Press 3: Intern");
		System.out.println("Press 4: Manager");
		int type = sc.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("Enter bonus for FTE: ");
			double bonus = sc.nextDouble();
			employees[totalEmployees] = new FTE(empName, empID, dept, baseSalary, leaveBalance, bonus);
			break;
		case 2:
			System.out.println("Enter number of hours: ");
			int noOfHours = sc.nextInt();
			System.out.println("Enter hourly rate: ");
			double hourlyRate = sc.nextDouble();
			employees[totalEmployees] = new PTE(empName, empID, dept, baseSalary, leaveBalance, noOfHours, hourlyRate);
			break;
		case 3:
			System.out.println("Enter number of hours: ");
			int noOfHours2 = sc.nextInt();
			employees[totalEmployees] = new intern(empName, empID, dept, baseSalary, leaveBalance, noOfHours2);
			break;
		case 4:
			System.out.println("Enter bonus for Manager: ");
			double bonus2 = sc.nextDouble();
			employees[totalEmployees] = new Manager(empName, empID, dept, baseSalary, leaveBalance, bonus2);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		System.out.println("Employee created successfully!");
		totalEmployees++;
	}
	
	
	
	public static void displayAllEmployees() {
		if(totalEmployees==0) {
			System.out.println("No employees to display");
			return;
		}
		System.out.println("Employee details:");
		for(int i=0; i<totalEmployees; i++) {
			employees[i].displayInfo();
			PayrollManager.generatePayroll(employees[i]);
			System.out.println("-------------------------------------");
		}
	}
	
	public static void applyLeave(Scanner sc) throws NoLeaveBalance {
		System.out.println("Enter emp ID: ");
		int empID = sc.nextInt();
		
		System.out.println("Enter leave days: ");
		int leaveDays = sc.nextInt();
		
		Employee emp = findEmployee(empID);
		
		if(emp!=null) {
			if(leaveDays<=emp.leaveBalance) {
				emp.leaveBalance -= leaveDays;
				System.out.println(leaveDays+" days leave granted.");
			}
			else {
				throw new NoLeaveBalance("No leaves left");
			}
		}
		else {
			System.out.println("Employee not found");
		}
	}
	
	
	public static Employee findEmployee(int empID) {
		for(int i=0; i<totalEmployees; i++) {
			if(employees[i].getEmpID()==empID) {
				return employees[i];
			}
		}
		return null;
	}
	
	
}
	
