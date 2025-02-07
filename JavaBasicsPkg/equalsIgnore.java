package JavaBasicsPkg;

import java.util.Scanner;

public class equalsIgnore {
	public static void main(String[] args) {
		String s1 = "Admin123";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password");
		String s2 = sc.nextLine();

		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Incorrect password!");
		}
	}
}
