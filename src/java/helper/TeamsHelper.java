/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Teams;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class TeamsHelper {
    
    Session session;

    public TeamsHelper() {
         this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Teams> getAllTeams () {
        session.beginTransaction();
        List<Teams> allTeams = session.createQuery("from Teams").list();
        session.getTransaction().commit();

        return allTeams;
    }
    
    public Teams getTeams(int id) {
        session.beginTransaction();
        Teams team = (Teams) session.createQuery("from Teams where id=" + id).uniqueResult();
        session.getTransaction();
        return team;
    }
    
     public void addTeams(Teams team) {
        session.beginTransaction();
        try {
            session.save(team);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateTeams (Teams team) {
        session.beginTransaction();
        try {
            session.update(team);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteTeams (int id) {
        session.beginTransaction();
        Teams team = new Teams();
        team.setId(id);
        try {
            session.delete(team);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
