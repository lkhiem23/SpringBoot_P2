package lamda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sử dụng Collection với Lambda

public class SortLambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("JavaScript");
        list.add("PHP");
        list.add("Java");
        list.add("Springboot");
        list.add("C++");

        // Sử dụng Lambda sắp xếp
        Collections.sort(list,(String str1, String str2 ) -> str1.compareTo(str2));

        // Xuất
        for(String str : list) {
            System.out.println(str);
        }


    }
}
