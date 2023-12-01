// Sorting the Array in descending Order.(Byusing JavaScript)
function sort(arr){
      for(let i=0;i<arr.length-1;i++)
      {
        for(let j=1;j<arr.length-i;j++)
        {
            if(arr[j-1]<arr[j]){
                let temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
      }

}

function main()
{
    let arr = [5,9,2,4,8,1];
    sort(arr);
    console.log(arr.join(" "));
}
main(); 