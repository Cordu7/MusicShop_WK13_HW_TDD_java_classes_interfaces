import items.DrumStick;
import items.instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before

    public void before() {
        drumStick = new DrumStick( "yamaha", 2.00, 0.8, "wood");
    }


    @Test
    public void canGetMake(){
        assertEquals("yamaha", drumStick.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(2.00, drumStick.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(0.8, drumStick.getMarkup(), 0.0);}

    @Test
    public void canGetDrumPedal(){
        assertEquals("wood", drumStick.getMaterial());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(3.60, drumStick.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(1.60, drumStick.getProfit(), 0.0);}

}
