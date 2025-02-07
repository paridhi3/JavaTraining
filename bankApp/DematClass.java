package bankApp;

public class DematClass extends BankAccount{
	private int stockHoldings;
	
	public DematClass() {
		super();
	}
	
	public DematClass(int accountNumber, String accountHolderName, double initialBalance, int stocks) {
		super(accountNumber, accountHolderName, initialBalance);
		this.stockHoldings = stocks;
	}
	
	public void buyStocks(int quantity, double pricePerStock) {
		double totalCost = quantity*pricePerStock;
		if(getBalance() >= totalCost) {
			setBalance(getBalance() - totalCost);
			stockHoldings += quantity;
		}
		else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public void sellStocks(int quantity, double pricePerStock) {
		if(stockHoldings <= 0) {
			System.out.println("No stocks to sell.");
		}
		else {
			double totalEarnings = quantity*pricePerStock;
			setBalance(getBalance() + totalEarnings);
			stockHoldings -= quantity;
		}
	}
	
	@Override
	public void displayDetails(){
		   super.displayDetails();
		   System.out.println("Stock Holdings : " +stockHoldings); 
	   }
	
}
