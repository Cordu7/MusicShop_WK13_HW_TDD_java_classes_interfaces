import items.instruments.Cello;
import items.instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drum drum;

    @Before

    public void before() {
        drum = new Drum( "yamaha", 6_000.00, 0.3, "drum pedal");
    }


    @Test
    public void canGetMake(){
        assertEquals("Toto", drum.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(6_000.00, drum.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(0.3, drum.getMarkup(), 0.0);}

    @Test
    public void canGetDrumPedal(){
        assertEquals("drum pedal", drum.getPedal());
    }


    @Test
    public void canPlay(){
        assertEquals("boing", drum.makesMusic());}
    @Test
    public void canGetSellingPrice(){
        assertEquals(7800, drum.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(1800.00, drum.getProfit(), 0.0);}

}
