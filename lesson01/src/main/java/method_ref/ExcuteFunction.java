package method_ref;

import java.util.Arrays;

@FunctionalInterface
interface ExcuteFunction {
    public int excute(int a, int b);
}

class MathUltis{
    public MathUltis() {
    }

    public MathUltis(String str){
        System.out.println("MathUtils: "+str);

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
}

class DemoMethodRef{
    public static void main(String[] args) {
        int a = 20;
        int b = 15;

        // int sum = MathUltis.sum(a, b);
        int sum = doAction(a,b, MathUltis::sum);
        System.out.println(a + "+" + b + "=" + sum);

        int minus = MathUltis.minus(a, b);
        System.out.println(a + "-" + b + "=" + minus);

        // Tham chiếu đến một instance method của một đối tượng cụ thể

        MathUltis mathUltis = new MathUltis();
        int multiply = mathUltis.multiply(a, b);
        System.out.println(a + "*" + b + "=" + multiply);

        // Tham chiếu đến một instance method của một đối tượng tùy ý của một kiểu cụ thể

        String[] stringArrays = {"JavaScript" , "C#" ,"Python","PHP", "NetCore API" };
        Arrays.sort(stringArrays, String::compareToIgnoreCase);
        for(String str : stringArrays){
            System.out.println(str);
        }
    }
    public static int doAction(int a, int b, ExcuteFunction func){
        return func.excute(a,b);
    }
}