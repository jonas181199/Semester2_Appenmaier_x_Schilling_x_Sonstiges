package Sonstiges.Semester1.JavaBank;

class Account {

	double accountBalance = 0.0;

	void deposit(double balance) throws Exception {
		if (balance < 10000.0)
			accountBalance += balance;

		else
			throw new Exception("Es handelt sich um eine zu hohe Bareinzahlung.");
	}

	void withdraw(double balance) throws Exception {
		if (accountBalance >= balance)
			accountBalance -= balance;

		else
			throw new Exception("Ihr Kontostand von " + accountBalance
					+ " ist nicht ausreichend für eine Auszahlung über " + balance);
	}

	double getAccountBalance() {
		return accountBalance;
	}
}