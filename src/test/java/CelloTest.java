import items.instruments.Cello;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

public class CelloTest {
    ArrayList<CelloString>celloStrings;
    Cello cello;

    @Before

   celloStrings = new ArrayList<CelloString>()


    cello = new Cello("Full sized Cello", "Toto", 18_000.00, 0.2 "Wood", celloStrings);


    @Test
    public void canGetType(){
        assertEquals("Full sized Cello", cello.getType());}
    @Test
    public void canGetMake(){
        assertEquals("Toto", cello.getMake());}
    @Test
    public void canGetPriceBought(){
        assertEquals(18_000.00, cello.getPriceBought(),0.0);}
    @Test
    public void canGetMarkup(){
        assertEquals(20.00, cello.getMarkup(), 0.0);}
    @Test
    public void canGetMaterial(){
        assertEquals("Wood", cello.getMaterial());}
    @Test
    public void canGetCelloStrings(){
        assertEquals(celloStrings , cello.getCelloStrings());}
    @Test
    public void canPlay(){
      assertEquals("squeech", cello.makesMusic());}
    @Test
    public void canGetSellingPrice(){
      assertEquals(21_600, cello.getSellingPrice(),0.0);}

    @Test
    public void canGetProfitMade(){
        assertEquals(3600.00, cello.getProfitMade(), 0.0);}


}
