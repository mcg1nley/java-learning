package week06;

public class ScrabbleTile {
    // This class determines the information for each square on a scrabble board
    private boolean empty;
    private String letter;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private int posX;
    private int posY;

    public ScrabbleTile(boolean empty, String letter, boolean up, boolean down, boolean left, boolean right, int posX,
            int posY) {
        setEmpty(empty);
        setLetter(letter);
        setUp(up);
        setDown(down);
        setLeft(left);
        setRight(right);
        setPosX(posX);
        setPosY(posY);
    }

    public boolean getEmpty() {
        return empty;
    }

    public void setEmpty(boolean Empty) {
        this.empty = Empty;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String Letter) {
        this.letter = Letter;
    }

    public boolean getUp() {
        return up;
    }

    public void setUp(boolean Up) {
        this.up = Up;
    }

    public boolean getDown() {
        return down;
    }

    public void setDown(boolean Down) {
        this.down = Down;
    }

    public boolean getLeft() {
        return left;
    }

    public void setLeft(boolean Left) {
        this.left = Left;
    }

    public boolean getRight() {
        return right;
    }

    public void setRight(boolean Right) {
        this.right = Right;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int PosX) {
        this.posX = PosX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int PosY) {
        this.posY = PosY;
    }

}
