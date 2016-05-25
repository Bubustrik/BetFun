package helper;

import java.util.List;
import model.Choices;
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
public class ChoicesHelperTest {
    
    public ChoicesHelperTest() {
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
     * Test getAllChoices
     */
    @Test
    public void testGetAllChoices() {
        System.out.println("getAllChoices");
        ChoicesHelper instance = new ChoicesHelper();
        List<Choices> expResult = null;
        List<Choices> result = instance.getAllChoices();
        assertEquals(expResult, result); 
        fail("Fail : getAllChoices()");
    }
    
}
