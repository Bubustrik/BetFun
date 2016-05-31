/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Tournaments;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class TournamentsHelper {

    Session session = null;

    public TournamentsHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Tournaments> getAllTournaments() {
        org.hibernate.Transaction tx = session.beginTransaction();
        List<Tournaments> allTournaments = session.createQuery("from Tournaments").list();
        return allTournaments;
    }

    public List<Tournaments> getCurrentTournaments() {
        session.beginTransaction();
        List<Tournaments> currentTournaments = session.createSQLQuery("select * from Tournaments\n"
                + "Where startDate <= NOW()\n"
                + "AND endDAte >= NOW()").list();
        session.getTransaction().commit();
        return currentTournaments;
    }

    public Tournaments getTournaments(int id) {
        org.hibernate.Transaction tx = session.beginTransaction();
        Tournaments tournament = (Tournaments) session.createQuery("from Tournaments where id =" + id).uniqueResult();
        return tournament;
    }

    public void addTournaments(Tournaments tournament) {
        session.beginTransaction();
        try {
            session.save(tournament);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateTournaments (Tournaments tournament) {
        session.beginTransaction();
        try {
            session.update(tournament);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteTournaments (int id) {
        session.beginTransaction();
        Tournaments tournament = new Tournaments();
        tournament.setId(id);
        try {
            session.delete(tournament);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
