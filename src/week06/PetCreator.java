package week06;

public class PetCreator {
    public static void main(String[] args) {
        PetClass Pet01 = new PetClass("Dog", "Archer");
        System.out.println("Your" + " " + Pet01.getAnimal() + " " + "is called" + " " + Pet01.getName());
        System.out.println(Pet01.getMood());
        System.out.println(Pet01.getIsHappy());
        Pet01.giveTreat();
        System.out.println(Pet01.getMood());
        Pet01.giveTreat();
        System.out.println(Pet01.getMood());
        Pet01.praise();
        System.out.println(Pet01.getMood());
        Pet01.giveTreat();
        System.out.println(Pet01.getMood());
        Pet01.giveTreat();
        System.out.println(Pet01.getMood());
        Pet01.giveTreat();
        System.out.println(Pet01.getMood());
        System.out.println(Pet01.getIsHappy());

    }

}
