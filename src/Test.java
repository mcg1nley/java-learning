import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner readinput = new Scanner(System.in);

        String enterkey = "Why do fathers take an extra pair of socks when they go golfing?";
        System.out.print(enterkey);

        enterkey = readinput.nextLine();
        System.out.print(enterkey);

        if (enterkey.equals("")) {

            System.out.println("In case they get a hole in one!");
        }

    }

}