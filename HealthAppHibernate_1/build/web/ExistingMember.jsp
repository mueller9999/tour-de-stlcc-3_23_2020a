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
 
        <SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
        </SCRIPT>
        <%-- Hide JavaScript from older browsers--%> 
       
<script type = "text/javascript" >
history.pushState(null, null, 'HealthLogon.jsp');
window.addEventListener('popstate', function(event) {
history.pushState(null, null, 'HealthLogon.jsp');
});
</script>
        
     <%--end code from youtube https://www.youtube.com/watch?v=jRvN1uQJN2Q--%>
        <meta charset="utf-8">
     <link rel="stylesheet" href="css/styles.css">
     <!-- Google Fonts -->
     <link href="https://fonts.googleapis.com/css?family=Crete+Round|Lato|Reenie+Beanie&display=swap" rel="stylesheet">   <link rel="stylesheet" href="css/styles.css">
      <%--code from https://www.codeproject.com/Questions/844491/how-to-disable-back-and-forward-button-in-browser--%>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js">
    </script>
    <%-- code from https://www.javaprogrammingforums.com/javaserver-pages-jsp-jstl/7185-how-disable-forward-backward-buttons-using-javascript.html --%>
    
<%--end code from https://www.javaprogrammingforums.com/javaserver-pages-jsp-jstl/7185-how-disable-forward-backward-buttons-using-javascript.html--%>
 
    </head>
    <meta name="viewport"
           content ="width=device-width,initial-scale=1.0">
       <meta name="viewport"
           content ="width=device-height,initial-scale=1.0">  
    <%--code from https://www.javaprogrammingforums.com/javaserver-pages-jsp-jstl/7185-how-disable-forward-backward-buttons-using-javascript.html--%>
    <body onload="noBack();" 
	onpageshow="if (event.persisted) noBack();" onunload="">
        <%--end code from https://www.javaprogrammingforums.com/javaserver-pages-jsp-jstl/7185-how-disable-forward-backward-buttons-using-javascript.html--%>
        
<%--code from https://www.codeproject.com/Questions/844491/how-to-disable-back-and-forward-button-in-browser--%>
 <script type = "text/javascript" >
history.pushState(null, null, 'HealthLogon.jsp');
window.addEventListener('popstate', function(event) {
history.pushState(null, null, 'HealthLogon.jsp');
});
</script>   
<script> 
         deleteAllHistory();
        
     </script>    
     <script>
         function onDeleteAll() 
    {
  console.log("Deleted all history");
    }

function deleteAllHistory()
{
  var deletingAll = browser.history.deleteAll();
  deletingAll.then(onDeleteAll);
}

     </script>  
            

        
        <c:choose>
        
        <c:when test="${!member.authenticated}">
       
            
        <script type="text/javascript">
            
             
         
            
        
            window.location = "/HealthAppHibernate_1";
            
            
        
        </script>      
     
        
       
        
        </c:when>
        <c:otherwise>
        
           
            
            
        <h1>STLCC Virtual Tour member Data</h1>
      
        
        
        
        
        <form id="memupdate" action="MemberUpdate" method="post">
          
            <div id= "div1" style = "display:none">
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
     <%-- got code for show hide of weight at https://www.geeksforgeeks.org/show-hide-password-using-javascript/--%>
            <tr>
                <td>Member Weight in pounds(lb unit):</td>
                <td><input type="password" id="weight" name="weight" 
                           value="${m.weight}" ></td>
               <%-- <td><input type="checkbox" onclick="Toggle()"> --%>
  <%--  <b>Show/hide Weight</b> </td>--%>
            </tr>
            
            <script> 
    // Change the type of input to password or text 
        function Toggle() { 
            var temp = document.getElementById("weight"); 
            if (temp.type === "password") { 
                temp.type = "text"; 
            } 
            else { 
                temp.type = "password"; 
            } 
        } 
</script> 

  <script> 
    // Change the type of input to password or text 
        function TogglePass() { 
            var temp = document.getElementById("psswd"); 
            if (temp.type === "password") { 
                temp.type = "text"; 
            } 
            else { 
                temp.type = "password"; 
            } 
        } 
</script> 



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
             <%--   <td><input type="checkbox" onclick="TogglePass()"> 
    <b>Show/hide Password</b> </td>--%>
            </tr>
            
            <tr>
                <hr>
                <td></td>
                <td><input type="submit" style="height: 60px;width: 150px;" value="Insert Member data" onclick=form.action="MemberUpdate"><br><br><br></td>
            </tr>
            <br>
          
         </table>
        </div>
         </form>
      
        <%--code from https://stackoverflow.com/questions/18421082/show-hide-div-if-checkbox-selected--%> 
            <input type="checkbox" name="c1" onclick="showMe('div1')">Show Hide Member data
            <%--end code from https://stackoverflow.com/questions/18421082/show-hide-div-if-checkbox-selected--%>

    <script>
        <%--code from https://stackoverflow.com/questions/18421082/show-hide-div-if-checkbox-selected --%>
        
         function showMe (box) {

    var chboxs = document.getElementsByName("c1");
    var vis = "none";
    for(var i=0;i<chboxs.length;i++) { 
        if(chboxs[i].checked){
         vis = "block";
            break;
        }
    }
    document.getElementById(box).style.display = vis;


}
<%--end code from https://stackoverflow.com/questions/18421082/show-hide-div-if-checkbox-selected --%>
</script>
            <form id="starttourornot" action="MemberUpdate" method="post">
          <table>
            <tr>
                <td><h2>Do you want to start the STLCC Virtual Tour ?</h2><br></td>
            <tr>
            <tr> 
                <td><input type="submit" value="Yes"style="height:60px;width: 100px;" onclick=form.action="ToTheSplashScreen">
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    
                <input type ="submit" style="height: 60px;width: 200px;" value="No(return to logon page)" onclick=form.action="Invalidate">
                    
                <form>
      
    
           
 
        </form>
                
                
                   
           
                
            </tr>
          </table>
            
            </form>
            <hr>
        <br>
        
        ${msg}
        <hr>
        <input type ="submit" style="height: 60px;width: 200px;" value="return to logon page" onclick=form.action="Invalidate">
        <hr>
        
        
        
        
        
        </c:otherwise>
        </c:choose>
 </body>
 
</html>
