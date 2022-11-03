package Week04;

import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {

        int randomOne[] = new int[10];
        int randomTwo[] = new int[10];
        for (int i = 0; i < randomOne.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(20) + 1;
            randomOne[i] = num;
            System.out.print(num + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < randomTwo.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(20) + 1;
            randomTwo[i] = num;
            System.out.print(num + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < randomOne.length; i++) {
            for (int j = 0; j < randomTwo.length; j++) {
                if (randomOne[i] == randomTwo[j]) {
                    System.out.println(randomOne[i] + " is duplicated in both arrays");

                }
            }
        }

    }

}
