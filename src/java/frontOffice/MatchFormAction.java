/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import helper.GroupsHelper;
import helper.MatchsHelper;
import java.util.Date;
import java.util.Map;
import model.Groups;
import model.Matchs;
import model.Users;

/**
 *
 * @author HAL
 */
public class MatchFormAction extends ActionSupport {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Date resultDate;

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Users user = (Users) session.get("User");
        MatchsHelper helperMatch = new MatchsHelper();
        GroupsHelper helperGroups = new GroupsHelper();
        Groups group = helperGroups.getGroups(1);
        Matchs match = new Matchs(group, user, name, startDate, endDate, resultDate);
        match.setDescription(description);
        helperMatch.addMatch(match);
        return SUCCESS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

}
