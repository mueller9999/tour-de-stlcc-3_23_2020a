/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import business.Member;
import business.MemberDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miken
 */
public class CreateAccountServlet extends HttpServlet
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
      
        response.setContentType("text/html;charset=UTF-8");
         String URL = "/CreateHealthAccount.jsp";
        String msg="";
        
        Member m = new Member();
        
        String MemID = request.getParameter("memid");
         int height =0;
         boolean fieldIsBlank = false; 
        
        String LastName = request.getParameter("lastname");
        String firstName = request.getParameter("firstname"); 
        //String middleName = request.getParameter("middlename");
        //String status = request.getParameter("status");
        int age =0; 
        
        boolean command = false;
                
        
        try
        {
            
            command =Boolean.parseBoolean(request.getParameter("command"));
            
            
            
            
            
        }
        catch(Exception y)
        {
            
            msg +="Error with radio buttons: " + y.getMessage();
            fieldIsBlank = true;
            
        }
        
        
     /*   
        
        try
        {
        
            age = Integer.parseInt(request.getParameter("age"));
        }
        catch(Exception d)
        {
            
            msg+= "Error: " + d.getMessage() + " age in years must be a "
                    + "integer number and can not be blank " + "<br>";
            fieldIsBlank = true;
        }
        
        
       */ 
        
        
        
        String weight ="";
        try
        {
        
            weight   = request.getParameter("weight");
        }
        catch(Exception e)
        {
            
            msg+= "ERROR: " + e.getMessage();
           fieldIsBlank=true;
        }
        String memdt  = request.getParameter("memdt");
        String passWord  = (request.getParameter("psswd"));
        
        
       /*
        
        try
        {
            height = Integer.parseInt(request.getParameter("height"));
            
        }
        catch(Exception f)
        {
            
            msg+= "Enter a integer number for height in inches " + " and "
                    + "can not be blank " +
                    f .getMessage() + "<br>" + " ";
            
            fieldIsBlank = true;
        }
        
        */
        
        if(MemID=="")
        {
            fieldIsBlank = true;
            msg += "Member ID can not be blank " + "<br>";
        } 
        
        LocalDate date3  = LocalDate.now();
             
             try
             {
                
               date3 = LocalDate.parse(memdt);
             }
             catch(Exception e)
             {
                 
                // msg+= " " +  e.getMessage();
                 
             }
               java.util.Date date4 = new Date();
              
             try
             {
               date4 = java.sql.Date.valueOf(date3);
             }
             catch(Exception e)
             {
                 msg += " " + e.getMessage();
                 
             }
       
       m.setMemdt(date4);
                
      // Long pswd =(long)0;     
        
         
     
      String passWord1 ="";
      try
      {
      
        passWord1 = passWord;
      }
      catch(Exception e)
      {
         
         msg += "ERROR: " + e.getMessage();
          
          
      }
      if(passWord1=="")
      {
          
          msg+="password can not be blank " + "<br>";
          fieldIsBlank=true;  
      }
      Double weight1 = 0.0;
      try
      {
         weight1= Double.parseDouble(weight);
      }
      catch(Exception e)
      {
          
          msg+="weight must be a number the problem is: " + e.getMessage() + "<br>";
          fieldIsBlank = true;
      }
      
      if(weight1 <=0)
      {
          msg += "Weight must be greater than 0" + "<br>";
          fieldIsBlank = true;
      }
      
    //  msg+="MemID: " + MemID + " date4: " + date4
      //        + " firstName: " + firstName + "weight: " + weight1 +
        //         "pswd: " + passWord1; 
      if(fieldIsBlank==false)
      {
         
          m.setHeight(height);
          m.setAge(age);
          m.setGender(command);
          MemberDB.addNewRecord(MemID,date4,firstName,
                 weight1,height,age,command,passWord1,m);
      } 
        //request.setAttribute("m", m1);
        
       if(fieldIsBlank==false)
       {
        
        URL = "/HealthLogon.jsp";
       }
        request.setAttribute("msg", msg);
        RequestDispatcher disp  = getServletContext().getRequestDispatcher(URL);
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
