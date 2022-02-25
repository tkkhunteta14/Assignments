import java.util.TreeMap;

public class Assignment5Q1 {

	public static void main(String[] args) {
        TreeMap<Long,String> trees = new TreeMap<>();
        trees.put((long)946103045, "Tarun");
        trees.put((long)946103022, "Akshat");
        trees.put((long)946103099, "Annu");
        trees.put((long)946103077, "Atharva");
        System.out.println(trees.keySet());
        System.out.println(trees.values());
        System.out.println(trees);

	}

}
