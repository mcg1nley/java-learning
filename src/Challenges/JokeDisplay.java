package Challenges;

import java.util.Scanner;

public class JokeDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String enterkey = "Why do fathers take an extra pair of socks when they go golfing?";
        System.out.print(enterkey);

        enterkey = input.nextLine();
        System.out.print(enterkey);

        if (enterkey.equals("")) {

            System.out.println("In case they get a hole in one!");
        }

    }

}
