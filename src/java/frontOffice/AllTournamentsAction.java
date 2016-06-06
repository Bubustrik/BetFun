/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.TournamentsHelper;
import java.util.List;
import model.Tournaments;

/**
 *
 * @author Julien
 */
public class AllTournamentsAction extends ActionSupport {

    private List<Tournaments> allTournaments;
    private TournamentsHelper helperTournaments;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public List<Tournaments> getAllTournaments() {
        helperTournaments = new TournamentsHelper();
        this.allTournaments = helperTournaments.getAllTournaments();
        return allTournaments;
    }
}
