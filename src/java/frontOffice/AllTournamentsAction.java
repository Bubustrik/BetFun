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
public class AllTournamentsAction extends ActionSupport
{
    private Tournaments tournaments = new Tournaments();
    private TournamentsHelper helperTournaments;
    
    @Override
    public String execute() throws Exception {
       return SUCCESS;
    }
    
    public List<Tournaments> getAllTournaments() {
        List<Tournaments> allTournament;
        helperTournaments = new TournamentsHelper();
        allTournament = helperTournaments.getAllTournaments();
        return allTournament;
    }
}