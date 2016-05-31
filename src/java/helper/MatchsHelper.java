/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Matchs;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class MatchsHelper {
    
    Session session = null;

    public MatchsHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
     
    public List<Matchs> getAllMatchs () {
        session.beginTransaction();
        List<Matchs> allMatchs = session.createQuery("from Matchs").list();
        session.getTransaction().commit();
        return allMatchs;
    }
    
    public List<Matchs> getCurrentsMatch () {
        session.beginTransaction();
        List<Matchs> currentsMatch = session.createSQLQuery("select * from Matchs\n"
                + "Where startDate <= NOW()\n"
                + "AND endDAte >= NOW()").list();
        session.getTransaction().commit();
        return currentsMatch;
    }
    
    public Matchs getMatch(int id) {
       org.hibernate.Transaction tx = session.beginTransaction();
        Matchs tournament = (Matchs) session.createQuery("from Tournaments where id =" + id).uniqueResult();
        return tournament;
    }
    
    public void addMatch(Matchs match) {
        session.beginTransaction();
        try {
            session.save(match);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateMatch (Matchs match) {
        session.beginTransaction();
        try {
            session.update(match);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteMatch (int id) {
        session.beginTransaction();
        Matchs match = new Matchs();
        match.setId(id);
        try {
            session.delete(match);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
}
