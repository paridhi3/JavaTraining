package multiThreading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person objP = new person("paridhi", 1);
		
		try {
			// o/p to a file
			FileOutputStream file = new FileOutputStream("person.ser"); // creates a byte stream connected to "person.ser" where serialized data will be written.
			ObjectOutputStream out = new ObjectOutputStream(file); // wraps around FileOutputStream, allowing us to write objects as byte streams.

			
			out.writeObject(objP); //  writes the serialized form of the object objP into "person.ser".
			
			out.close();
			file.close();
			
			System.out.println("Object serialized");
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
