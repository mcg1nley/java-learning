package Week04;

import java.util.Scanner;

public class myCalculator {
    public static int add(int one, int two) {
        int sum = one + two;
        return sum;

    }

    public static int subtract(int one, int two) {
        int sum = one - two;
        return sum;

    }

    public static int multiply(int one, int two) {
        int sum = one * two;
        return sum;

    }

    public static int divide(int one, int two) {
        int sum = one / two;
        return sum;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Pick another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.print("Pick one of the following options \n1: Add\n2: Subtract\n3: Multiply\n4: Divide\n");
        int calculation = Integer.parseInt(reader.nextLine());
        if (calculation == 1)
            System.out.println(add(num1, num2));
        else if (calculation == 2)
            System.out.println(subtract(num1, num2));
        else if (calculation == 3)
            System.out.println(multiply(num1, num2));
        else if (calculation == 4)
            System.out.println(divide(num1, num2));
        else
            System.out.println("Not a valid option try again!");

    }

}
