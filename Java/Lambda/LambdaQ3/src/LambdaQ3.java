import javax.swing.plaf.FontUIResource;
import java.util.function.Function;


public class LambdaQ3 {
    static int modifyValue(int n,Function fun) {

      return (int)fun.apply(n);



    }

    static class Product {
    }

    static void display(int r) {
        System.out.println(r);
    }

    public static void main(String[] args) {
        int r =modifyValue(6,val->(Integer)val+ 5);
        display(r);
    }
}