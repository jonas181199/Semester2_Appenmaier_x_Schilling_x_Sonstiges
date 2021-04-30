package Sonstiges.Semester1.JavaBank;

import java.util.HashMap;

public class BackOffice {

	private final HashMap<Long, Account> allAccounts = new HashMap<>();

	void createNewAccount() {
		allAccounts.put(createId(), new Account());
	}

	void createNewOverdraftAccount() {
		allAccounts.put(createId(), new DispoAccount());
	}

	void depositCash(double amount, long accountNr) {
		if (isValidAccount(accountNr)) {

			Account currentAccount = allAccounts.get(accountNr);

			try {
				currentAccount.deposit(amount);
			} catch (Exception e) {
				System.err.println("Account Nr: " + accountNr + " - Fehler: " + e.getMessage());
			}

		} else
			System.err.println("Account Nr: " + accountNr + " ist nicht existent.");
	}

	void withdrawCash(double amount, long accountNr) {
		if (isValidAccount(accountNr)) {
			Account currentAccount = allAccounts.get(accountNr);

			try {
				currentAccount.withdraw(amount);

			} catch (Exception e) {
				System.err.println("Account Nr: " + accountNr + " - Fehler: " + e.getMessage());
			}

		} else
			System.err.println("Account Nr: " + accountNr + " ist nicht existent.");
	}

	void wireTransfer(double amount, long fromAccountNr, long toAccountNr) {
		if (fromAccountNr != toAccountNr) {
			withdrawCash(amount, fromAccountNr);
			depositCash(amount, toAccountNr);

		} else
			System.err.println("Transaktion nicht möglich, da beide Konten identisch sind.");
	}

	void getAccountStatus(long accountNr) {
		double accountBalance = allAccounts.get(accountNr).getAccountBalance();
		System.out.println("Account Nr: " + accountNr + " | Guthaben: " + accountBalance);
	}

	void getAllAccountStatus() {
		System.out.println("Alle Konten --------------------");
		for (long currentKey : allAccounts.keySet()) {
			getAccountStatus(currentKey);
		}
		System.out.println("--------------------------------\n");
	}

	boolean isValidAccount(long accountNr) {
		return allAccounts.containsKey(accountNr);
	}

	long createId() {
		return (long) allAccounts.size() + 1;
	}
}