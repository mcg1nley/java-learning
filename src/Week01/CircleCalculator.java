package Week01;

class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = circleRadius * 2;
        double circleCircumfrence = circleDiameter * 3.14;
        double circleArea = (circleRadius * circleRadius) * 3.14;

        System.out.println("Radius: " + circleRadius);
        System.out.println("Diameter: " + circleDiameter);
        System.out.println("Circumfrence: " + circleCircumfrence);
        System.out.println("Area: " + circleArea);

    }

}
