package Appenmeier.Supermarkt;

public abstract class Product {

    private int id;
    private String description;
    private String unit;
    private double price;
    private Currency currency;

    public Product (int id, String description, String unit, double price, Currency currency){
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.price = price;
        this.currency = currency;
    }

    public abstract void displayProduct();

    public int getId() {
        return id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getDescription() {
        return description;
    }

    public String getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

}
