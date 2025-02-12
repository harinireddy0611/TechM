//Write a JavaScript program to convert temperatures to and from Celsius, Fahrenheit. 
//  [ Formula : c/5 = (f-32)/9 [ where c = temperature in Celsius and f = temperature in Fahrenheit ]
// Expected Output :60°C is 140 °F45°F is 7.222222222222222°C
function Task11(){
    let tempc=Number(document.getElementById("tempc").value);
    let tempf=Number(document.getElementById("tempf").value);
    let f= (tempc/5)*9+32
    let c = ((tempf-32)/9)*5
    document.writeln(tempc+"°C is "+f+" °F \n");
    document.writeln(tempf+"°F is "+c+" °C \n");

}