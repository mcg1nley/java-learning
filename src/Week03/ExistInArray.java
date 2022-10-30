
package Week03;

import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25, 30 };

        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int userNumber = Integer.parseInt(reader.nextLine());
        boolean inArray = false;

        for (int x : numbers) {
            if (userNumber == x) {
                System.out.println("Your number is in the array");
                inArray = true;
            }
        }
        if (inArray == false) {
            System.out.println("Your number is not in the array");
        }

    }

}
