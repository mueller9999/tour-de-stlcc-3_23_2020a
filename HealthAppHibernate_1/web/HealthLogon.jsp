<%-- 
    Document   : HealthLogon
    Created on : Feb 4, 2020, 6:39:01 PM
    Author     : Michael Mueller
--%>

<%--
		
		STLCC Virtual Tour
		Author: International Scrums
		Date: March 13th, 2020
		
		Filename: HealthLogon.jsp
		 
	
		--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8">
     <link rel="stylesheet" href="css/styles.css">
     <!-- Google Fonts -->
     <link href="https://fonts.googleapis.com/css?family=Crete+Round|Lato|Reenie+Beanie&display=swap" rel="stylesheet">   <link rel="stylesheet" href="css/styles.css">
     <meta name="viewport"
           content ="width=device-width,initial-scale=1.0">
       <meta name="viewport"
           content ="width=device-height,initial-scale=1.0">     
     
 </head> 
 <body >
         
     
      <section id = "title">
   <div class="colored-section">
  <h1 class="big-heading"> STLCC Virtual Tour </h1>
</div>
</section>
     
     <form >
    <img class="mb-4" src="images/stlcc_logo.jpg" alt="" width="200" height="72">
    <h2 class="h3 mb-3 font-weight-normal">Login</h1>
     
    
              <table >
                <tr>
                    <td><h2> User ID:</h2></td>
                    <td><input type="text"  name="userid" id="userid"
                               value="">
                    </td>
                
                   
                </tr>
                   
              </table>         
             
                
              <table>     
                 <tr>
                     <td><h2>Password:</h2></td>
                     <td><input class="LoginCSS" type="password" name="password" id="password" >
                    </td>
                </tr>
            
              </table>
                
            
              <table>
              <tr>
                  <td><input type="submit" style="height: 60px;width: 100px" value="Logon" onclick=form.action="Logon"><br>
                      <br></td>
    
              </tr>      
            
              
              
             
              
              <tr>
                  <td><input type ="submit" style="height: 60px;width: 150px;" value="Create New Account" onclick=form.action="GoToCreateAccount"></td>
                  
             
              </tr>
              <tr>
                  
                  
              </tr>    
             
                
            </table>
        </form>
        <br>
        <h3 style="background-color: #D57900"> ${msg} </h3>
        <h3 style="background-color: #D57900">${msg2}</h3>
    
    
    
      <br>
        
 
     
     
     
 </body>    
</html>
