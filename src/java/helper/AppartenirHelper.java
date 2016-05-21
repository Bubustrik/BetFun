/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import model.Appartenir;
import model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class AppartenirHelper {
    
    Session session = (Session) HibernateUtil.getSessionFactory();
    
    public Appartenir getAppartenir(int id) {
        session.beginTransaction();
        Appartenir appartenir = (Appartenir) session.createQuery("from Appartenir where id ="+ id);
        session.getTransaction().commit();

        return appartenir;
    }
}
