package FileCreationWeek;

import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\potwa\\Desktop\\Random.txt");

        var result = (!f.exists()) ? "does not" : "does";
        System.out.println("Your file " + result + " exist");

    }

}
