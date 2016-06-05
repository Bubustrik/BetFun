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
import java.util.Map;
import model.Users;

/**
 *
 * @author Julien
 */
public class ChangePwdAction extends ActionSupport {

    private String passwordOld;
    private String passwordNew;
    private String passwordConfirmed;

    @Override
    public String execute() throws Exception {
        if (passwordOld != null) {
            UserHelper helperUser = new UserHelper();
            Map session = ActionContext.getContext().getSession();
            String email = (String) session.get("emailUser");
            System.out.println(email);
            Users user = helperUser.getUser(email);
            if (passwordOld.equals(user.getPassword()) && passwordNew.equals(passwordConfirmed)) {
                user.setPassword(passwordNew);
                helperUser = new UserHelper();
                helperUser.updateUsers(user);
                return SUCCESS;
            }
        }
        return INPUT;

    }

    public void setPasswordOld(String passwordOld) {
        this.passwordOld = passwordOld;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }

    public void setPasswordConfirmed(String passwordConfirmed) {
        this.passwordConfirmed = passwordConfirmed;
    }

    
}
