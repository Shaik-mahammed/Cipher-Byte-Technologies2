package mahaboob.com23CipherbyteTechnologies;

import java.util.Scanner;
public class BankY {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("\nBankY - Choose an option:");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter account number: ");
				String accNum = scanner.nextLine();
				System.out.print("Enter initial balance: ");
				double initialBalance = scanner.nextDouble();
				bank.createAccount(accNum, initialBalance);
				break;
			case 2:
				System.out.print("Enter account number: ");
				String depositAccNum = scanner.nextLine();
				System.out.print("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				bank.deposit(depositAccNum, depositAmount);
				break;
			case 3:
				System.out.print("Enter account number: ");
				String withdrawAccNum = scanner.nextLine();
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = scanner.nextDouble();
				bank.withdraw(withdrawAccNum, withdrawAmount);
				break;
			case 4:
				System.out.print("Enter from account number: ");
				String fromAccNum = scanner.nextLine();
				System.out.print("Enter to account number: ");
				String toAccNum = scanner.nextLine();
				System.out.print("Enter transfer amount: ");
				double transferAmount = scanner.nextDouble();
				bank.transfer(fromAccNum, toAccNum, transferAmount);
				break;
			case 5:
				System.out.println("Exiting BankY. Goodbye!");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}

