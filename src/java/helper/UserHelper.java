package helper;

import java.util.List;
import model.HibernateUtil;
import model.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * UserHelper Class
 */
public class UserHelper {

    Session session;
    
    public UserHelper () {
     this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Users> getAllUser() {

        session.beginTransaction();
        List<Users> allUsers = session.createQuery("from Users").list();
        session.getTransaction().commit();

        return allUsers;
    }

    public Users getUser(String email) {
        session.beginTransaction();
        Users user = (Users) session.createQuery("select password from Users where email like" + email);
        return user;
    }

    public Users getUser(int id) {
        session.beginTransaction();
        Users user = (Users) session.createQuery("select password from Users where id =" + id);
        return user;
    }

    public String getPassword(String email) {
        session.beginTransaction();
        String password = session.createQuery("select password from Users where email like" + email).getQueryString();
        session.getTransaction();
        if (password.isEmpty()) {
            password = "erreur";
        }
        return password;
    }

    public void saveOrUpdateUsers(Users users) {

        session.beginTransaction();
        try {
            session.saveOrUpdate(users);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }

    public void DeleteUsers(int id) {
        session.beginTransaction();
        try {
            session.delete(id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
