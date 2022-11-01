package Week04;

public class checkAge {
    static void checkAge(int age) {
        // if age is less than 18 then print out "Access Denied"
        if (age < 18) {
            System.out.println("Access Denied");

            // if age is greater than or equal to 18 then print out "Access Granted"
        } else {
            System.out.println("Access granted");
        }

    }

    public static void main(String[] args) {
        checkAge(20);

    }

}
