//Michael Mueller

//http://www.encodedna.com/2012/11/javascript-digital-clock.htm

"use strict";
var $ = function(id) { return document.getElementById(id); };

var displayCurrentTime = function() 
{
    
    var now = new Date();  //use the 'now' variable in all calculations, etc.
    var hours; 
    hours  = now.getHours();
    var minutes; 
    minutes= now.getMinutes();
    var seconds;
    seconds= now.getSeconds();
    var ampm = "AM";
    
    
    //minutes = padSingleDigit(minutes);
    //seconds = padSingleDigit(seconds);
    
    
    
  
    //document.getElementById("hours").span = hours1;  
    if(hours > 12)
    {
        hours = hours - 12;
        ampm  = "PM";
        
    }
    else
    {
        switch(hours)
        {
            
            case 12:
                ampm ="PM";
                 break;
             case 0:
                 ampm ="AM";
                 hours =12;
                 break;
        }
        
        
       
    }
    
   
    $("hours").innerHTML  = hours;
  
    
    $("minutes").innerHTML  = padSingleDigit(now.getMinutes());
    $("seconds").innerHTML  = padSingleDigit(now.getSeconds());
    
    $("ampm").innerHTML  = ampm;
    
    
};

var padSingleDigit = function(num) {
	if (num < 10) 
        {	
            return "0" + num; 
        }
	else 
        {
            return num; 
        }
};

window.onload = function() 
{
    
    
    displayCurrentTime();
    setInterval(displayCurrentTime, 1000);
    
   
//<!--code from https://www.codeproject.com/Questions/844491/how-to-disable-back-and-forward-button-in-browser-->
 
        //function disableBack() { window.history.forward() }

      //  window.onload = disableBack();
       // window.onpageshow = function(evt) { if (evt.persisted) disableBack() }
   

    
    
 
// set initial clock display and then set interval timer to display
    // new time every second. Don't store timer object because it
    // won't be needed - clock will just run.
};


