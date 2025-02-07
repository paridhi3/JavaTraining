package multiThreading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialApp {

	public static void main(String[] args) {
		
		try {
            FileInputStream file = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            
            person objP = (person) in.readObject();
            
            in.close();
            file.close();
            
            System.out.println("Deserialized Person: "+objP);
            
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
	}

}
