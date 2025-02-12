//Write a JavaScript program where the program takes a random integer between 1 and 10,
//  and the user is then prompted to input a guess number.
//  The program displays a message "Good Work" if the input matches the guess number
function Task8(){
    let rnum = Math.floor(Math.random() * 10) + 1;
    let num=document.getElementById('guess');
    if(num<1 &&num>10){
        document.writeln("Enter valid number");
    }
    else{
        if(num===rnum){
            document.writeln("Good Work");
            document.writeln("random number is"+rnum);
        }
        else{
            document.writeln("not correct guess");
            document.writeln("random number is"+rnum);
        }
    }
}