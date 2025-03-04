package collection_api_enhencements;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "PHP");
        map.put(3, "JavaScript");
        map.put(4, "C#");
        map.put(5, "Python");
        map.put(6, "NetCore API");

        // Hiển thị dữ liệu
        map.forEach((key, value) -> System.out.println(key + " - " + value) );
    }
}
