package default_method;

public class MultiInheristance implements Shape, Interface1, Interface2 {

    @Override
    public void draw() {
        System.out.println("MultiInheritance");
    }
    @Override
    public void setColor(String color) {
        Shape.super.setColor(color);
        System.out.println("MultiInheritance setColor");
    }

    @Override
    public void method1() {
        Interface1.super.method1();
    }

    @Override
    public void method2() {
        System.out.println("MultiInheritance.method2");
    }

    public static void main(String[] args) {
        MultiInheristance mi = new MultiInheristance();
        mi.draw();
        mi.setColor("red");
        mi.setColor("blue");
        mi.method1();
        mi.method2();
    }
}
