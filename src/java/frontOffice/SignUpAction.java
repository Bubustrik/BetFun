/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.UserHelper;
import model.Users;

/**
 *
 * @author Julien
 */
public class SignUpAction extends ActionSupport {
    
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private String confirmatedPassword;
  
    @Override
    public String execute() throws Exception {
       if (lastName != null && password.equals(confirmatedPassword)) {
           Users user = new Users(lastName, firstName, false, false, email, false, password);
           UserHelper usersHelper = new UserHelper();
           usersHelper.addUsers(user);
           return SUCCESS;
       }
       return INPUT;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmatedPassword(String confirmatedPassword) {
        this.confirmatedPassword = confirmatedPassword;
    }
    
    
    
}
