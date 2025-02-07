package JavaBasicsPkg;

import java.util.Scanner;

public class factorial {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n>0)
		{
			int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        System.out.println("The factorial of " + n + " is: " + result);
		}
		else System.out.println("Negative number!");
	}
}
