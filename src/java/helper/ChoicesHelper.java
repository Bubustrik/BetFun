/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.Choices;
import model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class ChoicesHelper {
    
    Session session = (Session) HibernateUtil.getSessionFactory();
    
    public List<Choices> getAllChoices () {
        session.beginTransaction();
        List<Choices> allChoices = session.createQuery("from Choices").list();
        session.getTransaction().commit();

        return allChoices;
    }
}
