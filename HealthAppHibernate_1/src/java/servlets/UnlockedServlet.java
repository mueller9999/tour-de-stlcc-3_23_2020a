/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import business.Member;
import business.Pictures;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import business.Pictures;
import business.PicturesDB;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Base64;
import javax.imageio.ImageIO;

import java.lang.Object.*;
//import javax.xml.bind.DatatypeConverter;




/**
 *
 * @author miken
 */
public class UnlockedServlet extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
       
        
        
         // response.setContentType("text/html;charset=UTF-8");
       String msg  = "";
        HttpSession session = request.getSession();
        
        // Pictures pictures = new Pictures();
        
        String URL  = "/LocationsUnlocked.jsp";
     /*
        String dbURL = "jdbc:mysql://localhost:3306/Health78";
       String dbUser = "root";
       String dbPwd = "sesame";
       
       try
       {  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
           // Connection con=DriverManager.getConnection(  
           // "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
            
             Connection conn = 
                   DriverManager.getConnection(dbURL, dbUser, dbPwd);
            
            PreparedStatement ps=conn.prepareStatement("select images * from pictures");  
            ResultSet rs=ps.executeQuery();  
        if(rs.next())
        {//now on 1st row  
        
            
            
        Blob b=rs.getBlob(3);//2 means 2nd column data  
        byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
              
        FileOutputStream fout=new FileOutputStream("c:/pics3/Meramec.jpg");  
        fout.write(barr);  
        request.setAttribute("msg", msg);
        request.setAttribute("barr", barr);
        fout.close();  
}//end of if  
System.out.println("ok");  
msg = "image outputed";              
conn.close();  
}
       catch (Exception e) 
{
    e.printStackTrace(); 



}  
 
       */
        
     
     /*
        Pictures p;
        p = PicturesDB.getLocByID(1);
        byte[] byteString=   PicturesDB.toByteArray(p.getImages());   
     
    
     
        p.setImageAsBytes(byteString);
       */ 
//        
      //       byte[] encodeBase64 = Base64.getDecoder().decode(byteString);
//            String base64Encoded = new String(encodeBase64, "UTF-8");
//            user.setBase64image(base64encoded);
        
       //session.setAttribute("byteString", byteString);
      //   response.setContentType("image/jpg");
  //       response.setContentLength(byteString.length);
        
  /*
         OutputStream out = response.getOutputStream();
         out.write(byteString);
    */    
//        byte encodeBase64= Base64.encodeBase64(byteString);       
//          byte[] encodeBase64 = Base64.encodeBase64(b);
//String base64DataString = new String(encodeBase64 , "UTF-8");
//and than just
//
//src="data:image/jpeg;base64,[the value of your base64DataString]"     
//       // session.setAttribute("printThis", out);


      
    //   String base64a = Base64.getEncoder().encodeToString(byteString);
       
       
      // p.setBase64Image(base64a);
       
      
     
     
      //  byte[] imageBytes = getImageAsBytes();
     
      
      // String getByteArrString = p .getByteArrayString1();
      
       ////////////////////////////////////////////////
//        byte[] message = (byteString+"").getBytes("UTF-8");
//        String encoded = DatatypeConverter.printBase64Binary(message);
//        byte[] decoded = DatatypeConverter.parseBase64Binary(encoded);

       // System.out.println(encoded);
       // System.out.println(new String(decoded, "UTF-8"));
       
       
       
      
      
       URL = "/LocationsUnlocked.jsp";
        request.setAttribute("msg",msg);
     
       // request.setAttribute("decoded", decoded);
      //  request.setAttribute("encoded", encoded);
        
      
      
        
        request.setAttribute("msg", msg);
        //request.setAttribute("base64a",base64a );
        RequestDispatcher disp = getServletContext().getRequestDispatcher(URL);
        disp.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
