package helper;

import model.Appartenir;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PierreP
 */
public class BelongHelperTest {
    
    public BelongHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test getAppartenir
     */
    @Test
    public void testGetAppartenir() {
        System.out.println("getAppartenir : id=1");
        int id = 1;
        BelongHelper instance = new BelongHelper();
        Appartenir expResult = null;
        Appartenir result = instance.getAppartenir(id);
        assertEquals(expResult, result);
        fail("Fail : getAppartenir(1)");
    }
    
}
