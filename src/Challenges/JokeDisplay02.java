package Challenges;

import java.util.Date;
import java.util.Scanner;

public class JokeDisplay02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create an Array of Jokes
        // Create an Array of Answers

        // Variables for timer
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0L;

        System.out.println("Want to hear a joke?");
        // Put an if statement hear looking for a user response, If Yes then continue.
        // Else exit;

        // Create a loop that goes through each question and answer

        // Question Before the while loop
        while (elapsedTime < 5000) {
            elapsedTime = (new Date()).getTime() - startTime;
        }
        // Answer after while loop
        System.out.println("A pan-duh!");
        System.out.println("Want to hear another one?");
        // End of for loop and all of the questions
        System.out.println("Probably not! Thanks for listening to my bad jokes though.");

    }

}
