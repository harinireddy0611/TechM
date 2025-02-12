//Write a JavaScript program to determine whether a given year is a leap year in the Gregorian calendar.
function Task6(){
const year=document.getElementById("leapyear");
if(year%4==0 && year%100!=0|| year%400==0){
    document.writeln("leap year");
}
else {
    document.writeln("not leap year");
}
}