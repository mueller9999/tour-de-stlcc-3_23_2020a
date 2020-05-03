//https://developer.mozilla.org/en-US/docs/Mozilla/Add-ons/WebExtensions/API/history/deleteAll


window.onload = function() 
{

    function onDeleteAll() 
    {
  console.log("Deleted all history");
    }

function deleteAllHistory()
{
  var deletingAll = browser.history.deleteAll();
  deletingAll.then(onDeleteAll);
}

deleteAllHistory();
    
 
// set initial clock display and then set interval timer to display
    // new time every second. Don't store timer object because it
    // won't be needed - clock will just run.
};