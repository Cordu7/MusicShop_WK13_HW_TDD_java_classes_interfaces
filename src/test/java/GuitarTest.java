import items.instruments.Cello;
import items.instruments.Guitar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    public void before() {
        guitar = new Guitar( "May", 28_000.00, 0.2, 6);
    }

    @Test
    public void canGetMake(){
        assertEquals("May", guitar.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(28_000.00, guitar.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(0.2, guitar.getMarkup(), 0.0);}

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }


    @Test
    public void canPlay(){
        assertEquals("pling", guitar.makesMusic());}
    @Test
    public void canGetSellingPrice(){
        assertEquals(33_600, guitar.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(5600.00, guitar.getProfit(), 0.0);}


}
