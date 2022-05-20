// Q1
var x=window.prompt("Enter number");
function square(x){
    return x*x
}
var sqr=square(x);
function double(square){
    return x*2;
}
var twice=double(sqr);
function composedValue(square,double){
    // document.write(square+" "+double);
     console.log(square+" "+double);
    }
composedValue(sqr,twice);

// Q2

function Q2(form){
    var m1 = form.m1.value;
     var m2 = form.m2.value;
     var n = parseInt(form.f.value);
     if(m1=='square' && m2=='double'){
         var result = composedValue(square,double,n);}
     else if(m1=='square' && m2=='square'){
         var result = composedValue(square,square,n);}
     else if(m1=='double' && m2=='double'){
         var result = composedValue(double,double,n);}
     else if(m1=='double' && m2=='square'){
         var result = composedValue(double,square,n);}
     else 
         alert('invalid input');
      document.getElementById('hello').innerHTML = `The result of composedvalue of ${m1}(${m2}(${n})) is ` + result;
 }
