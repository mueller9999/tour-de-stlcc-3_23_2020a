/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
import business.Pictures;
import business.DAO;
 
/**
 *
 * @author miken
 */
public class Test
{
     private static DAO picDAO;
 
    
    public static  void runBeforeClass() 
    {
        picDAO = new DAO();
    }
 
    
    public static void runAfterClass() 
    {
        picDAO = null;
    }
 
    /**
     * Test method for {@link com.loiane.dao.BookDAOImpl#saveBook()}.
     */
    
    public void testSaveBook() 
    {
 
        //File file = new File("images\\extjsfirstlook.jpg"); //windows
        File file = new File("pics/2. Museum_Of_Transportation.jpg");
        byte[] bFile = new byte[(int) file.length()];
 
        try 
        {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
 
        Pictures pics = new Pictures();
       // pics.setPictureName("STLCC - Meramec campus");
      //  pics.setStlccmeramecimage1(bFile);
 
        picDAO.savePicture(pics);
 
        
        
        
        
    }
 
    /**
     * Test method for {@link com.loiane.dao.BookDAOImpl#getBook()}.
     */
    
    public void testGetBook()
    {
 
        Pictures pics = picDAO.getBook((Integer) 1);
 
       
 
        try
        {
            //FileOutputStream fos = new FileOutputStream("images\\output.jpg");  //windows
            FileOutputStream fos = new FileOutputStream("pics/pics\\2. Museum_Of_Transportation.jpg");
            //fos.write(pics.getStlccmeramecimage1());
            fos.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}
