package collection_api_enhencements;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        List<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("Python");
        language.add("NetCore API");
        language.add("C++");
        language.add("JavaScript");
        language.add("C#");

        System.out.println("Sử dụng biểu thức Lambda: ");
        language.forEach(lang -> System.out.println(lang));

        System.out.println("Sử dụng method references: ");
        language.forEach(System.out::println);
    }
}
