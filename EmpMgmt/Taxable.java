package EmpMgmt;

public interface Taxable {
	// by default: public static final
	double taxRate = 0.20;
	
	// abstract
	double calTax(double salary);
}
