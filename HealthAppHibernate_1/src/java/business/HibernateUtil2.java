/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
import business.Pictures;

/**
 *
 * @author Michael Mueller
 */
public class HibernateUtil2
{
     private static final SessionFactory sessionFactory;
 
    static
    {
        try 
        {
            sessionFactory = new AnnotationConfiguration()
                                .configure()
                                .addPackage("business") //the fully qualified package name
                                .addAnnotatedClass(Pictures.class)
                                .buildSessionFactory();
 
        } catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
}
    

