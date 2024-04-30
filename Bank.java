package mahaboob.com23CipherbyteTechnologies;

import java.util.HashMap;
import java.util.Map;

class Bank {
	private Map<String, Double> accounts;

	public Bank() {
		this.accounts = new HashMap<>();
	}

	public void createAccount(String accountNumber, double initialBalance) {
		if (!accounts.containsKey(accountNumber)) {
			accounts.put(accountNumber, initialBalance);
			System.out.println("Account created successfully.");
		} else {
			System.out.println("Account number already exists.");
		}
	}

	public void deposit(String accountNumber, double amount) {
		if (accounts.containsKey(accountNumber)) {
			double currentBalance = accounts.get(accountNumber);
			accounts.put(accountNumber, currentBalance + amount);
			System.out.println("Deposit successful. New balance: " + accounts.get(accountNumber));
		} else {
			System.out.println("Account number does not exist.");
		}
	}

	public void withdraw(String accountNumber, double amount) {
		if (accounts.containsKey(accountNumber)) {
			double currentBalance = accounts.get(accountNumber);
			if (currentBalance >= amount) {
				accounts.put(accountNumber, currentBalance - amount);
				System.out.println("Withdrawal successful. New balance: " + accounts.get(accountNumber));
			} else {
				System.out.println("Insufficient funds.");
			}
		} else {
			System.out.println("Account number does not exist.");
		}
	}

	public void transfer(String fromAccount, String toAccount, double amount) {
		if (accounts.containsKey(fromAccount) && accounts.containsKey(toAccount)) {
			double fromBalance = accounts.get(fromAccount);
			if (fromBalance >= amount) {
				double toBalance = accounts.get(toAccount);
				accounts.put(fromAccount, fromBalance - amount);
				accounts.put(toAccount, toBalance + amount);
				System.out.println("Transfer successful.");
				System.out.println("From Account " + fromAccount + " Balance: " + accounts.get(fromAccount));
				System.out.println("To Account " + toAccount + " Balance: " + accounts.get(toAccount));
			} else {
				System.out.println("Insufficient funds.");
			}
		} else {
			System.out.println("One or both account numbers do not exist.");
		}
	}
}
