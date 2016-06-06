package helper;

import java.util.List;
import model.Choices;
import model.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * ChoicesHelper Class
 */
public class ChoicesHelper {
    
    Session session;

    public ChoicesHelper() {
         this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Choices> getAllChoices () {
        session.beginTransaction();
        List<Choices> allChoices = session.createQuery("from Choices").list();
        session.getTransaction().commit();

        return allChoices;
    }
    
    public Choices getChoices(int id) {
        session.beginTransaction();
        Choices choices = (Choices) session.createQuery("from Choices where id=" + id).uniqueResult();
        session.getTransaction();
        
        return choices;
    }
    
     public void addChoices (Choices choice) {
        session.beginTransaction();
        try {
            session.save(choice);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateChoices (Choices choice) {
        session.beginTransaction();
        try {
            session.update(choice);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteChoices (int id) {
        session.beginTransaction();
        Choices choice = new Choices();
        choice.setId(id);
        try {
            session.delete(choice);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
