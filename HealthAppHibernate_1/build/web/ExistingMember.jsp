<%-- 
    Document   : ExistingMember
    Created on : Feb 4, 2020, 8:02:32 PM
    Author     : Michael Mueller
--%>
<%@page import="business.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
     <link rel="stylesheet" href="css/styles.css">
     <!-- Google Fonts -->
     <link href="https://fonts.googleapis.com/css?family=Crete+Round|Lato|Reenie+Beanie&display=swap" rel="stylesheet">   <link rel="stylesheet" href="css/styles.css">
    </head>
    
    
    <body>
        
        <c:choose>
        
        <c:when test="${!member.authenticated}">
              
        <script type="text/javascript">
            window.location = "/HealthAppHibernate_1";
        </script>      
              
        </c:when>
        <c:otherwise>
            
            
        <h1>STLCC Virtual Tour member Data</h1>
      
        
        
        
        
        <form id="memupdate" action="MemberUpdate" method="post">
            <table class="member-details">
            <tr>
                <td>Member ID:</td>
                <td><input type="text" id="memid" name="memid"
                           value="${m.memid}" readonly="true" ></td>
            </tr>
       
           
            <tr>
                <td>First Name:</td>
                <td><input type="text" id="firstname" name="firstname" 
                           value="${m.firstnm}" ></td>
            </tr>
        <%--   
             <tr>
                <td>Age:</td>
                <td><input type="text" id="age" name="age" 
                           value="${m.age}" ></td>
            </tr>
           --%>
     
            <tr>
                <td>Member Weight in pounds(lb unit):</td>
                <td><input type="text" id="weight" name="weight" 
                           value="${m.weight}" ></td>
            </tr>
            <%--   
            <tr>
                <td> height in inches:</td>
                <td><input type="text" id="height" name="height" 
                           value="${m.height}" ></td>
            </tr>
           --%>
            <tr>
                <td>Member Join Date:</td>
                <td><input type="text" id="memdt" name="memdt" readonly="true"
                           value="${m.memDtS}" ></td>
            </tr>
            
         <%--   
            <tr>
           <td><h1>Gender</h1></td>
                 
            
           <td>  <input type="radio" name="command" value="false" ${not m.gender ? 'checked':''}>Male
            <input type="radio" name="command" value=true ${ m.gender ? 'checked':''}>Female</td>

                 
            
           </tr
          --%>
            
            
            <tr>
                <td>Password:</td>
                <td><input type="password" id="psswd" name="psswd" 
                           value="${m.password}" size="22"></td>
            </tr>
            
            
           
            
            
            
            <tr>
                <hr>
                <td></td>
                <td><input type="submit" style="height: 60px;width: 150px;" value="Insert Member data" onclick=form.action="MemberUpdate"><br><br><br></td>
            </tr>
            <br>
            
            
         </table>
            
         </form> 
            <form id="starttourornot" action="MemberUpdate" method="post">
          <table>
            <tr>
                <td><h2>Do you want to start the STLCC Virtual Tour ?</h2><br></td>
            <tr>
            <tr> 
                <td><input type="submit" value="Yes"style="height:60px;width: 100px;" onclick=form.action="ToTheSplashScreen">
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    
                <input type="submit" style="height: 60px;width: 100px;" value="No" onclick=form.action="HealthLogon.jsp"></td>
                
                
                
                
                   
           
                
            </tr>
          </table>
            
            </form>
            <hr>
        <br>
        
        ${msg}
        <hr>
        <a href="HealthLogon.jsp">Return to the Logon page</a>
        <hr>
        
        
        
        
        
        </c:otherwise>
        </c:choose>
 </body>
 
</html>
