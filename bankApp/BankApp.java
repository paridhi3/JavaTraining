package bankApp;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
// FOLLOWING CODE IS WITH USER INPUT
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Account Number: ");
//		int accNum = sc.nextInt();
//		
//		System.out.println("Enter Account Holder Name: ");
//		String name = sc.next();
//		
//		System.out.println("Enter Account Balance: ");
//		double bal = sc.nextDouble();
//		
//		System.out.println("Enter Interest Rate: ");
//		double intRate = sc.nextDouble();
		
//		BankAccountClass sAcc = new SavingsBankAccClass(accNum, name, bal, intRate);
		
//		System.out.println("Enter amount to be deposited: ");
//		double deposit = sc.nextDouble();
//		sAcc.deposit(deposit);
		
//		System.out.println("Enter amount to be withdrawn: ");
//		double withdraw = sc.nextDouble();
//		sAcc.withdraw(withdraw);
		
//		sAcc.displayDetails();
		
		
//		((SavingsBankAccClass) sAcc).getInterestRate();
		
//		SavingsBankAccClass sAcc = new SavingsBankAccClass(0, "aryan", 1000, 0.1);
//		BankAccountClass p1 = new BankAccountClass(1, "paridhi", 9000);
//		BankAccountClass p2 = new BankAccountClass(2, "ruchi", 9000);
////		p1.transfer(1000, p2);
//		p1.transfer(1000, sAcc);
//		System.out.println(p1.getBalance());
		
//		PremiumBankAcc pAcc = new PremiumBankAcc(1, "paridhi", 1000, 0.1, 0.2);
//		pAcc.displayDetails();
//		pAcc.deposit(1000);
//		pAcc.displayDetails();
		
//		BankAccountClass bAcc = new SavingsBankAccClass(2, "aryan", 1000, 0.1);
//		bAcc.displayDetails();
//		
//		SavingsBankAccClass sAcc = new PremiumBankAcc(3, "ruchi", 1000, 0.1, 0.2);
//		sAcc.displayDetails();
		
		DematClass dAcc = new DematClass(1, "paridhi", 1000, 2);
		dAcc.buyStocks(1, 100);
		dAcc.displayDetails();
		dAcc.sellStocks(1, 100);
		dAcc.displayDetails();
	}
}
