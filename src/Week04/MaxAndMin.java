package Week04;

import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        int random[] = new int[10];
        for (int i = 0; i < random.length; i++) {
            Random rand = new Random();
            int num = rand.nextInt(10) + 1;
            random[i] = num;
            System.out.println(num);
        }
        int min = random[0];
        int max = random[0];

        for (int j = 0; j < random.length; j++) {
            if (random[j] < min) {
                min = random[j];
            }
            if (random[j] > max) {
                max = random[j];
            }
        }
        System.out.println("Minimum:" + min);
        System.out.println("Maximum:" + max);

    }

}
