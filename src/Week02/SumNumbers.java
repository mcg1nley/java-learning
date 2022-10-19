package Week02;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int sumTotal = 0;

        Scanner reader = new Scanner(System.in);

        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int x = 1;
        while (x <= sumTo) {
            sumTotal += x;
            x++;
        }
        System.out.print(sumTotal);

    }

}
