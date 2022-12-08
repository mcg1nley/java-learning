package week06;

public class PetClass {
    private String animal;
    private String name;
    private boolean isHappy;
    private int mood;

    public PetClass(String animal, String name) {
        setAnimal(animal);
        setName(name);
        setMood(0);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String Animal) {
        this.animal = Animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public boolean getIsHappy() {
        if (mood > 5)
            isHappy = true;
        else
            isHappy = false;
        return isHappy;
    }

    public void setIsHappy(boolean IsHappy) {
        this.isHappy = IsHappy;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int Mood) {
        this.mood = Mood;
    }

    public void giveTreat() {
        mood++;
    }

    public void praise() {
        mood++;
    }

    public void tellOff() {
        mood--;
    }

    public void leaveHomeAlone() {
        mood--;
    }

}
