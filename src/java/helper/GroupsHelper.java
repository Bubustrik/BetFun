/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.Groups;
import model.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class GroupsHelper {
    
     Session session;

    public GroupsHelper() {
         this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Groups> getAllGroups () {
        session.beginTransaction();
        List<Groups> allGroups = session.createQuery("from Groups").list();
        session.getTransaction().commit();

        return allGroups;
    }
    
    public Groups getGroups(int id) {
        session.beginTransaction();
        Groups groups = (Groups) session.createQuery("from Groups where id= " + id).uniqueResult();
        session.close();
        return groups;
    }
    
     public void addGroup (Groups group) {
        session.beginTransaction();
        try {
            session.save(group);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateGroup (Groups group) {
        session.beginTransaction();
        try {
            session.update(group);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteGroup (int id) {
        session.beginTransaction();
        Groups group = new Groups();
        group.setId(id);
        try {
            session.delete(group);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
