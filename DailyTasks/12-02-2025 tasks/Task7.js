//Write a JavaScript program to find out if 1st January will be a Sunday between 2014 and 2050.  
function Task7(){
    for(let year=2014;year<=2050;year++){
        let date=new Date(year,0,1);
        if(date.getDay()==0){
            document.writeln(year);
        }
    }

}