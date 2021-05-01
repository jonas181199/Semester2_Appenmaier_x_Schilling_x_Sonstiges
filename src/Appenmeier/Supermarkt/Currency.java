package Appenmeier.Supermarkt;

public enum Currency{

    EURO("Euro", '€'), DOLLAR("Dollar", '$');

    private String description;
    private char currencyChar;

    Currency(String description, char currencyChar) {
        this.description = description;
        this.currencyChar = currencyChar;
    }

    public char getCurrencyChar() {
        return currencyChar;
    }
}
