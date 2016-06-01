/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author Julien
 */
public class LogoutAction extends ActionSupport{
    
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        session.remove("logined");
        session.remove("context");
        return SUCCESS;
    }
}
