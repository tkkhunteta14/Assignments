
public class ArmstrongNumBetweenRange {
	 public static int armstrongNumbersInRange(int num){
		 int n=num;
		 int sum=0,r,c;
		 while(num>0)
		 {
			 r=num%10;
			 c=r*r*r;
			 sum=sum+c;
			 num=num/10;
		 }
		return sum;


		}
	 
	public static void main(String[] args) {
		   int min = 100,arm;
		   while(min<1000)
		   {
			   arm=armstrongNumbersInRange(min);
			   if(arm==min)
				   System.out.println(min);
			   min++;
		   }
	}

}
