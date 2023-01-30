import items.DrumStick;
import items.MusicStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    MusicStand musicStand;

    @Before

    public void before() {
        musicStand = new MusicStand( "Grape", 10.00, 0.5);
    }


    @Test
    public void canGetMake(){
        assertEquals("Grape", musicStand.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(10.00, musicStand.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(0.5, musicStand.getMarkup(), 0.0);}


    @Test
    public void canGetSellingPrice(){
        assertEquals(15.00, musicStand.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(5.00, musicStand.getProfit(), 0.0);}

}
