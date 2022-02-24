import java.util.Scanner;

public class TaxAmount {
    public static double calculateTaxAmount(int ctc) {
    	double taxAmount;
    	if(ctc>0 && ctc<=180000)
    	{
    		taxAmount = 0;
    	}else
    		if(ctc>=181001 && ctc<=300000)
    		{
    			taxAmount = ctc*.10;
    		}else
    			if(ctc>=300001 && ctc<=500000)
        		{
        			taxAmount = ctc*.20;
        		}else
        			taxAmount = ctc*.30;
    			
    	return taxAmount;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int income= in.nextInt();
		double tax=calculateTaxAmount(income);
		System.out.print(tax);
	}

}
