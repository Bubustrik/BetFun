package frontOffice;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author PierreP
 */
public class LoginActionTest {
    
    public LoginActionTest() {
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
        LoginAction instance = new LoginAction();
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
        LoginAction instance = new LoginAction();
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
        LoginAction instance = new LoginAction();
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
        LoginAction instance = new LoginAction();
        instance.setPassword(password); 
        fail("Fail : setPassword");
    }
    
}
