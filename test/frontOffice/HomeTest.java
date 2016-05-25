package frontOffice;

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
public class HomeTest {
    
    public HomeTest() {
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
     * Test getLogin
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Home instance = new Home();
        String expResult = "Login1";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        fail("Fail : getLogin : " + result);
    }

    /**
     * Test getPassword
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Home instance = new Home();
        String expResult = "motdepasse";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("Fail : getPassword : " + result);
    }

    /**
     * Test setLogin
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "Login1";
        Home instance = new Home();
        instance.setLogin(login);
        fail("Fail : setLogin");
    }

    /**
     * Test setPassword
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "motdepasse";
        Home instance = new Home();
        instance.setPassword(password); 
        fail("Fail : setPassword");
    }
    
}
