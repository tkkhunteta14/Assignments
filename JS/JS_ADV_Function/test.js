//Q1
function isEven(num){
    if(num%2==0){
        return true;
    }
    else
        return false;
}
let arr=[1, 3, 5, 4, 2];
function find(arr,func){
    for(var i=0;i,arr.length;i++){
        if(func(arr[i])==true)
            return arr[i];
        else{
            arr.shift();
            return(find(arr,func));
        }
    }

}
document.write(find(arr,isEven));

//Q2

function square(num){
    return num*num;
   }
   var resList=[]
   function map(list,fun){
       if(list.length==0){
         return;
       }
       resList.push(fun(list.slice(0,1)))
       list= list.slice(1,(list.length));
       return map(list,fun);
   }

   map([2,7,6,5,4],square);
   document.write(resList);

   const numbers = [4, 9, 16, 25];
   document.getElementById("p1").innerHTML = numbers.map(Math.sqrt);
   

   //Q3
   var myFunction=function(a,b){
                           return a*b;
                        }
	    document.write(" "+myFunction);

        function squareMyNumber(no){
            return no ** 2
        }
        let squared = squareMyNumber(5);
        document.write(" (5) returns ",squared);