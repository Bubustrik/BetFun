/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Tournaments;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class TournamentsHelper {
    
    Session session = (Session) HibernateUtil.getSessionFactory();
     
    public List<Tournaments> getAllTournaments () {
        session.beginTransaction();
        List<Tournaments> allTournaments = session.createQuery("from Tournaments").list();
        session.getTransaction().commit();
        return allTournaments;
    }
    
    /*public List<Tournaments> getCurrentTournaments() {
        session.beginTransaction();
        List<Tournaments> currentTournaments = session.createQuery("from Tournaments").list();
        session.getTransaction().commit();
        return currentTournaments;
    }*/
    
    public Tournaments getTournaments(int id) {
        session.beginTransaction();
        Tournaments tournament = (Tournaments) session.createQuery("from Tournaments where id =" + id);
        session.getTransaction().commit();
        return tournament;
    }
    
    public void addTournaments(Tournaments tournament) {
        
    }
}
