package javaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Maths {
	int operate(int a, int b);
}

public class lambaExp {

	public static void main(String[] args) {
		Maths add = (a,b) -> a+b;
		System.out.println(add.operate(2, 3));
		
//		Collections.sort(names, new Comparator<String>()) {
//			
//		}
		
		List<String> names = Arrays.asList("name3","name2", "name0");
		names.sort((s1,s2) -> s1.compareTo(s2));
		System.out.println(names);
		
		List<String> names2 = new ArrayList<>();
		names2.add("paridhi");
		names2.add("nisha");
		names2.add("rishabh");
		names2.forEach(name -> System.out.println(name));
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNums = numbers.stream() // 1st operation STREAM API
										.filter(n -> n%2==0) // 2nd operation
										.map(n -> n+10)
										.collect(Collectors.toList()); // 3rd
		System.out.println(evenNums);
		
		int sum = numbers.stream()
						 .map(n -> 2*n)
						 .mapToInt(Integer::intValue)
						 .sum();
						 
		System.out.println(sum);
	} 

}
