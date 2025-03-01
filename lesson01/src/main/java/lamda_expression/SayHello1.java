package lamda_expression;
// Lambda không tham số

@FunctionalInterface
 interface SayHello1 {
    void sayHello1();
}

class LambdaExpression1{
    public static void main(String[] args) {
        SayHello1 sayHello = () -> {
            System.out.println("Hello Word");
        };
        sayHello.sayHello1();
    }
}