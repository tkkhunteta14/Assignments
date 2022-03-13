import java.util.HashSet;
import java.util.Set;

public class CollectionQ2 {
	 public static void main(String[] args){
	        Set<Integer> obj= new HashSet<>();
	        obj.add(1);
	        obj.add(13);
	        obj.add(24);
	        obj.add(45);
	        obj.add(3);
	        obj.add(15);
	        obj.add(7);
	        obj.add(13);
	        obj.add(10);
	        obj.add(9);
	        System.out.println(obj);
	        obj.add(15);
	        System.out.println(obj);

	    }
}
