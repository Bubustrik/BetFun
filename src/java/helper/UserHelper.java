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

    Session session = null;

    public UserHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Users> getAllUser() {
        List<Users> allUsers;

        session.beginTransaction();
        allUsers = session.createQuery("from Users").list();
        session.close();
        return allUsers;
    }
    
     public List<Users> getUserByClassements() {
        List<Users> allUsers;
        session.beginTransaction();
        allUsers = session.createQuery("from Users order by scores desc").list();
        session.close();
        return allUsers;
    }
    
    public Users getUser(String email) {
        Users user = null;
        try {
        session.beginTransaction();
        user = (Users) session.createQuery("from Users where email like '" + email + "'").uniqueResult();
        } catch (Exception e) {
            
        } finally {
        session.close();
        }
        return user;
    }
   
    public String getPassword(String email) {
        String password;
        try {
            session.beginTransaction();
            password = (String) session.createQuery("select password from Users where email like '" + email + "'").uniqueResult();
        } catch (Exception e) {
            password = "error";
        } finally {
            session.close();
        }
        return password;
    }

    //Return if the user is a moderator or not
    public String isModerator(int id) {
        session.beginTransaction();
        String bModerator = session.createQuery("select isMod from Users where id =" + id).getQueryString();
        session.close();
        if (bModerator.isEmpty()) {
            bModerator = "Unknow ID";
        }
        if (bModerator == "0") {
            bModerator = "Not a Moderator";
        }
        return bModerator;
    }

    //Return if the user is a administrator or not
    public String isAdmin(int id) {
        session.beginTransaction();
        String bAdministrator = session.createQuery("select isAdmin from Users where id =" + id).getQueryString();
        session.getTransaction();
        if (bAdministrator.isEmpty()) {
            bAdministrator = "Unknow ID";
        }
        if (bAdministrator == "0") {
            bAdministrator = "Not a Administrator";
        }
        return bAdministrator;
    }

    //Return if the user is blocked or not
    public String isBlocked(int id) {
        session.beginTransaction();
        String bIsBlocked = session.createQuery("select isBlocked from Users where id =" + id).getQueryString();
        session.getTransaction();
        if (bIsBlocked.isEmpty()) {
            bIsBlocked = "Unknow ID";
        }
        return bIsBlocked;
    }

    public void addUsers(Users user) {
        session.beginTransaction();
        try {
            session.save(user);
            session.getTransaction().commit();
        } catch(Exception ex) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateUsers(Users users) {
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
    
    public String BlockUsers(int id){
        session.beginTransaction();
        String bIsBlocked = session.createQuery("update Users SET isBlocked = 1 where id =" + id).getQueryString();
        session.getTransaction();
        if (bIsBlocked.isEmpty()) {
            bIsBlocked = "Unknown ID";
        }
        if (bIsBlocked == "1") {
            bIsBlocked = "User already blocked";
        }
        return bIsBlocked;
    }
    
    public String UnBlockUsers(int id){
        session.beginTransaction();
        String bIsBlocked = session.createQuery("update Users SET isBlocked = 0 where id =" + id).getQueryString();
        session.getTransaction();
        if (bIsBlocked.isEmpty()) {
            bIsBlocked = "Unknown ID";
        }
        if (bIsBlocked == "0") {
            bIsBlocked = "User already unblocked";
        }
        return bIsBlocked;
    }
}
