package lamda_expression;

import java.util.Arrays;
import java.util.List;

// lambda với vòng lặp

public class LambdaExpession4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C++","C#","PHP","JavaScript","Java");
        list.forEach(item -> System.out.println(item));
        System.out.println("======================");
        list.forEach(System.out::println);
    }
}
