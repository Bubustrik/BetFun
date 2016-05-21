package helper;

import java.util.List;
import model.Choices;
import model.HibernateUtil;
import org.hibernate.Session;

/**
 * ChoicesHelper Class
 */
public class ChoicesHelper
{
    Session session = (Session) HibernateUtil.getSessionFactory();
     
    public List<Choices> getAllChoices () {
        session.beginTransaction();
        List<Choices> allChoices = session.createQuery("from Choices").list();
        session.getTransaction().commit();

        return allChoices;
    }
}
