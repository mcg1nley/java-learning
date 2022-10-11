import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Get Number from User
        System.out.print("What times table would you like? :");
        int timesTable = Integer.parseInt(reader.nextLine());
        // Starting number variable
        int i;
        for (i = 1; i <= 12; i++) {
            // Do the Maths
            int sum = i * timesTable;
            // Print out results to user
            System.out.println(i + " * " + timesTable + " = " + sum);
        }

    }

}