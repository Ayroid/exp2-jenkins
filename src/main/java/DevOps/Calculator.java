package DevOps;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(1, 2));
        System.out.println(myCalc.subtract(9, 2));
        System.out.println(myCalc.multiply(6, 2));
        System.out.println(myCalc.divide(8, 2));
    }
}
