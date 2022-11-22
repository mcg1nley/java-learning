package week06;

public class CircleClass {
    private double radius;
    private String colour;
    private double area;

    public CircleClass(double radius, String colour) {
        setRadius(radius);
        setColour(colour);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String Colour) {
        this.colour = Colour;
    }

    public double getArea() {
        area = 3.14f * radius;
        return area;
    }

    public void setArea(double Area) {
        this.area = Area;
    }

}
