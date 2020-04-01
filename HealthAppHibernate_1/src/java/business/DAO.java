/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
 

import business.HibernateUtil2;

import business.Pictures;

/**
 *
 * @author Michael Mueller
 */
public class DAO
{
    
     public Pictures savePicture(Pictures pic)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(pic);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return pic;
    }
    
     
      public Pictures getBook(Integer imageId)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Pictures pic1 = (Pictures) session.get(Pictures.class,imageId );
            return pic1;
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
     
     
}
