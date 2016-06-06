/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.UserHelper;
import java.util.List;
import model.Users;

/**
 *
 * @author Julien
 */
public class ClassementAction  extends ActionSupport {
    
    private List<Users> allUsers;
    private UserHelper helperUser;
    
    @Override
    public String execute() throws Exception {
       helperUser = new UserHelper();
       allUsers = helperUser.getUserByClassements();
       return SUCCESS;
    }
    
    public List<Users> getAllUser() {
        return allUsers;
    }
}
