package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private String type;

    private String make;

    private double priceBought;
    private double sellingPrice;

    private double markup;

    private double profit;
//    mark-up is entered as a percentage, but as a double since the buying price is a double
//    in the constructor it will be calculated how much of a price increase is added to the buying price
//    then the selling price and the profit will be set as properties



    public Item(String type, String make, double priceBought, double markup){
        this.priceBought = priceBought;
        this.make = make;
        this.priceBought = priceBought;
        this.markup = markup;
        this.sellingPrice = 0;
        this.profit = 0;

    }






}
