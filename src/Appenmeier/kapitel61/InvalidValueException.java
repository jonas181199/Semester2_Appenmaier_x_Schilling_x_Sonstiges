package Appenmeier.kapitel61;

public class InvalidValueException extends Exception {

    public InvalidValueException(double value) { //Wert mitgeben
        super("Ungültiger Wert: " + value);
    }
}
