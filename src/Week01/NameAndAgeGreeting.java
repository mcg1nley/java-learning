package Week01;

import java.util.Scanner;

public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = reader.nextLine();

        // Reads a line from the users keyboard
        System.out.print("How old are you: ");
        int age = Integer.parseInt(reader.nextLine());
        String insult = "";
        if (age > 65) {
            insult = "really old";
        } else if (age > 40) {
            insult = "old";
        } else {
            insult = "young";
        }

        // Reads a string var from keyboard and transfers it to an integer
        System.out.println("Your name is: " + name + ", and you are " + age + " years old, wow you are " + insult);
        System.out.println("what is your favourite hobby?: ");
        String hobby = reader.nextLine();
        System.out.println("Cool I like " + hobby + " too");

    }

}
