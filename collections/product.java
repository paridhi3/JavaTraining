package collections;

import java.util.Objects;

public class product implements Comparable<product>{
	int prodID;
	String prodName;
	double prodPrice;
	String prodCategory;
	
	public product(int prodID, String prodName, double prodPrice, String prodCategory) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodCategory = prodCategory;
	}
	
	@Override
	public String toString() {
		return "product [prodID=" + prodID + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodCategory="
				+ prodCategory + "]";
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(prodID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) 
			return true;
		if(obj==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		product other = (product) obj;
//		return prodID == other.prodID;
		return prodID == other.prodID && Objects.equals(prodName, other.prodName);
	}

	@Override
	public int compareTo(product otherProd) {
//		return Double.compare(this.prodPrice, otherProd.prodPrice);
		return this.prodName.compareTo(otherProd.prodName);
	}
	
	
	
	
}
