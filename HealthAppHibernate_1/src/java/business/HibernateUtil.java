/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 *
 * @author Michael Mueller
 */
public class HibernateUtil
{
    
    private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory()
    {
        if(sessionFactory==null)
        {
            
            Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build();
       
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
    
}
