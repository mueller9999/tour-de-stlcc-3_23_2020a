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
        
        
        
        
        
        
        
        <a name="top"> </a>
        <table>
            <%-- <tr><td><img src="STLCC Logo.png" height="120" width="400"></td>
                <td > <input type ="button" value="Enter Steps" style="font-size : 20px; width: 200px; height: 125px;background-color:#0082CA;font-family: sans-serif;color:orangered;" width="211" height="164"  onclick=window.location.href='SplashScreen.jsp' ></td>   
               <td > <input type ="button" value="About The Tour" style="font-size : 20px; width: 200px; height: 125px;background-color:#00396E;font-family: sans-serif;color:orangered;" width="211" height="164"  onclick=form.action="LocationsUnlocked" ></td>   
               <td > <input type ="button" value="About Us" style="font-size : 20px; width: 200px; height: 125px;background-color:#002453;font-family: sans-serif;color:orangered;" width="211" height="164"  onclick=form.action="LocationsUnlocked" ></td>   
            </tr>
            --%>
      <%--  </table>
        <table>
           
            <tr> <h1 style="color:orangered">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Locations</h1></tr>  
            <tr><h1 style="color: orangered">Last Unlocked: </h1></tr> 
<tr><input type="text" name="lastunlocked" value="" id="lastunlocked" width="200" height="20" readonly="true"></tr>  
            <tr><h1 style="color: orangered">Location: </h1></tr> 
<tr><input type="text" name="location" value="" id="location" width="180" height="20" readonly="true"></tr>
<tr><h1 style="color: orangered">Goal Number: </h1></tr> 
<tr><input type="text" name="goal" value="" id="goal" width="40" height="20" readonly="true"></tr>
        
<tr><h1 style="color: orangered">Steps to next location: </h1></tr> 
<tr><input type="text" name="stepstonextlocation" value="" id="stepstonextlocation" width="180" height="20" readonly="true"></tr>

<tr><h1 style="color: orangered">Total Steps: </h1></tr> 
<tr><input  type="text" name="totalsteps"   value="" id="totalsteps" width="160" height="20" readonly="true"></tr>
<tr> 
    <td>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</td> <td><h1 style="color: orangered">Location: </h1></td>
                         
</tr>
<tr>
     <td>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</td> <td><input type="text" readonly="true" width="200" height="10" ></td>
</tr>
<tr>
     <td>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</td> <td><h1 style="color:orangered">Browse  Unlocked Locations:</h1></td>
</tr>
</table>

        <table id="tableNextPreviousButtons">   
 <tr>
     <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        
        <input type ="submit"  value="Previous" style="font-size : 20px; 
               width: 100px; height: 
               50px;background-color:#533F00; font-family: sans-serif;color:orangered;margin-left: 200px"  
               onclick=form.action="LocationsUnlocked">
            &nbsp;&nbsp;&nbsp;&nbsp;<input type ="submit" value="next" 
                                           style="font-size : 20px; width: 
                                           100px; height: 50px;background-color:#533F00;font-family: sans-serif;
                                           color:orangered;margin-left: 100px";
                                           onclick=form.action="LocationsUnlocked"></td>   
       
</tr>
<tr>
    
    <td><input type ="button"  
                                           style="font-size : 20px; width: 
                                           100px; height: 50px;background-color:#533F00;font-family: sans-serif;
                                           color:orangered;margin-left: 750px";
                                           onclick="window.location.href = 'HealthLogon.jsp';" value="Sign Out"/></td>  
    
</tr>




        </table>
        <table>
            
            <tr></tr>
            
            <tr ><td><img src="Backpack.png"  > <br><br>  </td></td> </tr> <td> 
           
            <tr>
                <td><td > <input type ="button" value="get a image" style="font-size : 20px; width: 200px; height: 125px;background-color: #002453;" onclick=form.action="Unlocked" ></td> 
            </tr>
                
            <tr>
            <img alt ="img" src="data:image/jpg;base64,${base64a}"  /> 
            </tr> 
        </table>        
        
     
     
        
       <%-- 
        <h3><c:out value = "${pictures.pictureName}" /></h3>
        <h3><c:out value = "${pictures.imageid}" /></h3>
          --%>
        
       
        
       <%-- <img src="data:image/jpg;base64,${result}" width="300" height="240"  /> --%>
       
    
      <%-- <img src ="STLCC Logo1.png" width="373" height="158"> 
    --%>
  <%-- <h1 style="color:orangered"> ${base64a} </h1>--%>
    
  
  
    <img src = "images/WildWoodPicGoogleMaps.jpg" width="700" height="700">   
   <button onclick="window.history.go(-1)"><h2 style="color: orange">go back a page to the Main STLCC Virtual Tour page </h2></button>
    
    
    </body>
    
</html>
