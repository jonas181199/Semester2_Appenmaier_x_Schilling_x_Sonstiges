package Appenmeier.Supermarkt;

public class Goods extends Product implements Comparable {

    private ClassOfGoods classOfGoods;

    public Goods(int id, String description, ClassOfGoods classOfGoods, String unit, double price, Currency currency) {
        super(id, description, unit, price, currency);
        this.classOfGoods = classOfGoods;
    }

    @Override
    public void displayProduct() {
        System.out.println(getId() + "       " + getDescription() + "       " +  classOfGoods.getDescription() +  "       " + getUnit() + "       " +  getPrice() + " " + getCurrency().getCurrencyChar());
    }

    public int compareTo(Goods goods){
        return 1;
    }



}
