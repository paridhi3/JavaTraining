package JavaBasicsPkg;

public class ifElse {
	public static void main (String[] args) {
		double rating = 3.5;
		double salary = 500000;
		double revisedSalary=0;
		
		if(rating>=1 && rating<=2) {
			revisedSalary = salary;
		}
		else if(rating>2 && rating<=3.5) {
			revisedSalary = salary + 0.05*salary;
		}
		else if(rating>3.5 && rating<=4.5) {
			revisedSalary = salary + 0.08*salary;
		}
		else if(rating>4.5 && rating<=5) {
			revisedSalary = salary + 0.1*salary;
		}
		else System.out.println("Invalid rating");
		
		System.out.println("Your revised salary is: " + revisedSalary);
	}
}
