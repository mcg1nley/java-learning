package FileCreationWeek;

import java.io.File;
import java.io.IOException; // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\potwa\\Desktop\\Random02.txt");

            if (f.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File could not be created");
            }

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }

    }

}
