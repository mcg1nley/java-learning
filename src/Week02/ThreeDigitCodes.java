package Week02;

public class ThreeDigitCodes {
    public static void main(String[] args) {
        int combinations = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Statements
                    if (i != j) {
                        if (j != k) {
                            if (i != k) {
                                System.out.println(i + "" + j + "" + k);
                                combinations++;

                            }

                        }
                    }

                }
            }
        }
        System.out.println("Total combinations: " + combinations);
    }

}
