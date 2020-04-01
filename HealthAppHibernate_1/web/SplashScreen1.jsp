<%-- 
    Document   : SplashScreen
    Created on : Feb 14, 2020, 6:01:15 PM
    Author     : Michael Mueller
--%>

<%@page import="business.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="business.MemberDB"%>

 

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import ="java.io.File"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Splash Screen</title>
    </head>
     <c:if test="${!member.authenticated}">
              
         <script type="text/javascript">
            window.location = "/HealthAppHibernate_1";
        </script>      
              
     </c:if>

    
    <body>
        
    
        <br>
        <br>
        <br>
        
        <form>
        <table>
           <% Member m2 = (Member)session.getAttribute("member");%>
            <tr>
                <td>Hi <%= m2.getFirstnm() %> </td> 
            </tr>
                 <%String date ="";
                       date =  (new java.util.Date()).toLocaleString(); %>
            <tr>
                <td>Today is: <%= date %></td>
            </tr>
            
             <tr>
                 
                 <%    Member m1 = (Member)session.getAttribute("member"); %>
                <td>How far have you gone today?  
                    <%m1.setDateoftoday(date);%>
                        
                       
                    <br>
                    <br>
                </td>
            </tr>
            <tr>
              
                
            </tr>
                
            
             <tr>
                    <td><br><br>Enter Your Steps For Today <input type="text"
                    name="howmanystepstoday" id="howmanystepstoday"
                               value=""></td>
                    <td><br><br>
                    </td>
                    
                    
                    <td><br><br><input type="submit" name="Enter" id="Enter"
                               onclick=form.action="SplashScreen" value="Enter">
                        
                        
                    </td>
           
           
             
                   
                    
            </tr>
            <tr>
            </tr>
            <tr>
            </tr>
    
            <tr>
                <td></td>
                
            </tr>
           
            
        </table>
    </form>                
         <c:if test="${m1.noerrors}">         
             ${msg2}
              <!-- <script type="text/javascript" async id="calories-burned-calculator" data-type="verywell-tool" data-vertical="verywellfit" src="https://www.verywellfit.com/static/4.136.1/components/tools/calculators/iframe-embed/embed.min.js?id=calories-burned-calculator"></script>-->
                        
         </c:if > 
         
         <c:if test="${m1.noerrors}">         
             ${msg2}
              <!-- <script type="text/javascript" async id="calories-burned-calculator" data-type="verywell-tool" data-vertical="verywellfit" src="https://www.verywellfit.com/static/4.136.1/components/tools/calculators/iframe-embed/embed.min.js?id=calories-burned-calculator"></script>-->
                        
         </c:if > 
                
           
         
         
    </body>
             
    ${msg}
    ${msg2}
    
    ${msg3}
    
  
    <form>
    
    <table>
                 
            <c:if test="${(member.loctorf2)}">
               
                
        
  
            </c:if> 
            
    </table>         
    </form>        
          
     <form>
    
    <table>
          
        <c:if test="${(member.loctorf3)}">
                ${msg6}
        
  
            </c:if> 
        
    </table>
     </form>     
         
    <form>
        <table>   
           <c:if test="${(member.loctorf4)}">
                ${msg7}
        
  
           </c:if> 
    </table>  
    </form>    
        
    <form> 
        <table>    
             <c:if test="${(member.loctorf5)}">
                ${msg8}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf6)}">
                ${msg9}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf7)}">
                ${msg10}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf8)}">
                ${msg11}
        
  
           </c:if> 
        </table>
    </form>
        <form> 
        <table>    
             <c:if test="${(member.loctorf9)}">
                ${msg12}
        
  
           </c:if> 
        </table>
    </form>
       <form> 
        <table>    
             <c:if test="${(member.loctorf10)}">
                ${msg13}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf11)}">
                ${msg14}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf12)}">
                ${msg15}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf13)}">
                ${msg16}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf14)}">
                ${msg17}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf15)}">
                ${msg18}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf16)}">
                ${msg19}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf17)}">
                ${msg20}
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf18)}">
                ${msg21}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf19)}">
                ${msg26}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf20)}">
                ${msg23}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf21)}">
                ${msg24}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf22)}">
                ${msg25}
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf23)}">
                ${msg29}
        
  
           </c:if> 
        </table>
    </form>
     
    <form> 
        <table>    
             <c:if test="${(member.loctorf24)}">
                ${msg30}
        
  
           </c:if> 
        </table>
    </form>                    
    <form> 
        <table>    
             <c:if test="${(member.loctorf25)}">
                ${msg31}
        
  
           </c:if> 
        </table>
    </form>      
    <form> 
        <table>    
             <c:if test="${(member.loctorf26)}">
                ${msg32}
        
  
           </c:if> 
        </table>
    </form>                    
    <form> 
        <table>    
             <c:if test="${(member.loctorf27)}">
                ${msg33}
        
  
           </c:if> 
        </table>
    </form>            
    <form> 
        <table>    
             <c:if test="${(member.loctorf28)}">
                ${msg34}
        
  
           </c:if> 
        </table>
    </form>       
    <form>
    <table>
        <tr>
     <td><input type ="submit" class="loginCSS5" value="click to see locations unlocked" style="background-color: #D57900;font-family: sans-serif;color:#FFFFFF ;" onclick=form.action="Unlocked"></td>
        </tr>
    </table>
    </form>
    
    
    <br>
    ${msgtest}
    ${msgTooManySteps}
    <a href="HealthLogon.jsp">Return to the Logon page</a>
   
    
    
</html>
