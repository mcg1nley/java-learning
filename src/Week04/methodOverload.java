package Week04;

public class methodOverload {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double c = 7.5;
        double d = 3.4;

        // Uses maxMethod(int n1, int n2)
        int result1 = maxMethod(a, b);

        // Uses maxMethod(double n1, double n2)
        double result2 = maxMethod(c, d);

        System.out.println("Maximum Value = " + result1);
        System.out.println("Maximum Value = " + result2);
    }

    public static int maxMethod(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        return max;
    }

    public static double maxMethod(double n1, double n2) {
        double max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        return max;

    }
}
