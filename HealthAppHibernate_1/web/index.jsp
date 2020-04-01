

<%@page import="business.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="business.MemberDB"%>

 

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix ="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import ="java.io.File"%>
<!DOCTYPE html>
 <html lang="en" dir="ltr">
   <head>
		<!--
		
		STLCC Virtual Tour
		Author: International Scrums
		Date: March 6th, 2020
		
		Filename: index.html
		Supporting files: stlcc_logo2.png, graph-img.png, 
	
		-->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		<title>International Scrum</title>
		<!-- Google Fonts -->
		<link href="https://fonts.googleapis.com/css?family=Crete+Round|Lato|Reenie+Beanie&display=swap" rel="stylesheet">          <link rel="stylesheet" href="css/styles.css">

          <!-- Bootstrap Scipts -->

          <!-- CSS Stylesheets -->
          <link rel="stylesheet" href="https://cdn.lineicons.com/1.0.1/LineIcons.min.css">
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
          <link rel="stylesheet" href="css/styles.css">

          <!-- Bootstrap Scipts -->
          <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
		  <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
      <c:if test="${!member.authenticated}">
              
         <script type="text/javascript">
            window.location = "/HealthAppHibernate_1";
         </script>      
              
      </c:if>


    <section id="title">
		<div class="colored-section">
			<img src="images/stlcc_logo2.png" class= "image"  alt="">


			<h1 class="big-heading"> STLCC Virtual Tour </h1>
			</br>

			<nav class="navbar navbar-expand-md navbar-dark">

				<a class="navbar-brand" href=""></a>

				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>

				</button>
				
				<div class="collapse navbar-collapse" id="navbar">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item">
							<a class="nav-link" href="#map">Steps</a>
						<li class="nav-item">
							<a class="nav-link" href="#progress">Progress</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#reached-place">Place</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#goals">Goals</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#footer">Contact us</a>
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</section>

	<body>
            
		<section id="map" class="white-section">
    <title>Clock</title>
    <%--<link rel="stylesheet" href="clock.css">--%>
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">
    <script src="clock.js"></script>
   <%-- <h1>Current Time</h1>--%>
   <h2>Welcome User ${member.firstnm} </h2>
   
        <fieldset>
            <legend><h5> Clock</h5></legend>
            <span id="hours">&nbsp;</span>:
            <span id="minutes">&nbsp;</span>:
            <span id="seconds">&nbsp;</span>&nbsp;
            <span id="ampm">&nbsp;</span>
        </fieldset> 
        <br>
        <br>
			<h3>Steps</h3>
			
                          
                        <form action="" method="post">
				<input type="text" id="howmanystepstoday" name="howmanystepstoday" placeholder="Type Steps so far">

                                <button type="submit"  onclick=form.action="SplashScreen">Calculate</button>
			</form>
                       
                        
                        
    <center>
        <h2> ${progressofsteps}</h2>    
     <h2 style="color: #FFA500">  ${msgTooManySteps} </h2>
     ${msg2}
     ${msg3}    
    <form>
    
    <table>
                 
            <c:if test="${(member.loctorf1)}">
                ${msg5a}
        
  
            </c:if> 
            
    </table>         
    </form>                     
    </center>
    
   <center>                       
   <form>
        
   
    <table>
                 
            <c:if test="${(member.loctorf2)}">
                ${msg5}
        
  
            </c:if> 
            
    </table>         
    </form>        
    </center>         
    <center>   
    <form>
    
    <table>
          
        <c:if test="${(member.loctorf3)}">
                
            ${msg6}
  
         </c:if> 
        
    </table>
    </form>     
    </center>
    <center>                      
    <form>
        <table>   
           <c:if test="${(member.loctorf4)}">
                ${msg7}
        
  
           </c:if> 
    </table>  
    </form>    
    </center>
    <center>  
    <form> 
        <table>    
             <c:if test="${(member.loctorf5)}">
                ${msg8}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf6)}">
                ${msg9}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf7)}">
                ${msg10}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf8)}">
                ${msg11}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
        <form> 
        <table>    
             <c:if test="${(member.loctorf9)}">
                ${msg12}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
       <form> 
        <table>    
             <c:if test="${(member.loctorf10)}">
                ${msg13}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf11)}">
                ${msg14}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf12)}">
                ${msg15}
        
  
           </c:if> 
        </table>
    </form>
    <form>
    </center>
    <center>                      
        <table>    
             <c:if test="${(member.loctorf13)}">
                ${msg16}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf14)}">
                ${msg17}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf15)}">
                ${msg18}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf16)}">
                ${msg19}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf17)}">
                ${msg20}
        
  
           </c:if> 
        </table>
    </form>
    </center> 
    <center>                      
     <form> 
        <table>    
             <c:if test="${(member.loctorf18)}">
                ${msg21}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf19)}">
                ${msg26}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf20)}">
                ${msg23}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf21)}">
                ${msg24}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf22)}">
                ${msg25}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf23)}">
                ${msg29}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf24)}">
                ${msg30}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf25)}">
                ${msg31}
        
  
           </c:if> 
        </table>
    </form> 
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf26)}">
                ${msg32}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf27)}">
                ${msg33}
        
  
           </c:if> 
        </table>
    </form>
    </center>
    <center>                      
    <form> 
        <table>    
             <c:if test="${(member.loctorf28)}">
                ${msg34}
        
  
           </c:if> 
        </table>
    </form>
    </center>      
                
             
         
		</section>

		<section id="progress" class="colored-section">

			<h3 id = "progress-1">Progress</h3>
	
                        
                          ${progressofsteps}  
                             <c:if test="${enterWasPressed&& noErrorsAbove && percentcomplete gt 0 && percentcomplete lt 205921 }">        
                          
                              <div id="Progress_Status" > 
                            <div id="myprogressBar" >     </div> 
                         
                          </div> 
                         
                           
                            
                          </c:if>                       
                          
                            
                            <style> 
#Progress_Status { 
  width: 50%; 
  background-color: #ddd; 
} 
  
#myprogressBar { 
  width: 2%; 
  height: 20px; 
  background-color: #FFA500;
  
}

</style> 
 
  

  

  
<script> 
function update(percentcomplete) 
{ 
  var element = document.getElementById("myprogressBar");    
  var width = 0; 
  var identity = setInterval(scene, 10); 
  function scene()
  { 
    if (width >= 100) 
    { 
      clearInterval(identity); 
    } else 
    {
      while(width < percentcomplete )
      {
        width++;  
        element.style.width = width + '%';  
      }
    } 
  } 
} 
</script> 
			<img src="images/graph-img.png" class= "graph-img"  alt="">


		</section>


		<section id="reached-place" class="white-section">

			<h3>Tour Places</h3>
			<p>1) STLCC - Meremec</p>
			<p>2) Museum of Transportation</p>
			<p>3) STLCC - Wildwood Campus</p>			
			<p>4) ???</p>
			<p>5) ???</p>
			<p>6) ???</p>
			<p>7) STLCC - Corporate College</p>
			<p>8) St.Louis Lambert International Airport</p>
			<p>9) Musick Park</p>
			<p>10) Imo's Pizza</p>
			<p>11) STLCC - Florissant Valley</p>
			<p>12) Koeneman Park</p>
			<p>13) O'Fallon Park</p>
			<p>14) Griot Museum of Black History</p>
			<p>15) STLCC - Harrison Park</p>
			<p>16) Contemporary Art</p>
			<p>17) Pappy's Smokehouse</p>
			<p>18) Ikea</p>
			<p>19) STLCC - Forest Park</p>
			<p>20) St.Louis Zoo</p>
			<p>21) Eat at Gus' Pretzels</p>
			<p>22) Ted Drewes</p>
			<p>23) South County Center</p>
			<p>24) Pink Galleon Billiards and games</p>
			<p>25) Concord Bowl and Recreation</p>
			<p>26) Concord Plaza STL</p>
			<p>27) Laumeir Park</p>
			<p>28) STLCC - Meramec</p>


		</section>

		<section id="goals" class="colored-section">

                    
                    ${msg}
    
    
   
    
  
    
    
    <form>
    <table>
        <tr>
   <%--  <td><input type ="submit" class="loginCSS5" value="click to see locations unlocked" style="background-color: #D57900;font-family: sans-serif;color:#FFFFFF ;" onclick=form.action="Unlocked"></td>--%>
        </tr>
    </table>
    </form>
    
    
    <br>
    
    
    
    <h3>Goals</h3>
    ${msgtest}
    
     <form>
    
         
          <table>
                 
            <c:if test="${(member.loctorf1)}">
                STLCC - Meremec Passed 
                
  
            </c:if> 
            
    </table>
    <table>
                 
            <c:if test="${(member.loctorf2)}">
               Museum of Transportation Passed  
               
  
            </c:if> 
            
    </table>         
    </form>        
          
     <form>
    
    <table>
          
        <c:if test="${(member.loctorf3)}">
                STLCC - Wildwood Campus Passed
                
  
            </c:if> 
        
    </table>
     </form>     
         
    <form>
        <table>   
           <c:if test="${(member.loctorf4)}">
               
        
  
           </c:if> 
    </table>  
    </form>    
        
    <form> 
        <table>    
             <c:if test="${(member.loctorf5)}">
               
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf6)}">
                
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf7)}">
                STLCC - Corporate College Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf8)}">
               St.Louis Lambert International AirportPassed
        
  
           </c:if> 
        </table>
    </form>
        <form> 
        <table>    
             <c:if test="${(member.loctorf9)}">
                Musick Park Passed
        
  
           </c:if> 
        </table>
    </form>
       <form> 
        <table>    
             <c:if test="${(member.loctorf10)}">
                Imo's Pizza Passed
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf11)}">
                
                 STLCC - Florissant Valley Passed
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf12)}">
                Koeneman Park Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf13)}">
                
                 O'Fallon Park Passed
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf14)}">
                
                 Griot Museum of Black History Passed
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf15)}">
                STLCC - Harrison Park Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf16)}">
                Contemporary Art Passed
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf17)}">
               Pappy's Smokehouse Passed 
        
  
           </c:if> 
        </table>
    </form>
     <form> 
        <table>    
             <c:if test="${(member.loctorf18)}">
                Ikea Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf19)}">
                STLCC - Forest Park Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf20)}">
                St.Louis Zoo Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf21)}">
                Eat at Gus' Pretzels Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf22)}">
                 Ted Drewes Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf23)}">
                 South County Center Passed
        
  
           </c:if> 
        </table>
    </form>
    <form> 
        <table>    
             <c:if test="${(member.loctorf24)}">
                Pink Galleon Billiards and games Passed
        
  
           </c:if> 
        </table>
    </form>                    
    <form> 
        <table>    
             <c:if test="${(member.loctorf25)}">
                Concord Bowl and Recreation Passed
        
  
           </c:if> 
        </table>
    </form>      
    <form> 
        <table>    
             <c:if test="${(member.loctorf26)}">
                Concord Plaza STL Passed
        
  
           </c:if> 
        </table>
    </form>                    
    <form> 
        <table>    
             <c:if test="${(member.loctorf27)}">
                Laumeir Park Passed
        
  
           </c:if> 
        </table>
    </form>            
    <form> 
        <table>    
             <c:if test="${(member.loctorf28)}">
                 STLCC - Meramec Passed Again
        
  
           </c:if> 
        </table>
    </form>
   
    
    
		<%--	
			<p>Passed</p>
			<p>Passed</p>
			<p>Passed</p>
			<p>Passed</p>
			<p>Passed</p>
			<p>Passed</p>
			<p>Passed</p> --%>
		</section>

	<script type="text/javascript">
                    update(${percentcomplete});
                 </script>	
	</body>

   <footer class="white-section" id="footer">
		<div class="container-fluid">
			<h4> Contact us </h4>
			<i class="social-icon lni-twitter-filled"></i>
			<i class="social-icon lni-instagram-original"></i>
			<i class="social-icon lni-facebook-original"></i>
			<i class="social-icon lni-envelope"></i>
			<p>© Copyright 2020 International Scrum</p>

		</div>
   </footer>

<a href="HealthLogon.jsp">Return to the Logon page</a>

 </html>
