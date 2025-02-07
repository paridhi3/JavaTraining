package collections;

import java.util.Comparator;

public class comparingCategoryID implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		// first make comparison by category
		int categoryComparison = p1.prodCategory.compareTo(p2.prodCategory); // returns 0 when equal
		
		if(categoryComparison==0) {
			return Integer.compare(p1.prodID, p2.prodID);
			
		}
		return categoryComparison;
	}

}
