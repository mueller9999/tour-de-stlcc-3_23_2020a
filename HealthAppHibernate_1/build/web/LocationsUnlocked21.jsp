<%-- 
    Document   : LocationsUnlocked
    Created on : Feb 27, 2020, 6:11:11 PM
    Author     : Michael Mueller
--%>
<%@page import="java.io.OutputStream"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="business.Member"%>

<%@page import="business.MemberDB"%>

<%@page import ="java.io.File"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Locations</title>
        <meta name="viewport"
           content ="width=device-width,initial-scale=1.0">
       <meta name="viewport"
           content ="width=device-height,initial-scale=1.0">  
    </head>
   
    <body>
         <c:if test="${!member.authenticated}">
              
         <script type="text/javascript">
            window.location = "/HealthAppHibernate_1";
        </script>      
              
        </c:if>
        
        
        
        <c:if test="${member.loctorf2}">
              
         <script type="text/javascript">
            function myFunction()
            {
                
                var x = document.getElementById("loc2").value;
                println(x);
                
                
            }
            
            
        </script>      
              
        </c:if>
        
        
    <img src = "images/GusPretzelsGoogleMaps.jpg" style =" align-content: center" width="1152" height="648">   
    <form id="starttourornot"  method="post">
          <table>
            <tr>
                
            <tr>
            <tr> 
                <td><input type="submit" value="Back To the Main page"style="height:60px;width: 500px;" onclick=form.action="ToTheSplashScreen">
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    
               
                    
                            
           
                
            </tr>
          </table>
            
            </form>            
                    
    
    
    </body>
    
</html>
