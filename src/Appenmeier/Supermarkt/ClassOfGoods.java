package Appenmeier.Supermarkt;

public enum ClassOfGoods {

    BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Früchte"), VEGETABLES("Gemüse");
    private String description;

    ClassOfGoods (String description){
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
