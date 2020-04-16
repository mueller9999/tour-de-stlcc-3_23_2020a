<%-- 
    Document   : CreateAccount
    Created on : Feb 4, 2020, 7:59:31 PM
    Author     : Michael Mueller
--%>
<%--
		
		STLCC Virtual Tour
		Author: International Scrums
		Date: March 13th, 2020
		
		Filename: CreateHealthAccount.jsp
		 
	
		--%>

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



<body>
        <h1>Add STLCC Virtual Tour member Data</h1>
        <hr> 
        <form id="memupdate" action="MemberUpdate" method="post">
            <table class="member-details">
            <tr>
                <td>Member ID:</td>
                <td><input type="text" id="memid" name="memid"
                           value="" ></td>
            </tr>
           
            <tr>
                <td>First Name:</td>
                <td><input type="text" id="firstname" name="firstname" 
                           value="" ></td>
            </tr>
          
         
          
             <tr>
                <td>Weight in pounds(lb unit):</td>
                <td><input type="text" id="weight" name="weight" 
                           value="" ></td>
             </tr>
             <%--
             <tr>
             <tr>
                <td>height in inches:</td>
                <td><input type="text" id="height" name="height" 
                           value="" ></td>
             </tr>
                --%>
               <%--  <tr>
                <td>age in years:</td>
                <td><input type="text" id="age" name="age" 
                           value="" ></td>
                </tr>
               --%>
       <%--      <tr>
                 <td><h1>Gender</h1></td>
                 <td><INPUT TYPE="radio" id="male" name="command" value="false"/>Male</td>
                 <td><INPUT TYPE="radio" id="female" name="command" value="true" checked="checked"/>Female</td>    
                 
            </tr>
           --%>     
            
            <tr>
                <td>Member Date:</td>
                <td><input type="text" id="memdt" name="memdt" readonly="true" 
                           value="${m.memDtS}" ></td>
            </tr>
            
            <tr>
                <td>Password:</td>
                <td><input type="password" id="psswd" name="psswd" 
                           value="" size="22"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" style="width: 100px;height: 60px;" value="Insert Member data" onclick=form.action="CreateAccount" ></td>
            </tr>
            </table>
        </form>
        <br>
        
        ${msg}
        <hr>
        <a href="HealthLogon.jsp">Go back to login/newmember screen</a>
        
        
 </body>