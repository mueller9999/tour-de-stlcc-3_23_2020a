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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author miken
 */
public class SetLocValsToFalseServlet extends HttpServlet
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
        
        
         String URL = "/SplashScreen.jsp";
        String msg ="";
        
         HttpSession session = request.getSession();
        
         String date ="";
         date =  (new java.util.Date()).toLocaleString();
         
         
         Member  m1=  (Member)session.getAttribute("member");
         
        
         
         boolean locVal2 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 2);
         boolean locVal2a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 2);
         
         boolean locVal3 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 3);
         boolean locVal3a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 3);
         
         
         if(locVal3==true&& locVal3a==true)
         {
             
             locVal3a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 3);               
             m1.setLoctorf3a(false);
                            
         }
         
         
         if(locVal2==true&& locVal2a==true)
         {
             
             locVal3a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 2);               
             m1.setLoctorf2a(false);
                            
         }
         
         boolean locVal4 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 4);
         boolean locVal4a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 4);        
         
          if(locVal4==true&& locVal4a==true)
         {
             
             locVal4a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 4);               
             m1.setLoctorf4a(false);
                            
         }
          
          
          boolean locVal5 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 5);
         boolean locVal5a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 5);        
         
          if(locVal5==true&& locVal5a==true)
         {
             
             locVal5a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 5);               
             m1.setLoctorf5a(false);
                            
         }
          
                 
          boolean locVal6 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 6);
         boolean locVal6a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 6);        
         
          if(locVal6==true&& locVal6a==true)
         {
             
             locVal6a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 6);               
             m1.setLoctorf6a(false);
                            
         }
          
           boolean locVal7 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 7);
         boolean locVal7a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 7);        
         
          if(locVal7==true&& locVal7a==true)
         {
             
             locVal7a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 7);               
             m1.setLoctorf7a(false);
                            
         }
          
         boolean locVal8 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 8);
         boolean locVal8a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 8);        
         
          if(locVal8==true&& locVal8a==true)
         {
             
             locVal8a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 8);               
             m1.setLoctorf8a(false);
                            
         }
          
          
         boolean locVal9 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 9);
         boolean locVal9a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 9);        
         
          if(locVal9==true&& locVal9a==true)
         {
             
             locVal9a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 9);               
             m1.setLoctorf9a(false);
                            
         }
          
           boolean locVal10 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 10);
         boolean locVal10a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 10);        
         
          if(locVal10==true&& locVal10a==true)
         {
             
             locVal10a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 10);               
             m1.setLoctorf10a(false);
                            
         }
          
         boolean locVal11 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 11);
         boolean locVal11a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 11);        
         
          if(locVal11==true&& locVal11a==true)
         {
             
             locVal11a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 11);               
             m1.setLoctorf11a(false);
                            
         }
          
           boolean locVal12 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 12);
         boolean locVal12a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 12);        
         
          if(locVal12==true&& locVal12a==true)
         {
             
             locVal12a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 12);               
             m1.setLoctorf12a(false);
                            
         }
          
            boolean locVal13 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 13);
         boolean locVal13a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 13);        
         
          if(locVal13==true&& locVal13a==true)
         {
             
             locVal13a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 13);               
             m1.setLoctorf13a(false);
                            
         }
          
            boolean locVal14 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 14);
         boolean locVal14a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 14);        
         
          if(locVal14==true&& locVal14a==true)
         {
             
             locVal14a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 14);               
             m1.setLoctorf14a(false);
                            
         }
          
            boolean locVal15 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 15);
         boolean locVal15a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 15);        
         
          if(locVal15==true&& locVal15a==true)
         {
             
             locVal15a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 15);               
             m1.setLoctorf15a(false);
                            
         } 
          
           boolean locVal16 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 16);
         boolean locVal16a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 16);        
         
          if(locVal16==true&& locVal16a==true)
         {
             
             locVal16a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 16);               
             m1.setLoctorf16a(false);
                            
         } 
          
          
            boolean locVal17 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 17);
         boolean locVal17a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 17);        
         
          if(locVal17==true&& locVal17a==true)
         {
             
             locVal17a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 17);               
             m1.setLoctorf17a(false);
                            
         } 
          
          
          
            boolean locVal18 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 18);
         boolean locVal18a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 18);        
         
          if(locVal18==true&& locVal18a==true)
         {
             
             locVal18a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 18);               
             m1.setLoctorf18a(false);
                            
         }
          
          
            boolean locVal19 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 19);
         boolean locVal19a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 19);        
         
          if(locVal19==true&& locVal19a==true)
         {
             
             locVal19a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 19);               
             m1.setLoctorf19a(false);
                            
         }
          
         boolean locVal20 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 20);
         boolean locVal20a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 20);        
         
          if(locVal20==true&& locVal20a==true)
         {
             
             locVal20a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 20);               
             m1.setLoctorf20a(false);
                            
         }
           
          boolean locVal21 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 21);
         boolean locVal21a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 21);        
         
          if(locVal20==true&& locVal20a==true)
         {
             
             locVal21a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 21);               
             m1.setLoctorf21a(false);
                            
         }
            
          
          boolean locVal22 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 22);
         boolean locVal22a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 22);        
         
          if(locVal22==true&& locVal22a==true)
         {
             
             locVal22a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 22);               
             m1.setLoctorf22a(false);
                            
         } 
          
          
           boolean locVal23 =  MemberDB.getTORFValueForLocation(m1.getMemid(), 23);
         boolean locVal23a = MemberDB.getTORFValueForLocationa(m1.getMemid(), 23);        
         
          if(locVal23==true&& locVal23a==true)
         {
             
             locVal23a=false;//set to false to make button on html page
                            //go away
             
             MemberDB.setLocationValueForMemberToFalseVar2(false, m1.getMemid(), 23);               
             m1.setLoctorf23a(false);
                            
         } 
          
          
          
          
         request.setAttribute("m1", m1);
        
         
        
        
        
        
        
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
