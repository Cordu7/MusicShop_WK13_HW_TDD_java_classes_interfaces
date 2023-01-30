package items.instruments;

public class Drum extends Instrument{

    private String pedal;


    public Drum(String make, double priceBought, double markup, String pedal) {
        super(make, priceBought, markup);
        this.pedal = pedal;
    }

    public String makesMusic() {
        return "boing";
    }

    public String getPedal() {
        return pedal;
    }
}
