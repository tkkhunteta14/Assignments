//1
console.log("Hello World");

//2
var name=window.prompt("Enter your name:")
 console.log("welcome "+name);

//3
if(name=="alice" || name=="bob")
{
    console.log("welcome "+name);
}else
    console.log("you are not alice and bob");

  //4
  var num=window.prompt("Enter number");
  for(i=1;i<=num;i++)
     console.log(i);
     
  //5
  var num=window.prompt("Enter number");
  for(i=1;i<=num;i++)
  {
     if(i%3==0 || i%5==0)
        console.log(i);
  }
    
   //6
   var num=window.prompt("Enter number");
   var sum=0,product=1;
   for(i=1;i<=num;i++)
  {
     sum=sum+i;
     product=product*i;
  }
  console.log("Sum of n number "+sum+" "+" Product of n number "+product);
  
 //7
 for(i=1;i<=10;i++)
 {
     console.log(12*i+"\n");
 }
 
 //8
  var num=window.prompt("Enter number");
  var count=0;
  for(i=1;i<=num;i++){
      if(num%i==0)
          count++;
  }
  if(count==2)
     console.log("Prime Number");
     else 
       console.log("number is not prime");

//10
 var year=window.prompt("Enter year");
 var count=0;
 while(count!=20){
    
     if((year%400==0)||(year%4==0 && year%100!=0)){
         console.log(year);
     }
     year++;
     count=count++;
 }

//11
var arr=[10,20,30,40,50,60,100];
function getMax(arr){
    return Math.max(...arr);
}
console.log(getMax(arr));

 //12
 var arr=[10,20,30,40,50,60,100];
 function getReverse(array){
     return array.reverse();
 }
 console.log(getReverse(arr));

 //13
var arr=[10,20,30,40,50,60,100];
var num=window.prompt("Enter the number:")
function getCheck(array){
     for(i=1;i<array.length;i++)
     {
         if(num==array[i])
            console.log("The number is in the list");
     }
}
getCheck(arr);

//14
var arr=[1,2,3,4,5,6,10];
function getOdd(array){
    for(i=0;i<array.length;i++)
    {
        if(array[i]%2!=0)
        console.log("The number is odd");
    }
}

//15
const cumulativeSum = (sum => value => sum += value)(0);

console.log([9,2,5,6,8,7].map(cumulativeSum));

//16
function f1(string) {

    const arrayValues = string.split('');
    
    const reverseArrayValues = arrayValues.reverse();

    const reverseString = reverseArrayValues.join('');

    if(string == reverseString) {
        document.write('It is a palindrome');
    }
    else {
        document.write('It is not a palindrome');
    }
}

const string = prompt('Enter a string: ');

f1(string);

//20
function newList(A, num) {
    var list = [];
    for (var i=0;i<A.length;++i) {
    list.push(A[i]);
    list.push(num[i]);
    }
    return list;
    }
    console.log(newList(['x','y','z'],[1,2,3]));
    
//21
function SortedMerge(arr, arr1) {
    let sortedArr = [] 
    while (arr.length && arr1.length) {
      
      if (arr[0] < arr1[0]) {
        sortedArr.push(arr.shift())
      } else {
        sortedArr.push(arr1.shift())
      }
    }
    return [...sortedArr, ...arr, ...arr1]
  }
  console.log(SortedMerge([1,2,3], [5, 6, 7]))

//23
const number = parseInt(prompt('Enter the number: '));
let n1 = 0, n2 = 1, next;

console.log('Fibonacci Series:');

for (let i = 1; i <= number; i++) {
    console.log(n1);
    next = n1 + n2;
    n1 = n2;
    n2 = next;
}
//24
var num = 12354987,
    result = [],
    num1 = num.toString();

for (var i = 0, len = num1.length; i < len; i += 1) {
    result.push(+num1.charAt(i));
}

console.log(result);

