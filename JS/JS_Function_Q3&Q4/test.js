//Q3
const isEven = x => x % 2 === 0;
var arr = [9, 3, 5, 4, 2];
function Ques3(){
    var i = 0;
    while(i<arr.length){
        if(isEven(arr[i])){
            var even = arr[i];
            break;
        }
        i++;
    }
    document.getElementById('enter').innerHTML = `The even number is ${even}`;
}
//Q4
let arr=[1,2,3,4,5];
		function square(x){
			return x*x;
		}
		function map(arr,func){
			for(var i=0;i<arr.length;i++){
				arr[i]=func(arr[i]);
			}
			return arr;
		}
		document.write(map(arr,square));