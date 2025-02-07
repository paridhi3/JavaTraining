package bankApp;

class BankAccount {
	private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    // Constructor to initialize the bank account
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    public BankAccount() {}
    
    // getters setters
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance = balance;
		}
	}

    public double getBalance() {
        return balance;
    }
 
    // Method to deposit money into the bank account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: Rs " + amount);
            System.out.println("Updated Balance after deposit: Rs " + balance);
            System.out.println();
        } else {
            System.out.println("Invalid deposit amount.");
            System.out.println();
        }
    }
    
    public void deposit(double... amounts) {
        double totalDeposit = 0.0;
        for(double amount:amounts) {
        	if(amount>0) {
        		totalDeposit += amount;
        	}
        	else {
        		System.out.println("Invalid deposit amount.");
                System.out.println();
        	}
        }
        balance += totalDeposit;
        System.out.println("Updated Balance after deposit: Rs " + balance);
        System.out.println();
    }
 
    // Method to withdraw money from the bank account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: Rs " + amount);
            System.out.println("Updated Balance after withdrawal: Rs " + balance);
            System.out.println();
        } else if (amount > 0 && balance < amount) {
            System.out.println("Insufficient funds.");
            System.out.println();
        } else {
            System.out.println("Invalid withdrawal amount.");
            System.out.println();
        }
    }
    
    public void transfer(double amount, BankAccount targetAcc) {
    	if(amount<=0) {
    		System.out.println("Negative or zero amount.");
    	} 
    	else if(amount>balance) {
    		System.out.println("Insufficient funds.");
    	}
    	else {
    		balance -= amount;
    		targetAcc.deposit(amount);
    		System.out.println("Transferred Rs "+amount+" to account number "+targetAcc.getAccountNumber());
    	}
    }
 
   // Method to display all details of the bank Account 
   public void displayDetails(){
	   System.out.println("------------------------------------------");
       System.out.println("Account Number: " +accountNumber);
       System.out.println("Account Holder Name: " +accountHolderName);
       System.out.println("Current Balance : " +balance); 
   }
}
