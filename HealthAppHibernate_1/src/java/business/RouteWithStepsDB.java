/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import antlr.Utils;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import business.Member;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author miken
 */
public class RouteWithStepsDB
{
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session1 = null;
        
        
        Date createDate = null;
        
//         //int eid = emp1.getEmployeeID();
//       
//      
       
                 
       
    public static void setLocationValueToTrue(boolean setToTrue,int locationID,RouteWithSteps r)
    {
      SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session1 = null;
        
        
        Date createDate = null;
        
//         //int eid = emp1.getEmployeeID();
//       
//      
       
                 
       
          
     
       try
        {
            //can attatch queries to the object
             session1 = sessionFactory.openSession();
     
             
            
             
             // Query sqlQuery = session1.createSQLQuery("UPDATE tblmembers SET Password =:password WHERE MemID =:memid");
//           
               Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();

//String hqlUpdate = "update Member c set c.password = :newName where c.memid = :oldName";
// or String hqlUpdate = "update Customer set  = :newName where name = :oldName";
int updatedEntities;
            updatedEntities = session.createQuery( "update RouteWithSteps c set c.unlockedLocation = :settotrue where c.locationID = :locid" )
                    .setBoolean("settotrue", setToTrue )
                    .setInteger("locid",locationID)
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
}    
        }
        
      public static void setLocationValueToFalse(String setToFalse,int locationID,RouteWithSteps r)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
  
         //int eid = emp1.getEmployeeID();
       //int noingroup = Integer.parseInt(NoInGroup);
         
         Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session3 = factory.openSession();	    
             
            
              try
        {
     
            

             Query q = session3.createQuery("UPDATE RouteWithSteps SET unlockedLocation =:setToFalse WHERE locationID =:locationID");
             
             
             session3.getTransaction().begin();
             q.setString("setToFalse", setToFalse);
             q.setInteger("locationID", locationID);
             (q).executeUpdate();
            session3.getTransaction().commit();
            
         
            
           
            session3.close();
            factory.close();
            
          
        }
        catch (HibernateException erro) 
        {
            session3.getTransaction().rollback();
            session3.close();
        } 
             
             
        }
      
               
     
    
    
    
    public static String getDestination(RouteWithSteps R,int loc)
{ 
     
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = null;
        String location ="";
        
        //RouteWithSteps R=new RouteWithSteps();
        String memid="";
        Date createDate = null;
        //memid = UserID;
        
       
        
        try
        {
            //can attatch queries to the object
             session = sessionFactory.openSession();
             
       
             Transaction tx = session.beginTransaction();
             Query query = session.createQuery("SELECT c.location FROM RouteWithSteps c WHERE c.locationID =:locID");
             query.setInteger("locID", loc);
           //  query.executeUpdate();
           
             location = query.uniqueResult().toString();
          
        }
        catch(Exception E)
        {
           
            R=null;
           
        }
        finally
        {
           
            session.close();
        }
        
        
        
        return location;
    }
    
}
