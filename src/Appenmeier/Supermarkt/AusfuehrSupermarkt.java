package Appenmeier.Supermarkt;

public class AusfuehrSupermarkt {

    public static void main (String[] args){
        Goods jogurt = new Goods(1, "Jogurt", ClassOfGoods.DAIRY_PRODUCTS, "Becher", 0.99, Currency.EURO);
        jogurt.displayProduct();
    }


}
