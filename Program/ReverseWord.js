// Reverse every word in sentence(Byusing javaScript)
function main(){
    let s = "This is a sunny day";
    let s1 = s.split(" ");
    let s2 = "";

    for(let i=0;i<s1.length;i++)
    {
        s2 = s2+" "+isReverse(s1[i]);
    }
     console.log(s2);
}

function isReverse(s1){
    let reverse = "";

    for(let i=0;i<s1.length;i++)
    {
        reverse = s1.charAt(i)+reverse  ; 
    }
    return reverse;
}
main();