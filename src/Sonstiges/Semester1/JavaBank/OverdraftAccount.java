package Sonstiges.Semester1.JavaBank;

class DispoAccount extends Account {

    double overdraftLimit = 500.0;

    void withdraw(double balance) throws Exception {
        if (accountBalance + overdraftLimit >= balance)
            accountBalance -= balance;

        else
            throw new Exception("Ihr Kontostand von " + accountBalance + " ist nicht ausreichend für eine Auszahlung über " + balance);
    }
}