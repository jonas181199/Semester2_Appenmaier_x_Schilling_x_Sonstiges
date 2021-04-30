package Appenmeier.Kapitel63;

public class SalaryIncreaseTooHighException extends Exception {

    public SalaryIncreaseTooHighException (){
        super("Die Gehaltserhöhung darf nicht mehr als 10% betragen.");
    }


}
