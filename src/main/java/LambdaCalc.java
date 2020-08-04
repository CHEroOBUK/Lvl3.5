public class LambdaCalc {
    public static void main(String[] args) {
        Operations sum = (a, b) -> a + b;
        Operations sub = (a, b) -> a - b;
        Operations mul = (a, b) -> a * b;
        Operations div = (a, b) -> (double) a / b;
        int a = 5;
        int b = 10;
        System.out.println(a + " + " + b + " = " + sum.calculate(a, b));
        System.out.println(a + " - " + b + " = " + sub.calculate(a, b));
        System.out.println(a + " * " + b + " = " + mul.calculate(a, b));
        System.out.println(a + " / " + b + " = " + div.calculate(a, b));
    }
}

interface Operations {
    double calculate (int a, int b);
}
