package items.instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;
    public Guitar(String make, double priceBought, double markup, int numberOfStrings) {
        super(make, priceBought, markup);
        this.numberOfStrings = numberOfStrings;
    }



    public String makesMusic() {
        return "pling";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
