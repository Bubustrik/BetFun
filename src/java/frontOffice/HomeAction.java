package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.TournamentsHelper;
import model.Tournaments;

/**
 * HomeAction Class
 */
public class HomeAction extends ActionSupport {
  
    private String login;
    private String password;

    @Override
    public String execute() throws Exception {
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
