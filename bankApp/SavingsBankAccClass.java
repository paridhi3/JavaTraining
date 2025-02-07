package bankApp;

public class SavingsBankAccClass extends BankAccount {
	private double interestRate;
	
	public SavingsBankAccClass() {
		super();
	}
	
	public SavingsBankAccClass(int accountNumber, String accountHolderName, double initialBalance, double interestRate) {
		super(accountNumber, accountHolderName, initialBalance);
		this.setInterestRate(interestRate);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public void deposit(double amount) {
        super.deposit(amount); 
        double interest = amount*interestRate;
        setBalance(getBalance()*interest);
        System.out.println("Interest Added: "+interest);
    }
	
	@Override
	public void deposit(double... amounts) {
		double bal = super.getBalance(); 
		for(double amount:amounts) {
        	if(amount>0) {
        		bal += amount;
        	}
        	else {
        		System.out.println("Invalid deposit amount.");
                System.out.println();
        	}
        }
        
        bal += bal*interestRate;
        super.deposit(amounts);

        System.out.println("Updated Balance after adding interest: Rs " + bal);
        System.out.println();
    }
 
	public void transfer(double amount, BankAccount targetAcc) {
		double balance = super.getBalance();
    	if(amount<=0) {
    		System.out.println("Negative or zero amount.");
    	} 
    	else if(amount>balance) {
    		System.out.println("Insufficient funds.");
    	}
    	else {
    		balance -= amount;
    		super.setBalance(balance);
    		targetAcc.deposit(amount);
    		System.out.println("Transferred Rs "+amount+" to account number "+targetAcc.getAccountNumber());
    	}
    }
	
//	public void displayDetails(){
//	       super.displayDetails();
//	       System.out.println("Balance after interest: Rs "+balanceAfterInterest());
//	       System.out.println("------------------------------------------");
//	}
//	
//	public double balanceAfterInterest() {
//		double balance = super.getBalance();
//		balance += (balance * interestRate);
//		return balance;
//	}	
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Interst rate is  : "+ interestRate);
		System.out.println("--------------------------");
 	}
}
