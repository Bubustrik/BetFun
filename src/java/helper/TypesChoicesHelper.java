/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import model.HibernateUtil;
import model.TypesChoices;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Julien
 */
public class TypesChoicesHelper {
    
    Session session;

    public TypesChoicesHelper() {
         this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<TypesChoices> getAllTypesChoices () {
        session.beginTransaction();
        List<TypesChoices> allTypesChoices = session.createQuery("from TypesChoices").list();
        session.getTransaction().commit();

        return allTypesChoices;
    }
    
    public TypesChoices getTypesChoices(int id) {
        session.beginTransaction();
        TypesChoices typeChoices = (TypesChoices) session.createQuery("from TypesChoices where id=" + id).uniqueResult();
        session.getTransaction();
        return typeChoices;
    }
    
     public void addTypesChoices(TypesChoices typeChoices) {
        session.beginTransaction();
        try {
            session.save(typeChoices);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void updateTypesChoices (TypesChoices typesChoices) {
        session.beginTransaction();
        try {
            session.update(typesChoices);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
    
    public void deleteTypesChoices (int id) {
        session.beginTransaction();
        TypesChoices typesChoices = new TypesChoices();
        typesChoices.setId(id);
        try {
            session.delete(typesChoices);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }
    }
}
