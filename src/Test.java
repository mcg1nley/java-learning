import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int squareRoot = sumTo * sumTo;

        System.out.print(squareRoot);

    }

}