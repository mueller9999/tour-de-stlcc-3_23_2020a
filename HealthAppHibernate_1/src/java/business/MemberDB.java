/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import org.hibernate.HibernateException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Michael Mueller
 */
public class MemberDB
{
    
    public static Member getMemberByID(String UserID)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = null;
        
        Member m=new Member();
        String memid="";
        Date createDate = null;
        memid = UserID;
        
       
        
        try
        {
            //can attatch queries to the object
             session = sessionFactory.openSession();
            
       
             Transaction tx = session.beginTransaction();
             Query query = session.createQuery("from Member where MemID =:memid");
             query.setString("memid", memid);
           //  query.executeUpdate();
             
             m = (Member)query.uniqueResult();
          
        }
        catch(Exception E)
        {
            m= null;
            
           
        }
        finally
        {
           
            session.close();
        }
        return m;
    }
    
        
        
        
        
    
    
    
     
     public static void  addNewRecord(String MemID,Date date4,
            String firstName,double weight1,int height,int age,boolean command,String passWord1,Member m)
    {
        
      
        
        //SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yyyy");
        
       // Date date2 =  formatter.format(date1);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
       
       // LocalDate date = LocalDate.parse(date1);
      
        //java.util.Date date3 = java.sql.Date.valueOf(date);
      //Member mem = new Member();
        try
        {
        
            
            
        session.beginTransaction();
            
        m.setMemid(MemID); 
        
        
        //m.setLastnm(LastName);
        m.setFirstnm(firstName);
        m.setWeight(weight1);
       // m.setMiddlenm(middleName);
        m.setHeight(height);
        m.setAge(age);
        m.setGender(command);
// m.setStatus(status);
        m.setMemdt(date4);
        
        m.setPassword(passWord1);
          
        //Long passWord = Long.parseLong(pswd);
    
        session.save(m);
        session.getTransaction().commit();
        session.close();
        
        
        //Session session1 = null;
        
       
        }
       catch (HibernateException erro) 
        {
            session.getTransaction().rollback();
            session.close();
        } 
        
       
        }
    public static void updateMember(Member m)
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
     
                
               Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();


int updatedEntities;
            updatedEntities = session.createQuery( "update Member c set c.Gender = :newName where c.memid = :oldName" )
                    .setBoolean("newName", m.isGender() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
}           

       
 try
        {
            //can attatch queries to the object
             session1 = sessionFactory.openSession();
     
                
               Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();


int updatedEntities;
            updatedEntities = session.createQuery( "update Member c set c.tourfinished = :newName where c.memid = :oldName" )
                    .setString("newName", m.getTourfinished().trim() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
}                  
       
       
try
        {
            //can attatch queries to the object
             session1 = sessionFactory.openSession();
     
                
               Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();


int updatedEntities;
            updatedEntities = session.createQuery( "update Member c set c.age = :newName where c.memid = :oldName" )
                    .setInteger("newName", m.getAge() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
}                  
          
     
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
            updatedEntities = session.createQuery( "update Member c set c.firstnm = :newName where c.memid = :oldName" )
                    .setString("newName", m.getFirstnm() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
}   
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
            updatedEntities = session.createQuery( "update Member c set c.weight = :newName where c.memid = :oldName" )
                    .setDouble("newName", m.getWeight() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
} 
  
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
            updatedEntities = session.createQuery( "update Member c set c.height = :newName where c.memid = :oldName" )
                    .setInteger("newName",m .getHeight())
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
} 
         
         
  /*       try
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
            updatedEntities = session.createQuery( "update Member c set c.middlenm = :newName where c.memid = :oldName" )
                    .setString("newName", m.getMiddlenm() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
} 
*/
  /*
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
            updatedEntities = session.createQuery( "update Member c set c.status = :newName where c.memid = :oldName" )
                    .setString("newName", m.getStatus() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
} 
         */
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
            updatedEntities = session.createQuery( "update Member c set c.memdt = :newName where c.memid = :oldName" )
                    .setDate("newName", m.getMemdt() )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session.close();
        }
catch (HibernateException erro)
{
    session1.getTransaction().rollback();
    session1.close();
} 

                        
       try
        {
            //can attatch queries to the object
             session1 = sessionFactory.openSession();
     
                
               Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();


int updatedEntities;
            updatedEntities = session.createQuery( "update Member c set c.password = :newName where c.memid = :oldName" )
                    .setString("newName", m.getPassword() )
                    .setString( "oldName", m.getMemid() )
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

public static void setTotalSteps(int steps,Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.steps = :newName where c.memid = :oldName" )
                    .setInteger("newName", steps )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}





public static void setCaloriesForDay(double calories,Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.caloriesBurned = :newName where c.memid = :oldName" )
                    .setDouble("newName", calories )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}


public static void settotalCalories(double calories,Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.totalcaloriesburned = :newName where c.memid = :oldName" )
                    .setDouble("newName", calories )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}

public static void finishedTour(Member m,boolean  isTrue)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean finished = true;
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.tourcomplete = :newName where c.memid = :oldName" )
                    .setBoolean("newName", isTrue )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}



public static double getCurrentTotalCalories(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        double calories=0.0; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT totalcaloriesburned FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           calories = Double.parseDouble(q.uniqueResult().toString());
                            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return calories;
}


public static double getCaloriesForTheDay(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        double calories=0.0; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT caloriesBurned FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           calories = Double.parseDouble(q.uniqueResult().toString());
                            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return calories;
}



public static int getCurrentSteps(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        int steps=0; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT steps FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           steps = Integer.parseInt(q.uniqueResult().toString());
                            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return steps;
}
//get location torf2


public static boolean getFinihsedTourStatus(Member m)
{
    
    
    
 
    
    
    
  
    
   
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean valtoret=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT tourcomplete FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m.getMemid() );
                            //q.setString("torf", m.getLoctorf2());
                            
           valtoret = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    

    return valtoret;
}

public static boolean getTORFValueForLocation(String m,int locid)
{
    
    boolean valToRet=false;
    
 
    
    
    
  
    
    if(locid ==1)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue1=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf1 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue1 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue1;
}
    
    
    if(locid ==2)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue2=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf2 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue2 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue2;
}
    
    
    
    
    else  if(locid ==3)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue3=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf3 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue3 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue3;
}
    
    
  else  if(locid ==4)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue4=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf4 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue4 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue4;
}   
    
    
 else  if(locid ==5)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue5=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf5 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue5 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue5;
}      
    
 else  if(locid ==6)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue6=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf6 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue6 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue6;
}    
    
    
else  if(locid ==7)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue7=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf7 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue7 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue7;
}    
        
    
else  if(locid ==8)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue8=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf8 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue8 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue8;
}    
 
    
else  if(locid ==9)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue9=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf9 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue9 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue9;
}    
    
    
 else  if(locid ==10)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue10=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf10 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue10 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue10;
}
    
    
else  if(locid ==11)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue11=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf11 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue11 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue11;
}
        
    
else  if(locid ==12)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue12=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf12 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue12 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue12;
}
            
else  if(locid ==13)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue13=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf13 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue13 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue13;
}    
 
else  if(locid ==13)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue13=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf13 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue13 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue13;
}    


else  if(locid ==14)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue14=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf14 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue14 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue14;
}    
 
    
else  if(locid ==15)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue15=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf15 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue15 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue15;
}    


else  if(locid ==16)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue16=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf16 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue16 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue16;
}    

else  if(locid ==17)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue17=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf17 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue17 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue17;
}    
 
else  if(locid ==18)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue18=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf18 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue18 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue18;
}    
    
else  if(locid ==19)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue19=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf19 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue19 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue19;
}    
        

else  if(locid ==20)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue20=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf20 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue20 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue20;
}    
        

    
else  if(locid ==21)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue21=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf21 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue21 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue21;
}    
           
else  if(locid ==22)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue22=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf22 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue22 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue22;
}    
    
else  if(locid ==23)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue23=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf23 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue23 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue23;
}    
        
    
    else  if(locid ==24)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue24=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf24 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue24 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue24;
}    
        
    else  if(locid ==25)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue25=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf25 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue25 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue25;
}    
        
    
    
    else  if(locid ==26)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue26=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf26 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue26 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue26;
}    
        
    else  if(locid ==27)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue27=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf27 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue27 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue27;
}    
   else  if(locid ==28)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue28=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf28 FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue28 = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue28;
}    
             
    
    return valToRet;
}




public static boolean getTORFValueForLocationa(String m,int locid)
{
    
    boolean valToRet  =false;
    
      if(locid ==1)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue1a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf1a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue1a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue1a;
}
    
   
    
    if(locid ==2)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue2a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf2a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue2a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    valToRet = torfvalue2a;
}
    
    
    
    
    else  if(locid ==3)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue3a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf3a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue3a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue3a;
}

 else  if(locid ==4)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue4a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf4a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue4a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue4a;
}    
    

else  if(locid ==5)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue5a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf5a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue5a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue5a;
}    
   
else  if(locid ==6)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue6a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf6a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue6a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue6a;
}    
   
else  if(locid ==7)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue7a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf7a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue7a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue7a;
}    
       

else  if(locid ==8)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue8a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf8a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue8a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue8a;
}    

else  if(locid ==9)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue9a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf9a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue9a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue9a;
}    

else  if(locid ==10)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue10a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf10a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue10a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue10a;
}    


else  if(locid ==11)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue11a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf11a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue11a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue11a;
}
 
else  if(locid ==12)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue12a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf12a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue12a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue12a;
}    
    

else  if(locid ==13)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue13a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf13a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue13a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue13a;
}    
    
else  if(locid ==14)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue14a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf14a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue14a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue14a;
}        
 
    
else  if(locid ==15)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue15a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf15a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue15a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue15a;
}    

    
else  if(locid ==16)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue16a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf16a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue16a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue16a;
}    
    
    
else  if(locid ==17)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue17a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf17a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue17a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue17a;
}        
    
    
else  if(locid ==18)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue18a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf18a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue18a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue18a;
}        
        
    
else  if(locid ==19)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue19a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf19a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue19a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue19a;
}        

    
else  if(locid ==20)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue20a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf20a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue20a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue20a;
}    

else  if(locid ==21)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue21a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf21a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue21a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
     
     
    valToRet = torfvalue21a;
}


else  if(locid ==22)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue22a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf22a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue22a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
 valToRet = torfvalue22a;
}
 
else  if(locid ==23)
    {
    
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        boolean torfvalue23a=false; 
      //  Session session3 = null;
      // Member m3 = null;
       
       //m3 = m;
       Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
             
Transaction tx = session2.beginTransaction();

            

           Query q  = session2.createQuery("SELECT loctorf23a FROM Member c WHERE c.memid =:memid");
                            q.setString("memid", m );
                            //q.setString("torf", m.getLoctorf2());
                            
           torfvalue23a = (boolean)q.uniqueResult();
            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
     
 valToRet = torfvalue23a;
}    
    
    
    
    
    return valToRet;
}



public static int getCurrentCounter(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        int counter=0; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT counter FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           counter = Integer.parseInt(q.uniqueResult().toString());
                            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return counter;
}


public static int getCurrentCounter2(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        int counter2=0; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT counter2 FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           counter2 = Integer.parseInt(q.uniqueResult().toString());
                            
               
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return counter2;
}



public static void setTotalCounter(int counter,Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.counter = :newName where c.memid = :oldName" )
                    .setInteger("newName", counter )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}

public static void setTotalCounter2(int counter2,Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session2 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.counter2 = :newName where c.memid = :oldName" )
                    .setInteger("newName", counter2 )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}

public static void setTimeStamp(Member m)
{
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     String date =  (new java.util.Date()).toLocaleString();
         
      


    // Date date =   new java.util.Date();
        Session session2 = sessionFactory.openSession();
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();


int updatedEntities;
            updatedEntities = session2.createQuery( "update Member c set c.startdate = :newName where c.memid = :oldName" )
                    .setString("newName",date )
                    .setString( "oldName", m.getMemid() )
                    .executeUpdate();
tx.commit();
session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    
}

 public static String getTheDateStamp(Member m)
    {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        String date2=""; 
        Session session2 = null;
       Member m3 = null;
     try
        {
            
//can attatch queries to the object
            
     
                
                session2 = sessionFactory.openSession();
Transaction tx = session2.beginTransaction();



           Query q  = session2.createQuery( "SELECT startdate FROM Member c WHERE c.memid =:oldName" );
                            q.setString("oldName", m.getMemid() );
                           
                            
           date2 = (q.uniqueResult().toString());
                            
               
           session2.close();
        }
catch (HibernateException erro)
{
    session2.getTransaction().rollback();
    session2.close();
}
    return date2;
    
    }
    public static String DestinationUnlocked(int steps,Member m)
    {
        String messageToReturn ="";
        if(steps>=5590&& steps < 7525)
        {
               messageToReturn= "AWESOME!" + " You unlocked " + "Museum of Transportation"; 
               
        
        }
        else if(steps < 5590 )
        {
               messageToReturn = "Greate Job! " + "Only " + (5590-steps) + "to go"
               + "until the NEXT LOCATION!";
        
        }
        
        if(steps > 5590 && steps <= 7525)
        {
               messageToReturn= "AWESOME!" + " You unlocked " + "Eckert's St Louis Seasonal Market"; 
        
        
        } 
        
       
       
        
        
        return "";
    }

    
     public static void setLocationValueForMemberToTrue(boolean setToTrue,String memID,int locationID,RouteWithSteps r)
    {
/*
        if(locationID==2)
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
            updatedEntities = session.createQuery( "update Member c set c.loctorf2 = :settotrue where c.memid = :memid" )
                    .setString("settotrue", setToTrue )
                    .setString("memid",memID)
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
       */ 
        if(locationID==1)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf1 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
        
        
         if(locationID==2)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf2 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==3)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf3 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    if(locationID==4)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf4 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
     if(locationID==5)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf5 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==6)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf6 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==7)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf7 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==8)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf8 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==9)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf9 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    if(locationID==10)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf10 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    
     if(locationID==11)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf11 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
     if(locationID==12)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf12 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
     if(locationID==13)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf13 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    if(locationID==14)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf14 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
     if(locationID==15)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf15 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
      if(locationID==16)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf16 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
      if(locationID==17)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf17 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    if(locationID==18)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf18 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
    if(locationID==19)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf19 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
    if(locationID==20)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf20 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    if(locationID==21)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf21 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==22)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf22 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
    if(locationID==23)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf23 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
    if(locationID==24)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf24 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==25)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf25 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
     if(locationID==26)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf26 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     if(locationID==27)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf27 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==28)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf28 =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    
}

     
 
     
     
 public static void setLocationValueForMemberToTrueVar2(boolean setToTrue,String memID,int locationID)
    {
         
        if(locationID==1)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf1a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
        
        
         if(locationID==2)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf2a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==3)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf3a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
      if(locationID==4)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf4a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
        
        
         if(locationID==5)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf5a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     if(locationID==6)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf6a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
     
     if(locationID==7)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf7a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
    if(locationID==8)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf8a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
   
    if(locationID==9)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf9a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
     if(locationID==10)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf10a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
     if(locationID==11)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf11a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    
      if(locationID==12)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf12a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==13)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf13a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
      
    
    if(locationID==14)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf14a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
     
    
     if(locationID==15)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf15a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
    if(locationID==16)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf16a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
      if(locationID==17)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf17a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
     if(locationID==18)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf18a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     if(locationID==19)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf19a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
     
      if(locationID==20)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf20a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
      
    if(locationID==21)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf21a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
      if(locationID==22)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf22a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
    
    
     if(locationID==23)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf23a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToTrue);
             q.setString("memid",memID);
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
      
    
      
}     
     
 
 
 public static void setLocationValueForMemberToFalseVar2(boolean setToFalse,String memID,int locationID)
    {
         
        if(locationID==1)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf1a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
        
        
         if(locationID==2)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf2a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
     if(locationID==3)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf3a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
     if(locationID==4)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf4a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
      if(locationID==5)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf5a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
     if(locationID==6)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf6a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
      
    
     if(locationID==7)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf7a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
      
      if(locationID==8)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf8a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    if(locationID==9)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf9a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
     if(locationID==10)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf10a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
     if(locationID==11)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf11a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
     
    if(locationID==12)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf12a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    
     if(locationID==13)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf13a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
    
     if(locationID==14)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf14a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
     
     if(locationID==15)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf15a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
     
     if(locationID==16)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf16a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    
     if(locationID==17)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf17a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
      
     if(locationID==18)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf18a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    
     if(locationID==19)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf19a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    
      if(locationID==20)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf20a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
    
      if(locationID==21)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf21a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
      
    
     if(locationID==22)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf22a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
   
     
     if(locationID==23)
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
     
            

             Query q = session3.createQuery("UPDATE Member c SET c.loctorf23a =:settotrue WHERE c.memid =:memid");
             
             
             session3.getTransaction().begin();
             q.setBoolean("settotrue", setToFalse);
             q.setString("memid",memID);
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
     
    
}
 
     
     
     
}
