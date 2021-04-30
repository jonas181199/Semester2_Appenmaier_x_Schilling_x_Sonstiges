package Appenmeier.Kapitel63;

public class SalaryDecreaseException extends Exception {

    public SalaryDecreaseException(){
        super("Das Gehalt darf nicht gekürzt werden.");
    }

}
