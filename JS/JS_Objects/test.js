// Q1
class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    // Q2 
    getArea = () => { return this.width * this.height; };
    getPerimeter = () => { return 2 * (this.width + this.height); };
  }
  r = new Rectangle(2, 3);
  document.write(`rectangle r of length ${r.length} & width  ${r.width} has area ${r.getArea()} and perimeter ${r.getPerimeter()} <br> `);
  
  // Q3 
  s = new Rectangle(4,10);
  document.write(`New rectangle s of length ${s.length} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}<br>`);
  s.width = 5;
  document.write(`rectangle s of length ${s.length} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}<br>`);

  // Q4 
  var myObject = {firstname: "Tarun",lastname: "Khunteta",
                       age: "21",
                       city: "Jaipur",
                       state: "Rajasthan",
                       country: "India"};
  document.write(`First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , 
                       age is ${myObject.age} , city is ${myObject.city} ,
                        state is ${myObject.state} , country is ${myObject.country}<br>`);
  myObject.lastname = "Khunteta";
  document.write(`Changed Lastname ${myObject.lastname}<br>`);
  // Q5 
  document.write(`since there is no middle name defined The middle name is : ${myObject.MiddleName}<br>`);
  myObject.MiddleName = "Krishna";
  document.write(`After defining The middle name is : ${myObject.MiddleName}<br>`);
  
  // Q6 
  var string = "{firstName:'Anish', age:22, city:'kishangarh', state:'Rajasthan', country:'India'}";
  eval('var obj='+string);
  document.write(obj);
  myObject.MiddleName = "Nitin";
  document.write(` The middle name is : ${myObject.MiddleName}<br>`);
  
  // Q7 
  var obj = '{ "firstName":"Tarun", "lastName":"Khunteta" }';
  obj = JSON.parse(obj); //converts to a regular object
  document.write(obj); //John*/
  