/*
Problem Statement -> arrays, strings
 
-> maintain employee records -> names, address, salary 
   -> input number of employees
   -> input name, address, monthly salary of each employee
   -> paying salaries at end of 3 months
   -> total salary of each employee = 3*monthly salary
   -> Tabular Format Display
                  Name    Address  Salary   Total(To be paid)
      Employee1
      Employee2 
*/  

package JavaBasicsPkg;

import java.util.Scanner;

public class StringsAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();

        String[] names = new String[numEmployees];
        String[] addresses = new String[numEmployees];
        double[] monthlySalaries = new double[numEmployees];

        // Input details for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Address: ");
            addresses[i] = sc.next();
            System.out.print("Monthly Salary: ");
            monthlySalaries[i] = sc.nextDouble();
        }

        System.out.println();

         System.out.printf("%-10s %-15s %-10s %-20s%n", "Name", "Address", "Salary", "Total(To be paid)");
         
         for (int i=0;i<numEmployees;i++) {
             double totalSalary=3*monthlySalaries[i];
             System.out.printf("%-10s %-15s ₹%-9.2f ₹%-19.2f%n",
                     names[i],
                     addresses[i],
                     monthlySalaries[i],
                     totalSalary);
         }
	}

}
