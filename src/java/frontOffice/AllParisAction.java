/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.MatchsHelper;
import java.util.List;
import model.Matchs;

/**
 *
 * @author Julien
 */
public class AllParisAction extends ActionSupport {

    private List<Matchs> allMatchs;
    private MatchsHelper helperMatchs;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    public List<Matchs> getAllMatchs() {
        helperMatchs = new MatchsHelper();
        this.allMatchs = helperMatchs.getAllMatchs();
        return allMatchs;
    }
}
