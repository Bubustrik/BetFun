/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.Bet;
import model.BetId;
import model.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class BetHelper {
    
    Session session;

    public BetHelper() {
         this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Bet> getAllBet () {
        session.beginTransaction();
        List<Bet> allBet = session.createQuery("from Bet").list();
        session.getTransaction().commit();

        return allBet;
    }
    
    public Bet getBet(int id) {
        session.beginTransaction();
        Bet bet = (Bet) session.createQuery("from Bet where id=" + id).uniqueResult();
        session.getTransaction();
        
        return bet;
    }
    
     public void addBet(Bet bet) {
        session.beginTransaction();
        try {
            session.save(bet);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateBet (Bet bet) {
        session.beginTransaction();
        try {
            session.update(bet);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteBet (BetId betId) {
        session.beginTransaction();
        Bet bet = new Bet();
        bet.setId(betId);
        try {
            session.delete(bet);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
}
