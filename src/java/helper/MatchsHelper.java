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
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
     
    
    
    public List<Matchs> getAllMatchs () {
        session.beginTransaction();
        List<Matchs> allMatchs = session.createQuery("from Matchs order by endDate desc").list();
        session.close();
        return allMatchs;
    }
    
    public List<Matchs> getCurrentsMatch () {
        session.beginTransaction();
        List<Matchs> currentsMatch = session.createSQLQuery("select * from Matchs\n"
                + "Where startDate <= NOW()\n"
                + "AND endDAte >= NOW()").list();
        session.close();
        return currentsMatch;
    }
    
    public Matchs getMatch(int id) {
        session.beginTransaction();
        Matchs tournament = (Matchs) session.createQuery("from Matchs where id =" + id).uniqueResult();
        session.close();
        return tournament;
    }
    
    public void addMatch(Matchs match) {
        session.beginTransaction();
        try {
            session.save(match);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
    public void updateMatch (Matchs match) {
        session.beginTransaction();
        try {
            session.update(match);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
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
        } finally {
            session.close();
        }
    }
    
}
