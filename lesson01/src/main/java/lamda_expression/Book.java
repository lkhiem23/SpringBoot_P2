package lamda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
    int id;
    String name;
    float price;

    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

class LambdaExpression5{
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "JavaScript", 9.9f));
        books.add(new Book(2, "Java", 1.9f));
        books.add(new Book(3, "PHP", 22.9f));
        books.add(new Book(4, "C#", 15.9f));
        books.add(new Book(5, "NetCore API", 10.9f));


        // Lọc sách có giá lớn hơn 15.000

        Stream<Book> filter = books.stream().filter(b->b.price>15);

        filter.forEach(System.out::println);
    }
}
