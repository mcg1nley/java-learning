
package Week03;

import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25, 30 };

        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = Integer.parseInt(reader.nextLine());

        for (int x : numbers) {
            if (number == x) {
                System.out.println("In Array");
            } else {
                System.out.println("Not In Array");
            }

        }

    }

}
