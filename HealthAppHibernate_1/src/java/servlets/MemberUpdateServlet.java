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

/**
 *
 * @author
 */
public class MemberUpdateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        String sql = "", msg = "", URL = "/ExistingMember.jsp";
        String  fnm="", mnm="", memdt="";
        String newpassword = "";
        Double weight=0.0;
        String checkIfEmpty="";
        
         HttpSession session = request.getSession();
         //session.removeAttribute("member");
        
//        String dbURL = "jdbc:mysql://localhost:3306/club294?useSSL=false";
//        String dbUser = "root";
//        String dbPwd = "sesame";
        
         Member newm = new Member();
            Member m = (Member) request.getSession().getAttribute("member");
         try 
        {
           
            newm.setMemid(m.getMemid());
            newm.setFirstnm(m.getFirstnm());
            //newm.setWeight(m.getWeight());
            //newm.setPassAttempt(m.getPassword());
            newm.setPassword(m.getPassword()); 
            
           

        
    }   
       catch(Exception e)
       {
             
                
          
                msg += "Error Update error: " + e.getMessage() + " " +"<br>";
               msg+="Error If member weight was not entered as a integer or double "
                       + "number, enter a integer or double number for weight" +"<br>";
               
               
              if(newpassword.isEmpty())
             {
                //Member m2 = new Member();
                //m2.setPassword(newpassword);
                //boolean passWordIsBlank =false;
                //request.setAttribute("member1", m);
                //request.setAttribute("passblank", passWordIsBlank);
                msg+= "Error Password can not be blank " + "<br>";
                 
             }
               
               
       }    
         
         
         
         
         try
         {
             newpassword = (request.getParameter("psswd"));
             
         }
         catch(Exception e)
         {
             msg+="Error with password " + e.getMessage()+ "<br>";
         }
             
         
         
         try
         {
         
            fnm = request.getParameter("firstname");
            
         }   
         catch(Exception e)
         {
           msg += "Error " + "with firstname" + e.getMessage();
         }
             
             if (fnm.isEmpty())
            {
                newm.setFirstnm(fnm);
                //msg += "First Name cannot be blank. <br>";
                msg+="";
            } else
            {
                newm.setFirstnm(fnm);
                msg+="";
            }
            
             try
             {
             weight = Double.parseDouble(request.getParameter("weight"));
             }
             catch(Exception e)
             {
               msg += "Error with weight has to be a integer or double value problem is " + e.getMessage() + "<br>";
             }
             checkIfEmpty = weight +"";
             
            
             if(newpassword.isEmpty())
             {
                //Member m2 = new Member();
                //m2.setPassword(newpassword);
                //boolean passWordIsBlank =false;
                //request.setAttribute("member1", m);
              //  request.setAttribute("passblank", passWordIsBlank);
                msg+= "Error Password can not be blank " + "<br>";
                 
             }
             
             
              if(checkIfEmpty.isEmpty())        
                 {
                    msg+= "Error weight can not be empty. <br>";
                    //request.setAttribute("msg", msg);
                    
                
                } 
             
             if (Double.isNaN(weight))
            {
                msg += "Error weight has to  be a number. <br>";
                 
                
                
                 
            } 
            
             
             if((!(Double.isNaN(weight)))&& (!checkIfEmpty.isEmpty())&&
                     weight > 0.0)
             {
                newm.setWeight(weight); 
               
             }
            
             if(request.getParameter("weight")=="")
             {
                 
                // msg+="Error weight can not be blank " + "<br>";
                 
             }
            
              else if(weight <= 0)
             {
                 msg+="Error weight has to be greater than 0 and not blank" +"<br>";
                 
             }
          
            memdt = request.getParameter("memdt");
            if (memdt.isEmpty())
            {
                msg += "Error Member date cannot be blank. <br>";
            } else
            {
                newm.setMemdt(m.getMemdt());
                msg +="";
            }
            
                
                
                
                
                 if(newpassword!="" )
                {
                
                    newm.setPassword(newpassword);
                    
               
                }
                else
                {
                    
                  //  msg+= "Error password can not be blank";
                }
           
               
            
         
        
         
            if (msg.contains("Error"))
            {
                //update failed - must reaquire member
               
            }
            else if (!msg.contains("Error")) 
        {
            m = newm;
           //try
           //{
            
         if(weight > 0  && newpassword != "")  
         {
            MemberDB.updateMember(m);
            session.setAttribute("member", m);
         }
         else
         {
            if( !(weight > 0) )
            {
                msg += " weight has to be greater than zero " +"<br>";
                
                
            }
            
            if(weight ==Double.NaN)
            {
                
                msg += "weight has to be a number " + "<br>";
                
            }
            
            if(newpassword=="")
            {
                
                msg+= "password can not be blank " + "<br>"; 
            }
             if(request.getParameter("weight")=="")
             {
                 
                 msg+="Error weight can not be blank " + "<br>";
                 
             }
            
              else if(weight <= 0)
             {
                 msg+="Error weight has to be greater than 0 and not blank" +"<br>";
                 
             }
            
            
            
            m = MemberDB.getMemberByID(m.getMemid());      
         }
        
            
            
            
           
           // 
            
             if(checkIfEmpty=="")
                {
                    msg+= "Error weight can not be empty " +"<br>";
                    
                }
                
                //if(newpassword=="")
               // {
                  //  msg+="Error password can not be blank " + "<br>";
                //}
                
            
        }             
              
        
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
            throws ServletException, IOException {
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

    

 
