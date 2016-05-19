/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Julien
 */
public class UserHelper {

    Session session = (Session) HibernateUtil.getSessionFactory();

    public List<Users> getAllUser() {

        session.beginTransaction();
        List<Users> allUsers = session.createQuery("from Users").list();
        session.getTransaction().commit();

        return allUsers;
    }

    public String getPassword(String login) {
        session.beginTransaction();
        String password = session.createQuery("select password from Users where login like" + login).getQueryString();
        session.getTransaction();
        if (password.isEmpty() )
                password = "erreur";
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

}
