//import items.InstrumentString;
//import items.CelloStringType;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class InstrumentStringTest {
//
//    InstrumentString celloStringC;
//    InstrumentString celloStringG;
//    InstrumentString celloStringD;
//    InstrumentString celloStringA;
//
//    @Before
//    public void before() {
//
//        celloStringC = new InstrumentString(CelloStringType.C, "Best", 2.50, 0.5);
//        celloStringG = new InstrumentString(CelloStringType.G, "Best",2.50, 0.5);
//        celloStringD = new InstrumentString(CelloStringType.D, "Best",2.50, 0.5);
//        celloStringA = new InstrumentString(CelloStringType.A, "Best",2.50, 0.5);
//    }
//
//    @Test
//    public void hasStringTypeC(){
//        assertEquals(CelloStringType.C, celloStringC.getStringType());
//    }
//    @Test
//    public void hasStringTypeG(){
//        assertEquals(CelloStringType.G, celloStringC.getStringType());
//    }
//    @Test
//    public void hasStringTypeD(){
//        assertEquals(CelloStringType.D, celloStringC.getStringType());
//    }
//    @Test
//    public void hasStringTypeA(){
//        assertEquals(CelloStringType.A, celloStringC.getStringType());
//    }
//    @Test
//    public void hasPrettyStringTypeA(){
//        assertEquals("A", celloStringA.getStringNameFromEnum());
//    }
//
//
//    @Test
//    public void canGetPriceBought(){
//        assertEquals(2.50, celloStringC.getPriceBought(), 0.0);}
//    @Test
//    public void canGetMarkup(){
//        assertEquals(0.5, celloStringC.getMarkup(), 0.0);}
//    @Test
//    public void canGetSellingPrice(){
//        assertEquals(, celloStringC.getSellingPrice(),0.0);}
//
//    @Test
//    public void canGetProfitMade(){
//        assertEquals(, celloStringC.getProfit(), 0.0);}
//
//
//}
