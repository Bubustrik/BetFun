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

    private String login;
    private String password;
    private UserHelper helperUser;

    @Override
    public String execute() throws Exception {
        if (!login.isEmpty()) {
            helperUser = new UserHelper();
            Users user = helperUser.getUser(login);
            if (login.equals(user.getEmail()) && password.equals(user.getPassword())) {
                Map session = ActionContext.getContext().getSession();
                session.put("Logined", "true");
                session.put("context", new Date());
            }
        }
        return SUCCESS;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
