import java.util.Scanner;
import java.lang.Math;
public class SiCi {
    public static double simpleInterest(double principalAmount,double time,double interestRate) {
		
    	double si= principalAmount*time*interestRate;
    	return si;
    	
    }
public static double compoundInterest(double principalAmount,double time,double interestRate) {
		
	double a = principalAmount*(1+interestRate);
	double b = time-principalAmount;
    
    	return Math.pow(a,b);
    	
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p = in.nextDouble();
		double r = in.nextDouble();
		double n = in.nextDouble();
		double simpInteresr = simpleInterest(p,n,r);
		System.out.println(simpInteresr);
		double compInterest = compoundInterest(p,n,r);
		System.out.println(compInterest);
	}

}
