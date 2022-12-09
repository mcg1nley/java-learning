package FileCreationWeek;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\potwa\\Desktop\\Random03.txt");
        if (f.delete()) {
            // f.delete();
            System.out.println("File " + f.getName() + " deleted");
        } else {
            System.out.println("File not found");
        }
    }

}
