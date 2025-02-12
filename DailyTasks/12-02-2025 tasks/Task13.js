//Write a JavaScript conditional statement to find the sign of the product of three numbers.
//  Display an alert box with the specified sign.
// Sample numbers : 3, -7, 2
// Output : The sign is -

function Task13(){
    document.write("The sign is "+sign());
   }
const sign=()=>{
   let n1=Number(document.getElementById("nu1").value);
   let n2=Number(document.getElementById("nu2").value);
   let n3=Number(document.getElementById("nu3").value);
   let pro=n1*n2*n3
   if(pro<0){
       return '-';
   }
   else{
       return '+';
   }
}