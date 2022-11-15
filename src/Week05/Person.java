package Week05;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double Height) {
        this.height = Height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double Weight) {
        this.weight = Weight;
    }

}
