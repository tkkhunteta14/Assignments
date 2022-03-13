import java.util.TreeMap;

public class CollectionQ1 {
	public static void main(String[] args){
        TreeMap<Long,String> trees = new TreeMap<>();
        trees.put((long)936541238, "tarun");
        trees.put((long)936541668, "Akshat");
        trees.put((long)982541238, "Karan");
        trees.put((long)995841238, "Varun");
        System.out.println(trees.keySet());
        System.out.println(trees.values());
        System.out.println(trees);



    }
}
