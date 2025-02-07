package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> numbers = new ArrayDeque<>(); // integers -> int (primtive type)
		 //Integer -> wrapper class for int
		 numbers.add(6);
		 numbers.add(2);
		 numbers.add(23);
		 
//		 Queue<String> numbersS = new PriorityQueue<>(); // integers -> int (primtive type)
		 Queue<String> numbersS = new ArrayDeque<>();
		 
		 numbersS.add("Hello");
		 numbersS.add("Abc");
		 numbersS.add("BBC");
		 
		 while(!numbers.isEmpty()) {
			 System.out.println(numbers.poll());
		 }
		 while(!numbersS.isEmpty()) {
			 System.out.println(numbersS.poll());
		 }
		 
		 // internally it is implementing Comparable Interface
		 // assigning -> lowest value -> highest priority
		 // string values -> lexicographical order

	}

}
