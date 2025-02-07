package bankApp;

public class PremiumBankAcc extends SavingsBankAccClass {
	
	private double bonusInterest;
	
	public PremiumBankAcc() {
		super();
	}
	
	public PremiumBankAcc(int accountNumber, String accountHolderName, double initialBalance, double interestRate, double bonusInterest) {
		super(accountNumber, accountHolderName, initialBalance, interestRate);
		this.setBonusInterest(bonusInterest);
	}

	public double getBonusInterest() {
		return bonusInterest;
	}

	public void setBonusInterest(double bonusInterest) {
		this.bonusInterest = bonusInterest;
	}
	
	@Override
	public void deposit(double amount) {
        super.deposit(amount); 
        double interest = amount*bonusInterest;
        setBalance(getBalance()*interest);
        System.out.println("Bonus Interest Added: "+interest);
    }
	
	@Override
	public void displayDetails() {
		double balance = super.getBalance();
		balance += (balance * bonusInterest);
	    super.displayDetails();
	    System.out.println("Balance after bonus interest: Rs "+balance);
	    System.out.println("------------------------------------------");
	}
}
