package Week03;

public class TestArray {
    public static void main(String[] args) {
        double sum = 0;

        double[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (double x : numbers) {
            sum += x;
        }
        System.out.println(sum);
        double average = sum / numbers.length;
        System.out.println(average);

    }

}
