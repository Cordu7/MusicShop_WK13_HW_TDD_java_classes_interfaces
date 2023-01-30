
import items.instruments.Cello;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//could refactor cello to taki in not cello string type enum  but cello string type product so that there is a price have not added price to enum since this always changes so if so wants to buy s a string they byu an cello string type class and on the cello there is the enum

public class CelloTest {

    Cello cello;

    @Before

    public void before() {
        cello = new Cello( "Toto", 18_000.00, 0.2, 4);
    }


    @Test
    public void canGetMake(){
        assertEquals("Toto", cello.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(18_000.00, cello.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(0.2, cello.getMarkup(), 0.0);}

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, cello.getNumberOfStrings());
    }


    @Test
    public void canPlay(){
      assertEquals("squeech", cello.makesMusic());}
    @Test
    public void canGetSellingPrice(){
      assertEquals(21_600, cello.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(3600.00, cello.getProfit(), 0.0);}


}
