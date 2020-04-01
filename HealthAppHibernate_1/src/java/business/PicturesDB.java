/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.awt.print.Book;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Date;
import static javax.swing.text.StyleConstants.ModelAttribute;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author Michael Mueller
 */
public class PicturesDB
{
        
    
    public static Pictures getLocByID(Integer locID)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = null;
        
        Pictures p=new Pictures();
        Integer locid=0;
        Date createDate = null;
        locid = locID;
        
       
        
        try
        {
            //can attatch queries to the object
             session = sessionFactory.openSession();
            
       
             Transaction tx = session.beginTransaction();
             Query query = session.createQuery("from Pictures where imageid =:locid");
             query.setInteger("locid", locid);
           //  query.executeUpdate();
             
                
           
           
             p = (Pictures)query.uniqueResult();
          
        }
        catch(Exception E)
        {
            p= null;
            
           
        }
        finally
        {
           
            session.close();
        }
        return p;
    }
    
    
    
    
    
   
        public static byte[] toByteArray(Blob fromImageBlob) 
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try 
            {
                return toByteArrayImpl(fromImageBlob, baos);
             }
            catch (Exception e) 
            {
            
            
            }
            return null;
        }



public static byte[] toByteArrayImpl(Blob fromImageBlob, 
      ByteArrayOutputStream baos) throws SQLException, IOException {
    byte buf[] = new byte[400000000];
    int dataSize;
    InputStream is = fromImageBlob.getBinaryStream(); 

    try {
      while((dataSize = is.read(buf)) != -1) {
        baos.write(buf, 0, dataSize);
      }    
    } finally {
      if(is != null) {
        is.close();
      }
    }
    return baos.toByteArray();
  }
    
 
      
    



}