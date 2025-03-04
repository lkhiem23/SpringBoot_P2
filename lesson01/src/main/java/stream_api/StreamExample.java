package stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    List<Integer> integerList = new ArrayList<Integer>();

    //  Đếm các số chẵn
    // Không dùng stream

    public void withoutStream(){
        int count = 0;
        for(Integer integer : integerList){
            if(integer %2 == 0){
                count ++;
            }
            System.out.println("WithoutStream -> Số phần tử chẵn: " + count);
        }
    }

    // Dùng stream
    public void withStream(){
        long count = integerList.stream().filter(integer -> integer % 2 == 0).count();
        System.out.println("WithStream -> Số phần tử chẵn: " + count);
    }

    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        streamExample.withStream();
    }
}
