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
public class AccountAction extends ActionSupport {

    private Users user;
    private UserHelper helperUser;

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        String email = (String) session.get("emailUser");
        helperUser = new UserHelper();
        this.user = helperUser.getUser(email);
        return SUCCESS;
    }

    public Users getUser() {
        return user;
    }

}
