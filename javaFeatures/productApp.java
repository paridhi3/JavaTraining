package javaFeatures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class productApp {

	public static void main(String[] args) {
		List<product> products = List.of(
								 new product("milk", "grocery",90.0),
								 new product("honey", "grocery",10000.0),
								 new product("bread", "grocery",680.0),
								 new product("Mobile","electronics",10000)
								 );
		
		List<product> fiterProducts = products.stream()
											  .filter(product -> product.getPrice()>5000 && product.getPrice()<50000)
											  .collect(Collectors.toList());
		fiterProducts.forEach(product -> System.out.println(product));
		
		System.out.println("------------------------------------------------");
		
		List<product> sortProducts = products.stream()
											  .sorted(Comparator.comparingDouble(product::getPrice))
											  .collect(Collectors.toList());
		sortProducts.forEach(product -> System.out.println(product));
		
		System.out.println("------------------------------------------------");
		
		List<String> upperProducts = products.stream()
				  .map(product -> product.getName().toUpperCase())
				  .collect(Collectors.toList());
		
		upperProducts.forEach(product -> System.out.println(product));
		
		System.out.println("------------------------------------------------");
		
		Double avgPrice = products.stream()
				  .mapToDouble(product::getPrice)
				  .average()
				  .orElse(0);
		
		System.out.println(avgPrice);
		

	}

}
