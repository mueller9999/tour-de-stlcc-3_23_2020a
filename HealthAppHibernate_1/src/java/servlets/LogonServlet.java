/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import business.Member;
import business.MemberDB;
import business.RouteWithSteps;
import business.RouteWithStepsDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;

/**
 *
 * @author miken
 */
public class LogonServlet extends HttpServlet
{


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
       
       HttpSession session = request.getSession(true);
       //session.invalidate();
        
        
        response.setContentType("text/html;charset=UTF-8");
        String msg = "", userid = "";
        String URL = "/HealthLogon.jsp";
        String passatt = "";
        Member m;
        
       String userID ="";
       String passWord ="";
       
               
      userID= request.getParameter("userid");
      passWord = request.getParameter("password");
      
      int locID = 0;
      
      
      String setToFalse = "false";
      
      RouteWithSteps r = new RouteWithSteps();
      
      for(int i=0;i<6;i++ )
      {
          locID= i;
          
          RouteWithStepsDB.setLocationValueToFalse(setToFalse, locID,r);
      }
      
      
      if(userID=="")
      {
           msg = "The Logon User ID and Password can not be blank " + "<br>"
                  +"to create a new account click the New Member button " +"<br>";
          
      }
      
      passWord = request.getParameter("password");
      if(passWord=="")
      {
          msg = "The Logon User ID and Password can not be blank " +"<br>"
                  +"to create a new account click the New Member button " +"<br>";
          
      }
      
      
        //try 
        //{
            userid = request.getParameter("userid").trim();
            m = MemberDB.getMemberByID(userid);
            if (m == null)
            {
                  msg = "The Logon User ID and Password can not be blank " + "<br>"
                  +"to create a new account click the New Member button " +"<br>";
            } else
            {
                msg = "Welcome Member "+ m.getFirstnm();
               
                
                try
                {
                
                    passatt = request.getParameter("password").trim();
               
                }
                catch(Exception e)
                {
                   
                      //  msg=" ERROR: invalid password attempt "+ e.getMessage();
                       msg = "The Logon User ID and Password can not be blank " +"<br>"
                  +"to create a new account click the New Member button " +"<br>";
                }
                    
                    
                
                
                
                m.setPassAttempt(passatt);
                if (!m.isAuthenticated())
                {
                     msg = "The Logon User ID and Password can not be blank " + "<br>"
                  +"to create a new account click the New Member button " +"<br>";
                } else
                {
                    
                    
                    URL = "/ExistingMember.jsp";
                    request.getSession().setAttribute("m", m);
                    session.setAttribute("member", m);
                
                }
            }
       // } //catch (Exception e)
        //{
         //   msg = "Exception: " + e.getMessage();
        //}
        request.setAttribute("msg", msg);
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
