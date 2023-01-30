package items.instruments;



import java.util.ArrayList;

public class Cello extends Instrument {

    private int numberOfStrings;

    public Cello(String make, double priceBought, double markup, int numberOfStrings) {
        super(make, priceBought, markup);
        this.numberOfStrings = numberOfStrings;


    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String makesMusic() {
        return "squeech";
    }
}


