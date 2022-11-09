
package Week04;

public class FibonacciCalc {
    public static long Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }

    public static void main(String[] args) {
        int max = 10;
        System.out.print("Fibonacci Series of " + max + " numbers: ");
        for (int i = 0; i < max; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

    }

}
