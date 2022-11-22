package week06;

public class CircleTest {
    public static void main(String[] args) {
        CircleClass Circle01 = new CircleClass(1.0, "red");
        System.out.println("Circle 01 has a radius of " + "" + Circle01.getRadius() + " " + "and is" + " "
                + Circle01.getColour() + " " + "and has a total radius of" + " " + Circle01.getArea());
        CircleClass Circle02 = new CircleClass(5.0, "green");
        System.out.println("Circle 02 has a radius of " + "" + Circle02.getRadius() + " " + "and is" + " "
                + Circle02.getColour() + " " + "and has a total radius of" + " " + Circle02.getArea());
        CircleClass Circle03 = new CircleClass(2.5, "blueish");
        System.out.println("Circle 03 has a radius of " + "" + Circle03.getRadius() + " " + "and is" + " "
                + Circle03.getColour() + " " + "and has a total radius of" + " " + Circle03.getArea());
    }

}
