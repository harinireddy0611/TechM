//Write a JavaScript program to display the current day and time in the following format.
//Sample Output : Today is : Tuesday.
//Current time is : 10 PM : 30 : 38
function Task1(){
const days= ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
var date=new Date();
const day=date.getDay();
document.writeln("today is: "+ days[day]);
document.writeln("Current time is: "+ date.toLocaleTimeString());
}