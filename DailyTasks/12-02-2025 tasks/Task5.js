//Write a JavaScript program to rotate the string 'digiterati' in the right direction.
// This is done by periodically removing one letter from the string end and attaching it 
// to the front.
function Task5(){
    let str='digiterati';
    for(let i=0;i<str.length;i++){
        str=str[str.length-1]+str.substring(0,str.length-1);
        document.writeln(str);
    }
    document.writeln(str);
}