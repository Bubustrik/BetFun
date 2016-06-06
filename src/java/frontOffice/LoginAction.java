/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import helper.UserHelper;
import java.util.Date;
import java.util.Map;
import model.Users;

/**
 *
 * @author Julien
 */
public class LoginAction extends ActionSupport {

    private String email;
    private String password;
    private UserHelper helperUser;

    @Override
    public String execute() throws Exception {
        if (email != null) {
            helperUser = new UserHelper();
            Users user = helperUser.getUser(email);
            if (password.equals(user.getPassword())) {
                Map session = ActionContext.getContext().getSession();
                session.put("User", user);
                session.put("Logined", "true");
                session.put("context", new Date());
                return SUCCESS;
            }
        }
        return ERROR;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
