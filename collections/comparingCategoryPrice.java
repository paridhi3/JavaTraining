package collections;

import java.util.Comparator;

public class comparingCategoryPrice implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		
		// first make comparison by category
		int categoryComparison = p2.prodCategory.compareTo(p1.prodCategory); // returns 0 when equal
		
		if(categoryComparison==0) {
			return Double.compare(p2.prodPrice, p1.prodPrice);
		}
		
		return categoryComparison;
	}

}
