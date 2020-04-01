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
        
        
    <img src = "images/ConcordPlazaSTLGoogleMaps.jpg" style =" align-content: center" width="1152" height="648">   
   <button onclick="window.history.go(-1)"><h2 style="color: orange">go back a page to the Main STLCC Virtual Tour page </h2></button>
    
    
    </body>
    
</html>
