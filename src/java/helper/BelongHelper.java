package helper;

import model.Appartenir;
import model.HibernateUtil;
import org.hibernate.Session;

/**
 * BelongHelper Class
 */
public class BelongHelper
{
    Session session = (Session) HibernateUtil.getSessionFactory();
    
    public Appartenir getAppartenir(int id) {
        session.beginTransaction();
        Appartenir appartenir = (Appartenir) session.createQuery("from Appartenir where id ="+ id);
        session.getTransaction().commit();

        return appartenir;
    }
}
