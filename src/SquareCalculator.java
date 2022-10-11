import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Declare dimensions
        Scanner reader = new Scanner(System.in);
        System.out.print("How wide in cm is your quadrilateral?: ");
        double width = Double.parseDouble(reader.nextLine());
        System.out.print("How high in cm is your quadrilateral?: ");
        double height = Double.parseDouble(reader.nextLine());
        System.out.println("Width: " + width + " Height: " + height);
        // Calculate perimeter //
        double perimeter = (width * 2) + (height * 2);
        System.out.println("Perimeter: " + perimeter);
        // Calculate area //
        double area = width * height;
        System.out.println("Area: " + area);

    }
}
