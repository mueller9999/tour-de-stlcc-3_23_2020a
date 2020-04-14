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

/**
 *
 * @author miken
 */
public class ToTheSplashScreenServlet extends HttpServlet
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
        
        
        String URL = "/index.jsp";
        String msg ="";
 
        String msg2 ="";
        String msg3 ="";
         String msg4 ="";
        String msg5a ="";
        String msg5 ="";
        String msg6 ="";
        String msg7 ="";
        String msg8 ="";
        String msg9 ="";
        
        String msgTest ="";
        
        
        String msg28 ="";
       String msg29 ="";
        String msgTooManySteps = "";
         String msg10 ="";
        String msg11 ="";
        String msg12 ="";
        String msg13 ="";
        String msg14 ="";
         String msg15 ="";
        String msg16 ="";
        String msg17 ="";
        String msg18 ="";
        String msg19 ="";
         String msg20 ="";
        String msg21 ="";
        String msg26 ="";
        String msg23 ="";
        String msg24 ="";
       
        String msg25 ="";
        
         String msg30 ="";
        String msg31 ="";
        String msg32 ="";
        String msg33 ="";
       
        String msg34 ="";
        String msg35 = "";
        String msg36 = "";
        String msg37 = "";
        
        
         HttpSession session = request.getSession();
        
         String date ="";
         date =  (new java.util.Date()).toLocaleString();
         
         
         Member  m1=  (Member)session.getAttribute("member");
          Member m = (Member)session.getAttribute("member");
 
          Member m3 = m;
         
         request.setAttribute("m1", m1);
        
          RouteWithSteps route = new RouteWithSteps();
        boolean tourIsFinished = false;
        if(MemberDB.getCurrentSteps(m1)>=207187)
        {
            tourIsFinished = true;
            request.setAttribute("tourisfinished", tourIsFinished);
           
            
       
               if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),1)==true)
              
                    {
                        
                       
                         msg5a+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,1) + " see Tour Place? " + "<br>"+
                                
                                 "<button id='loc1' value = '1'style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked1.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked1.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button'style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
                         m3.setLoctorf1(true); 
                     
                    }
                   
                     
                     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),2)==true)
              
                    {
                        
                       
                         msg5+=  "<td>" +"You Passed "  + RouteWithStepsDB.getDestination(route,2) + " see Tour Place? " + "<br>"+
                                
                                 "<button id='loc2' style=\"width: 100px;height: 60px;\" value = '2' onclick=form.action='LocationsUnlocked2.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked2.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
                         m3.setLoctorf2(true); 
                     
                    }
                           
                     
                     
                       if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),3)==true)
              
                    {
                        
                       
                        msg6+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,3) + " see Tour Place? " + "<br>"+
                                 
                                 "<button id='loc3' value = '3'style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked3.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked3.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
                         m3.setLoctorf3(true); 
                     
                    }
                     
                     
                      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),4)==true)
              
                    {
                        
                       
                        msg35+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,4) + " see Tour Place? " + "<br>"+
                                 
                                 "<button id='loc4' value = '4'style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked28.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked28.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash' onclick =\"window.location.href = 'index.jsp';\">"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;
                    
                         
                         
                         
                         m3.setLoctorf4(true); 
                     
                    }   
                       
                     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),5)==true)
              
                    {
                        
                       
                        
                        msg36+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,5) + " see Tour Place? " + "<br>"+
                                 
                                 "<button id='loc4' value = '4'style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked29.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked29.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash' onclick =\"window.location.href = 'index.jsp';\">"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;
                    
                        
                         
                         
                         m3.setLoctorf5(true); 
                     
                    }   
                         
                    
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),6)==true)
              
     {
                        
                       
          msg37+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,6) + " see Tour Place? " + "<br>"+
                                 
                                 "<button id='loc4' value = '4'style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked30.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked30.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;             
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf6(true); 
                     
    }                    
       
     
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),7)==true)
              
     {
                        
                       
          msg10+="<td>"+   "You Passed "  + RouteWithStepsDB.getDestination(route,7) + " see Tour Place? " + "<br>"+
                                  
                                 "<button id='loc7' style=\"width: 100px;height: 60px;\" value = '7' onclick=form.action='LocationsUnlocked7.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked7.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+ "</td>"+"<br>" ;             
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf7(true); 
                     
    }   
     
                     
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),8)==true)
              
     {
                        
                       
          msg11+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,8) + " See Tour Place? " + "<br>"+
                                  
                                 "<button id='loc8'style=\"width: 100px;height: 60px;\" value = '8' onclick=form.action='LocationsUnlocked8.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked8.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf8(true); 
                     
    }   
                      
                       
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),9)==true)
              
     {
                        
                       
           msg12+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,9) + " See Tour Place? " + "<br>"+
                                  
                                 "<button id='loc9' style=\"width: 100px;height: 60px;\" value = '9' onclick=form.action='LocationsUnlocked9.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked9.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf9(true); 
                     
    }                      
      
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),10)==true)
              
     {
                        
        msg13+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,10) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc10' style=\"width: 100px;height: 60px;\" value = '10' onclick=form.action='LocationsUnlocked10.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked10.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf10(true); 
                     
    } 
      
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),11)==true)
              
     {
                        
                       
          msg14+="<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,11) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc11' style=\"width: 100px;height: 60px;\" value = '11' onclick=form.action='LocationsUnlocked11.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked11.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ; 
                     
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf11(true); 
                     
    } 
     
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),12)==true)
              
     {
                        
                       
         msg15+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,12) + " See Tour Place? " + "<br>"+
                                  
                                 "<button id='loc12' style=\"width: 100px;height: 60px;\" value = '12' onclick=form.action='LocationsUnlocked12.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked12.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf12(true); 
                     
    } 
      
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),13)==true)
              
     {
                        
                       
         msg16+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,13) + " See Tour Place? " + "<br>"+
                                  
                                 "<button id='loc13' style=\"width: 100px;height: 60px;\" value = '13' onclick=form.action='LocationsUnlocked13.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked13.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;                
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf13(true); 
                     
    } 
      
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),14)==true)
              
     {
                        
                       
        msg17+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,14) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc14' style=\"width: 100px;height: 60px;\" value = '14' onclick=form.action='LocationsUnlocked14.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked14.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf14(true); 
                     
    }  
    
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),15)==true)
              
     {
                        
                       
          msg18+="<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,15) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc15' value = '15' style=\"width: 100px;height: 60px;\" onclick=form.action='LocationsUnlocked15.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked15.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf15(true); 
                     
    }  
       
    if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),16)==true)
              
     {
                        
                       
          msg19+="<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,16) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc16' style=\"width: 100px;height: 60px;\" value = '16' onclick=form.action='LocationsUnlocked16.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked16.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf16(true); 
                     
    }  
     
     
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),17)==true)
              
     {
                        
                       
          msg20+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,17) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc17'  style=\"width: 100px;height: 60px;\" value = '17' onclick=form.action='LocationsUnlocked17.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked17.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;                
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf17(true); 
                     
    }  
    
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),18)==true)
              
     {
                        
                       
                         
          msg21+= "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,18) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc18' style=\"width: 100px;height: 60px;\" value = '18' onclick=form.action='LocationsUnlocked18.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked18.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf18(true); 
                     
    }   
     
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),19)==true)
              
     {
                        
                       
                         
          msg26+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,19) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc19' style=\"width: 100px;height: 60px;\" value = '19' onclick=form.action='LocationsUnlocked19.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked19.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;             
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf19(true); 
                     
    }   
    
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),20)==true)
              
     {
                        
                       
          msg23+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,20) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc20' style=\"width: 100px;height: 60px;\" value = '20' onclick=form.action='LocationsUnlocked20.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked20.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf20(true); 
                     
    }    
    
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),21)==true)
              
     {
                        
                       
             msg24+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,21) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc21' style=\"width: 100px;height: 60px;\" value = '21' onclick=form.action='LocationsUnlocked21.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked21.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf21(true); 
                     
    }  
    
      
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),22)==true)
              
     {
                        
                       
           msg25+="<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,22) + " See Tour Place? " + "<br>"+
                                  
                                 "<button id='loc22' style=\"width: 100px;height: 60px;\" value = '22' onclick=form.action='LocationsUnlocked22.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked22.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages"+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf22(true); 
                     
    }    
      
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),23)==true)
              
     {
                        
                       
         msg29+=  "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,23) + " See Tour Place? " + "<br>"+
                               
                                 "<button id='loc23' style=\"width: 100px;height: 60px;\" value = '23' onclick=form.action='LocationsUnlocked23.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked23.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;               
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf23(true); 
                     
    }     
     
    if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),24)==true)
              
     {
                        
                       
         msg30+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,24) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc24' style=\"width: 100px;height: 60px;\" value = '24' onclick=form.action='LocationsUnlocked24.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked24.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;             
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf24(true); 
                     
    }      
      
     if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),25)==true)
              
     {
                        
                       
         msg31+=  "<td>" + "Passed "  + RouteWithStepsDB.getDestination(route,25) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc25' style=\"width: 100px;height: 60px;\" value = '25' onclick=form.action='LocationsUnlocked25.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked25.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;              
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf25(true); 
                     
    }      
     
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),26)==true)
              
     {
                        
                       
          msg32+="<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,26) + " See Tour Place? " + "<br>"+
                                 
                                 "<button id='loc26' style=\"width: 100px;height: 60px;\" value = '26' onclick=form.action='LocationsUnlocked26.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked26.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button'style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;             
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf26(true); 
                     
    } 
    
      
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),27)==true)
              
     {
                        
                       
          msg33+=  "<td>" + "You Passed "  + RouteWithStepsDB.getDestination(route,27) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc27' style=\"width: 100px;height: 60px;\" value = '27' onclick=form.action='LocationsUnlocked27.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked27.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;                 
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf27(true); 
                     
    }  
      
     
      if(MemberDB.getTORFValueForLocation(m3.getMemid().trim(),28)==true)
              
     {
                        
            msg34+= "<td>" +  "You Passed "  + RouteWithStepsDB.getDestination(route,28) + " See Tour Place? " + "<br>"+
                                
                                 "<button id='loc1' style=\"width: 100px;height: 60px;\" value = '1' onclick=form.action='LocationsUnlocked1.jsp' >"
                                 + "Yes" + "</button>" 
                                 + "<a href='LocationsUnlocked1.jsp'>"+"see location "+ "</a>"+"&nbsp;"+
                                "&nbsp"+"&nbsp"+"&nbsp"+"&nbsp"+"&nbsp" +
                      "<input type='button' style=\"width: 100px;height: 60px;\" name='No' value='No' onclick =\"window.location.href = 'index.jsp';\">"+  "<a href='index.jsp' id='splash'>"+" stay on this webpage and clear messages "+
              "</a>"+"</td>"+"<br>" ;             
                       
                    
                         //MemberDB.setLocationValueForMemberToTrueVar2(true,m3.getMemid(),2);   
                         
                         
       m3.setLoctorf28(true); 
                     
    }
            
            
        
        }
        
       // m1.is
        

//        request.setAttribute("noErrorsAbove", noErrorsAbove);
//        request.setAttribute("enterWasPressed", enterWasPressed);
        session.setAttribute("member", m1);
//        session.setAttribute("routewithsteps",route);
        request.setAttribute("msg2", msg2);
        request.setAttribute("msg3",msg3);
        //request.setAttribute("finishedtour", finishedTour);
        request.setAttribute("m1", m);
        request.setAttribute("msg4", msg4);
         request.setAttribute("msg5", msg5);
        request.setAttribute("msg6", msg6);
        request.setAttribute("msgTooManySteps", msgTooManySteps);
        request.setAttribute("msg7", msg7);
         request.setAttribute("msg8", msg8);
        request.setAttribute("msg9", msg9);
        request.setAttribute("msg10", msg10);
        request.setAttribute("msg11", msg11);
        request.setAttribute("msg12", msg12);
        request.setAttribute("msg13", msg13);
        request.setAttribute("msg14", msg14);
        request.setAttribute("msg15", msg15);
        request.setAttribute("msg16", msg16);
        request.setAttribute("msg17", msg17);
        request.setAttribute("msg18", msg18);
        request.setAttribute("msg19", msg19);
        request.setAttribute("msg20", msg20);
        request.setAttribute("msg21", msg21);
      //  request.setAttribute("msg22", msg22);
        request.setAttribute("msg23", msg23);
        request.setAttribute("msg26", msg26);
        request.setAttribute("msg24", msg24); 
        request.setAttribute("msg25", msg25);
        
        request.setAttribute("msg28", msg28);
        request.setAttribute("msg29", msg29);
        
         request.setAttribute("msg30", msg30);
        request.setAttribute("msg31", msg31); 
         request.setAttribute("msg32", msg32);
        request.setAttribute("msg33", msg33);
        
         request.setAttribute("msg34", msg34);
          request.setAttribute("msg5a", msg5a);
          request.setAttribute("msg35", msg35);
         request.setAttribute("msg36", msg36);
         request.setAttribute("msg37", msg37);
       
       session.setAttribute("m1", m1);
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
