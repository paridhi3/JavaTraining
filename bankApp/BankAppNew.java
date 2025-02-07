package bankApp;

import java.util.Scanner;

public class BankAppNew {
	
	public static BankAccount[] accounts;
	private static int totalAccounts = 0;
	private static int maxAccounts = 5;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		accounts = new BankAccount[5];
		
		while(true) {
			System.out.println("Bank Menu");
			System.out.println("Press 1: To create account");
			System.out.println("Press 2: To display all accounts");
			System.out.println("Press 3: Deposit money");
			System.out.println("Press 4: Withdraw money");
			System.out.println("Press 5: Transfer money");
			System.out.println("Press 6: Buy Stocks");
			System.out.println("Press 7: Sell Stocks");
			System.out.println("Press 8: Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				displayAllAccounts();
				break;
			case 3:
				depositMoney(sc);
				break;
			case 4:
				withdrawMoney(sc);
				break;
			case 5:
				transferMoney(sc);
				break;
			case 6:
				buyStocks(sc);
				break;
			case 7:
				sellStocks(sc);
				break;
			case 8:
				System.out.println("Thank you");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
	
	
	public static void createAccount(Scanner sc) {
		if(totalAccounts >= maxAccounts) {
			System.out.println("Cannot create more accounts");
			return;
		}
		
		System.out.println("Enter Account Number: ");
		int accNum = sc.nextInt();
		
		System.out.println("Enter Account Holder Name: ");
		String name = sc.next();
		
		System.out.println("Enter Account Balance: ");
		double bal = sc.nextDouble();
		
		System.out.println("Press 1: Bank account");
		System.out.println("Press 2: Savings Bank account");
		System.out.println("Press 3: Premium Bank Account");
		System.out.println("Press 4: Demat Account");
		int response = sc.nextInt();
		
		switch(response) {
		case 1:
			accounts[totalAccounts] = new BankAccount(accNum, name, bal);
			break;
		case 2:
			System.out.println("Enter Interest Rate: ");
			double intRate = sc.nextDouble();
			accounts[totalAccounts] = new SavingsBankAccClass(accNum, name, bal, intRate);
			break;
		case 3:
			System.out.println("Enter Interest Rate: ");
			double intRate2 = sc.nextDouble();
			System.out.println("Enter Bonus Interest Rate: ");
			double bonusInterest = sc.nextDouble();
			accounts[totalAccounts] = new PremiumBankAcc(accNum, name, bal, intRate2, bonusInterest);
			break;
		case 4:
			System.out.println("Enter total stocks: ");
			int stocks = sc.nextInt();
			accounts[totalAccounts] = new DematClass(accNum, name, bal, stocks);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		System.out.println("Account created successfully!");
		totalAccounts++;
	}
	
	public static void displayAllAccounts() {
		if(totalAccounts==0) {
			System.out.println("No Accounts to display");
			return;
		}
		System.out.println("Bank Account details:");
		for(int i=0; i<totalAccounts; i++) {
			accounts[i].displayDetails();
			System.out.println("-------------------------------------");
		}
	}
	
//	public static void depositMoney(Scanner sc) {
//		System.out.println("Enter Account Number: ");
//		int accNum = sc.nextInt();
//		
//		System.out.println("Enter Amount to deposit: ");
//		double amount = sc.nextDouble();
//		
//		BankAccount account = findAccount(accNum);
//		
//		if(account!=null) {
//			account.deposit(amount);
//		}
//		else {
//			System.out.println("Account not found");
//		}
//	}
	
	// multiple deposits
    public static void depositMoney(Scanner sc) {
        System.out.println("Enter Account Number:");
        int accNum = sc.nextInt();

        while (true) {
            System.out.println("Enter Amount to deposit:");
            double amount = sc.nextDouble();

            BankAccount account = findAccount(accNum);

            if (account != null) {
                account.deposit(amount);
                System.out.println("Deposit successful. Current balance: " + account.getBalance());
            } else {
                System.out.println("Account not found");
                break;
            }

            System.out.println("Do you want to make another deposit? (yes/no):");
            String response = sc.next();
            
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
	
	public static BankAccount findAccount(int accNumber) {
		for(int i=0; i<totalAccounts; i++) {
			if(accounts[i].getAccountNumber()==accNumber) {
				return accounts[i];
			}
		}
		return null;
	}
	
	public static void withdrawMoney(Scanner sc) {
		System.out.println("Enter Account Number: ");
		int accNum = sc.nextInt();
		
		System.out.println("Enter Amount to withdraw: ");
		double amount = sc.nextDouble();
		
		BankAccount account = findAccount(accNum);
		
		if(account!=null) {
			account.withdraw(amount);
		}
		else {
			System.out.println("Account not found");
		}
	}
	
	public static void transferMoney(Scanner sc) {
		System.out.println("Enter Account Number of sender: ");
		int sAccNum = sc.nextInt();
		
		System.out.println("Enter Account Number of recipient: ");
		int rAccNum = sc.nextInt();
		
		System.out.println("Enter Amount to transfer: ");
		double amount = sc.nextDouble();
		
		BankAccount sAcc = findAccount(sAccNum);
		BankAccount rAcc = findAccount(rAccNum);
		
		if(sAcc != null && rAcc != null) {
			sAcc.transfer(amount, rAcc);
		} else
		{
			System.out.println("Bank Account not Found!");
		}
	}
	
	public static void buyStocks(Scanner sc) {
		System.out.println("Enter Account Number: ");
		int dAccNum = sc.nextInt();
		
		System.out.println("Enter stock quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter Price per stock: ");
		double pricePerStock = sc.nextDouble();
		
		BankAccount dAcc = findAccount(dAccNum);
		
		if(dAcc!=null) {
			((DematClass) dAcc).buyStocks(quantity, pricePerStock);
		}
	}
	
	public static void sellStocks(Scanner sc) {
		System.out.println("Enter Account Number: ");
		int dAccNum = sc.nextInt();
		
		System.out.println("Enter stock quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter Price per stock: ");
		double pricePerStock = sc.nextDouble();
		
		BankAccount dAcc = findAccount(dAccNum);
		
		if(dAcc!=null) {
			((DematClass) dAcc).sellStocks(quantity, pricePerStock);
		}
	}
	

}
