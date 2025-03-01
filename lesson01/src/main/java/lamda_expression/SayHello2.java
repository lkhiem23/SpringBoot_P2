package lamda_expression;

@FunctionalInterface
 interface SayHello2 {
     public void sayHello(String name);
}
class LambdaExpression2{
    // lambda sử dụng 1 tham số
    public static void main(String[] args) {
        SayHello2 say1 = name -> {
            System.out.println("Hello " + name);
        };
        say1.sayHello("Khiem");

        // Ngắn gọn
        SayHello2 say2 = name -> System.out.println("Hello " + name);
        say2.sayHello("Le Hoai");
    }

}
