
interface  Arithmetic{
    public  double ArithmeticOperation (int num1,int num2);
}

public class LambdaQ1 {
	 public double addition(int num1,int num2){
	        Arithmetic add = (int n1,int n2)->  n1+n2;
	        return add.ArithmeticOperation(num1,num2);
	    }
	    public double subtraction(int num1,int num2){
	        Arithmetic sub = (int n1,int n2)->  n1-n2;
	        return sub.ArithmeticOperation(num1,num2);
	    }
	    public double multiplication(int num1,int num2){
	        Arithmetic mul = (int n1,int n2)->  n1*n2;
	        return mul.ArithmeticOperation(num1,num2);
	    }
	    public double division(int num1,int num2){
	        Arithmetic div= (int n1,int n2)->  (double) n1/n2;
	        return div.ArithmeticOperation(num1,num2);
	    }
	public static void main(String[] args) {
		LambdaQ1 assignment4Q1 = new LambdaQ1();
        System.out.println(assignment4Q1.addition(45,28));
        System.out.println(assignment4Q1.subtraction(22,11));
        System.out.println(assignment4Q1.multiplication(11,25));
        System.out.println(assignment4Q1.division(25,45));

	}

}
