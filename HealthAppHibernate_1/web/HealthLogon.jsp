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
      
    <SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
    </SCRIPT>
    <script type = "text/javascript" >
history.pushState(null, null, 'HealthLogon.jsp');
window.addEventListener('popstate', function(event) {
history.pushState(null, null, 'HealthLogon.jsp');
});
</script>
  <meta charset="utf-8">
     <link rel="stylesheet" href="css/styles.css">
     <!-- Google Fonts -->
     <link href="https://fonts.googleapis.com/css?family=Crete+Round|Lato|Reenie+Beanie&display=swap" rel="stylesheet">   <link rel="stylesheet" href="css/styles.css">
     <meta name="viewport"
           content ="width=device-width,initial-scale=1.0">
       <meta name="viewport"
           content ="width=device-height,initial-scale=1.0">     

     <%--code from https://www.codeproject.com/Questions/844491/how-to-disable-back-and-forward-button-in-browser--%>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js">
    </script>
       
       <style>
    #myCanvas
    {
        border:0px;

       
    }
.sidenavright {
  height: 100%;
  width: 250px;
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  background-color: #111;
  overflow-x: hidden;
  padding-top: 0px;
}

.sidenavleft {
  height: 100%;
  width: 250px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  padding-top: 0px;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
}
</style>
 </head> 
 <body onload="noBack();" 
	onpageshow="if (event.persisted) noBack();" onunload="">
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
    
      
     
      <section id = "title">
   <div class="colored-section">
  <h1 class="big-heading"> STLCC Virtual Tour </h1>
</div>
</section>
    
     <div id= "container" class="sidenavright">
    <canvas id="myCanvas1" width="250" height="900"></canvas>
</div>
     
<script>
    var mainCanvas = document.getElementById("myCanvas1");
    var mainContext = mainCanvas.getContext('2d');


    var circles=[];

    function Circle(radius,speed,width,xPos,yPos)
    {

        this.radius = radius;
        this.speed = speed;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos

        this.opacity = .05 + Math.random() * .5;

        this.counter =0;

        var signHelper = Math.floor(Math.random()*2);

        if(signHelper==1)
        {
            this.sign = -1;

        }
        else
        {
            this.sign = -1;


        }



    }

    Circle.prototype.update = function()
    {

        this.counter += this.sign * this.speed;
        mainContext.beginPath();
        mainContext.arc(this.xPos
         + Math.cos(this.counter/100) * this.radius,this.yPos
        +Math.sin(this.counter/100) * this.radius,
        this.width,
        0,
        Math.PI *2,
        false); 
        
        mainContext.closePath();
        mainContext.fillStyle='rgba(185,211,238', this.opacity+')';
        mainContext.fill();     

    };

    function setupCircles()
    {
        for(var i=0;i<20;i++)
        {
            var randomX = Math.round(-200 + Math.round(-200 + Math.random()* 700));
            var randomY = Math.round(-200 + Math.random()*700);
            var speed = .2 + Math.random() * 3;
            var size = 5 + Math.random() * 100;


            var circle = new Circle(20,speed,size,randomX,randomY);


            circles.push(circle);

        }

        drawAndUpdate();
    }
    setupCircles();
    function drawAndUpdate()
    {
        mainContext.clearRect(0, 0, 250, 900);
        
        for(var i=0;i< circles.length;i++)
        {

            var myCircle = circles[i];
            myCircle.update();
        }

        requestAnimationFrame(drawAndUpdate);

    }

</script>



     <div id= "container2" class="sidenavright">
    <canvas id="myCanvas2" width="250" height="900"></canvas>
</div>
     
<script>
    var mainCanvas = document.getElementById("myCanvas2");
    var mainContext = mainCanvas.getContext('2d');


    var circles=[];

    function Circle(radius,speed,width,xPos,yPos)
    {

        this.radius = radius;
        this.speed = speed;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos

        this.opacity = .05 + Math.random() * .5;

        this.counter =0;

        var signHelper = Math.floor(Math.random()*2);

        if(signHelper==1)
        {
            this.sign = -1;

        }
        else
        {
            this.sign = -1;


        }



    }

    Circle.prototype.update = function()
    {

        this.counter += this.sign * this.speed;
        mainContext.beginPath();
        mainContext.arc(this.xPos
         + Math.cos(this.counter/100) * this.radius,this.yPos
        +Math.sin(this.counter/100) * this.radius,
        this.width,
        0,
        Math.PI *2,
        false); 
        
        mainContext.closePath();
        mainContext.fillStyle='rgba(185,211,238', this.opacity+')';
        mainContext.fill();     

    };

    function setupCircles()
    {
        for(var i=0;i<20;i++)
        {
            var randomX = Math.round(-200 + Math.round(-200 + Math.random()* 700));
            var randomY = Math.round(-200 + Math.random()*700);
            var speed = .2 + Math.random() * 3;
            var size = 5 + Math.random() * 100;


            var circle = new Circle(20,speed,size,randomX,randomY);


            circles.push(circle);

        }

        drawAndUpdate();
    }
    setupCircles();
    function drawAndUpdate()
    {
        mainContext.clearRect(0, 0, 250, 900);
        
        for(var i=0;i< circles.length;i++)
        {

            var myCircle = circles[i];
            myCircle.update();
        }

        requestAnimationFrame(drawAndUpdate);

    }

</script>
    
     <form method="POST" float="center">
    <img class="mb-4" src="images/stlcc_logo.jpg" alt="" width="200" height="72">
    <h2 class="h3 mb-3 font-weight-normal">Login</h1>
     
    <div class = "input-info">
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
                     <td><input type="checkbox" onclick="TogglePass()"> 
    <b>Show/hide Password</b> </td>
            </tr>
                     </td>
                </tr>
            
              </table>
                <script> 
    // Change the type of input to password or text 
        function TogglePass() { 
            var temp = document.getElementById("password"); 
            if (temp.type === "password") { 
                temp.type = "text"; 
            } 
            else { 
                temp.type = "password"; 
            } 
        } 
</script> 
            
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
	     </div>   
	    
        </form>
        <br>
        <h3 style="background-color: #D57900"> ${msg} </h3>
        <h3 style="background-color: #D57900">${msg2}</h3>
    
    
      <br>
          
 </body>    
</html>
