package Appenmeier.Supermarkt;

public class ShoppingCartItem {

    private Goods goods;
    private int amount;
    private double subtotal;

    public ShoppingCartItem(Goods goods, int amount){
        this.goods = goods;
        this.amount = amount;
    }

    public void displayShoppingCartItem(){
        System.out.println(goods + " " + subtotal);
    }
}
