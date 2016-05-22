package helper;

import java.util.List;
import model.Users;
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
public class UserHelperTest {
    
    public UserHelperTest() {
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
     * Test getAllUser
     */
    @Test
    public void testGetAllUser() {
        System.out.println("getAllUser");
        UserHelper instance = new UserHelper();
        List<Users> expResult = null;
        List<Users> result = instance.getAllUser();
        assertEquals(expResult, result);
        fail("Fail");
    }

    /**
     * Test getUser
     */
    @Test
    public void testGetUser_String() {
        System.out.println("getUser : monemaildetest@epsi.fr");
        String email = "monemaildetest@epsi.fr";
        UserHelper instance = new UserHelper();
        Users expResult = null;
        Users result = instance.getUser(email);
        assertEquals(expResult, result);
        fail("Fail : test(monemaildetest@epsi.fr)");
    }

    /**
     * Test getUser
     */
    @Test
    public void testGetUser_int() {
        System.out.println("getUser : id=1");
        int id = 1;
        UserHelper instance = new UserHelper();
        Users expResult = null;
        Users result = instance.getUser(id);
        assertEquals(expResult, result);
        fail("Fail : getUser(1)");
    }

    /**
     * Test getPassword
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword : monemaildetest@epsi.fr");
        String email = "monemaildetest@epsi.fr";
        UserHelper instance = new UserHelper();
        String expResult = "";
        String result = instance.getPassword(email);
        assertEquals(expResult, result);
        fail("Fail : getPassword");
    }

    /**
     * Test saveOrUpdateUsers
     */
    @Test
    public void testSaveOrUpdateUsers() {
        System.out.println("saveOrUpdateUsers");
        Users users = null;
        UserHelper instance = new UserHelper();
        instance.saveOrUpdateUsers(users);
        fail("Fail : SaveOrUpdateUsers=null");
    }

    /**
     * Test DeleteUsers
     */
    @Test
    public void testDeleteUsers() {
        System.out.println("DeleteUsers : id=1");
        int id = 1;
        UserHelper instance = new UserHelper();
        instance.DeleteUsers(id);
        fail("Fail : Delete user, id=1");
    }
    
}
