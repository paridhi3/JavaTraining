package JavaBasicsPkg;

import java.util.Scanner;

public class switchCase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter current salary: ");
		double currSalary = sc.nextDouble();
		
		System.out.println("Enter current rating: ");
		int rating = sc.nextInt();
		
		double hike = 0.0;
		
		switch (rating) {
		case 5:
			hike = 0.20;
			break;
		case 4:
			hike = 0.15;
			break;
		case 3:
			hike = 0.10;
			break;
		case 2:
			hike = 0.05;
			break;
		case 1:
			hike = 0.0;
			break;
		default: 
			System.out.println("Invalid rating");		
		}
		double newSalary = currSalary + (currSalary*hike);
		System.out.println("Your new salary is: " + newSalary);
		
	}
}
