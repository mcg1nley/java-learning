package Week05;

public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("Josh", 32, 200, 70);
        System.out.println(
                Person01.getName() + " " + Person01.getAge() + " " + Person01.getHeight() + " " + Person01.getWeight());
    }

}
