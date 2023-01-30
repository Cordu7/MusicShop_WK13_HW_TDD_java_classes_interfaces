package items.instruments;

import behaviours.IPlay;
import items.Item;

import java.util.HashMap;


public abstract class Instrument  implements IPlay {

    private String make;


    private double priceBought;




    private double markup;

    private double profit;
    private double sellingPrice;




    public Instrument(String make, double priceBought, double markup) {
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

    public double getMarkup() {
        return markup;
    }

    public double getProfit() {
        return profit;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
