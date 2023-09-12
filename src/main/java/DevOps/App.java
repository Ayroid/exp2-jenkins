package DevOps;

public class App {
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

    public int power(int a, int b) {
        int answer = 1;
        for (int i = 0; i < b; i++)
            answer *= a;
        return answer;
    }

    public static void main(String[] args) {
        App myCalc = new App();
        System.out.println(myCalc.add(1, 2));
        System.out.println(myCalc.subtract(1, 2));
        System.out.println(myCalc.multiply(1, 2));
        System.out.println(myCalc.divide(1, 2));
        System.out.println(myCalc.power(1, 2));
    }
}