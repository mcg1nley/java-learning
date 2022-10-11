import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Get Number from User
        System.out.print("What times table would you like? :");
        // int timesTable = reader.nextInt();
        int timesTable = Integer.parseInt(reader.nextLine());
        // Get a number to go up to from user
        System.out.print("How high would you like to go? :");
        // int howHigh = reader.nextInt();
        int howHigh = Integer.parseInt(reader.nextLine());
        // Starting number variable
        int i;
        for (i = 1; i <= howHigh; i++) {
            // Do the Maths
            int sum = i * timesTable;
            // Print out results to user
            System.out.println(i + " * " + timesTable + " = " + sum);
        }

    }

}
