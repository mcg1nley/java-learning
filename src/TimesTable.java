import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Get Number from User
        System.out.print("What times table would you like? :");
        // int timesTable = reader.nextInt();
        int timesTable = Integer.parseInt(reader.nextLine());
        // Starting number variable
        int i;
        for (i = 0; i <= 12; i++) {
            // Print out results to user
            System.out.println(i + " * " + timesTable + " = " + (i * timesTable));
        }

    }

}
