package JavaBasicsPkg;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void greet(String name) {
        System.out.println("Hello "+name+"!!");
    }

    public static void isEven(int num) {
        if(num%2==0)
        {
        	System.out.println("The number is even");
        }
        else System.out.println("The number is odd");;
    }
   

    public static void findCube(int num) {
    	System.out.println(num*num*num);
    }

    public static int factorial(int num) {
    	if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        greet(name);

        System.out.print("Enter number to check even odd: ");
        int num = sc.nextInt();
        isEven(num);

        System.out.print("Enter number to find cube: ");
        int num2 = sc.nextInt();
        findCube(num2);
        
        System.out.print("Enter number to find factorial: ");
        int num3 = sc.nextInt();
        int fact = factorial(num3);
        System.out.println("The factorial of "+num3+" is "+fact);
        
       sc.close();
   }
}

