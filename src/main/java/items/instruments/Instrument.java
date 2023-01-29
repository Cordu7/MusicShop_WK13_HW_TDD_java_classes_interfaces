package items.instruments;

import items.Item;

import java.util.HashMap;


public abstract class Instrument extends Item {

    private String material;




    public Instrument(String type, String make, double priceBought, double markup, String material) {
        super(type, make, priceBought, markup);
        this.material = material;
    }
}
