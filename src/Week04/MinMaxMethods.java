package Week04;

import java.util.Scanner;

public class MinMaxMethods {
    // Minimum Int Method
    public static int minimum(int x, int y, int z) {
        if (x < y && x < z)
            return x;
        else if (y < z)
            return y;
        else
            return z;
    };

    // Minimum Double Method
    public static double minimum(double x, double y, double z) {
        if (x < y && x < z)
            return x;
        else if (y < z)
            return y;
        else
            return z;
    };

    // Maximum Int Method
    public static int maximum(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (y > z)
            return y;
        else
            return z;
    };

    // Maximum Double Method
    public static double maximum(double x, double y, double z) {
        if (x > y && x > z)
            return x;
        else if (y > z)
            return y;
        else
            return z;

    };

    // Method for printing out int calculation
    public static void intCalculation(int num1) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.print("And a third: ");
        int num3 = Integer.parseInt(reader.nextLine());

        System.out.println("Minimum Number is: " + minimum(num1, num2, num3));
        System.out.println("Maximum Number is: " + maximum(num1, num2, num3));

    }

    // Method for printing out double calculation
    public static void doubleCalculation(double num1) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a second number: ");
        double num2 = Double.parseDouble(reader.nextLine());
        System.out.print("And a third: ");
        double num3 = Double.parseDouble(reader.nextLine());

        System.out.println("Minimum Number is: " + minimum(num1, num2, num3));
        System.out.println("Maximum Number is: " + maximum(num1, num2, num3));

    }

    // Ask user for number and work out if its an int or double
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Number 1
        System.out.print("Pick a number: ");
        if (reader.hasNextInt())
            intCalculation(reader.nextInt());
        else if (reader.hasNextDouble())
            doubleCalculation(reader.nextDouble());
    }
}
