import java.util.HashSet;
import java.util.Set;

public class Assignment5Q2 {

	public static void main(String[] args) {
		  Set<Integer> obj= new HashSet<>();
	        obj.add(1);
	        obj.add(2);
	        obj.add(3);
	        obj.add(4);
	        obj.add(3);
	        obj.add(6);
	        obj.add(7);
	        obj.add(8);
	        obj.add(6);
	        obj.add(9);
	        System.out.println(obj);
	        obj.add(8);
	        System.out.println(obj);

	}

}
