package items;

public class DrumStick extends Item{


    private String material;
    public DrumStick(String make, double priceBought, double markup, String material) {
        super(make, priceBought, markup);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
