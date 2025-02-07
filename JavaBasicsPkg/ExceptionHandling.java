package JavaBasicsPkg;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
	// throw keyword
		public static void checkAge(int age) {
			try {
				if(age<18)
				{
					throw new ArithmeticException("Age below 18");
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		//throws keyword
		public static void readFile() throws IOException{
			FileReader f1 = new FileReader("xyz.txt");
		}
		public static void main(String [] age)
		{
			checkAge(1);
			try {
				readFile();
			}
			catch(IOException e)
			{
				System.out.println("Exception handled: "+ e.getMessage());
			}
		}
	
}
