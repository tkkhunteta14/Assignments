import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LambdaQ6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Karan", "Naman", "Tarun", "Akshat");
        LambdaQ6 lambdaQ6 = new LambdaQ6();
        System.out.println(lambdaQ6.convertToUpperCase(list));

    }
    public List<String> convertToUpperCase(List<String> list) {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());

        list.stream()
                .forEach(consumer);

        return  ToUpper;
    }
}