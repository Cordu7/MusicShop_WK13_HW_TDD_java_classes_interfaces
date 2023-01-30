package items;

import behaviours.ISell;

public abstract class Item implements ISell {


    private String make;

    private double priceBought;
    private double sellingPrice;

    private double markup;

    private double profit;
//    mark-up is entered as a percentage, but as a double since the buying price is a double i.e 20% is entered as 0.2
//    in the constructor it will be calculated how much of a price increase is added to the buying price
//    then the selling price and the profit will be set as properties



    public Item(String make, double priceBought, double markup){

        this.make = make;
        this.priceBought = priceBought;
        this.markup = markup;
        this.profit = calculateProfit();
        this.sellingPrice = calculateSellingPrice();

    }

    public double calculateProfit(){
        return this.priceBought* this.markup;
    }

    public double calculateSellingPrice(){
        return this.priceBought + this.profit;
    }



    public String getMake() {
        return make;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getMarkup() {
        return markup;
    }

    public double getProfit() {
        return profit;
    }


}
