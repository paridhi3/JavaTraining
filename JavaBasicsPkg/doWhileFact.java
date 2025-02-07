package JavaBasicsPkg;

import java.util.Scanner;

public class doWhileFact {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n>0)
		{
			int result = 1, i=1;
			do {
	            result *= i;
	            i++;
	        } while (i <= n);
	        System.out.println("The factorial of " + n + " is: " + result);
		}
		else System.out.println("Negative number!");
	}
}
