package collections;

import java.util.Comparator;

public class comparingNamePrice implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		// first make comparison by name
		int categoryComparison = p1.prodName.compareTo(p2.prodName); // returns 0 when equal
				
		if(categoryComparison==0) {
			return Double.compare(p1.prodPrice, p2.prodPrice);
		}
		
		return categoryComparison;
	}

}
