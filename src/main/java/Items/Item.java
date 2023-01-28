package Items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private String type;
    private double priceBought;
    private double sellingPrice;

    private double markup;



    public Item(String type, double priceBought, double markup){
        this.priceBought = priceBought;
        this.priceBought = priceBought;
        this.markup = markup;
        this.sellingPrice = 0;

    }






}
