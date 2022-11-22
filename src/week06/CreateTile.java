package week06;

public class CreateTile {
    public static void main(String[] args) {
        ScrabbleTile Tile01 = new ScrabbleTile(false, "A", false, false, false, false, 0, 1);
        System.out.println("The first tile has the letter" + " " + Tile01.getLetter() + " " + "in it, and it is in the"
                + " " + Tile01.getPosX() + " " + "position in the x axis, and is in the" + " " + Tile01.getPosY() + " "
                + "position on the Y axis");
    }

}
