import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author IkerGisbert
 * @since 27/02/2023
 * @version 1.0
 */

public class PlanetaTest {    

/**
* @param Boreng 
 * @param
*/

    Planeta Boreng = new Planeta(null,2000,3000);
    Planeta Zeng = new Planeta(null,1000,1500);

    @Test 
    public void testPlanetaEnano()
    {     
    Planeta Boreng = new Planeta(null,2000,3000);
    int expected = 0;
    int actual = Boreng.planetaEnano();
    assertEquals(expected, actual,0);

    Planeta Zeng = new Planeta(null,1000,1500);
    int expected2 = -1;
    int actual2 = Boreng.planetaEnano();
    assertEquals(expected, actual,0.0);

    }    

    @Test 
    public void testExpansio()
    {
    Planeta Boreng = new Planeta(null,2000,3000);
    Boreng.expansio();
    int expected = 6000;
    assertEquals(expected, Boreng.getDiametre());

    }

    @Test 
    public void testColisio()
    {        
        Planeta Boreng = new Planeta(null,2000,3000);
        int expected = 0;
        int actual = Boreng.colisio(200);
        assertEquals(expected, actual);

        Planeta Zeng = new Planeta(null,1000,1500);
        int expected2 = -1;
        int actual2 = Boreng.colisio(500);
        assertEquals(expected2, actual2);

        Planeta Manuel = new Planeta(null,2000,3000);
        Boreng.colisio(300);
        int expected3 = 2150;
        assertEquals(expected3, Boreng.getDiametre());

        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
