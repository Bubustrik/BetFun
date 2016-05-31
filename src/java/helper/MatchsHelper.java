/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Matchs;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class MatchsHelper {
    
    Session session = (Session) HibernateUtil.getSessionFactory();
     
    public List<Matchs> getAllMatchs () {
        session.beginTransaction();
        List<Matchs> allMatchs = session.createQuery("from Matchs").list();
        session.getTransaction().commit();
        return allMatchs;
    }
    
    /*public List<Matchs> getCurrentsMatch () {
        session.beginTransaction();
        List<Matchs> currentsMatch = session.createQuery("from Matchs").list();
        session.getTransaction().commit();
        return currentsMatch;
    }*/
    
}
