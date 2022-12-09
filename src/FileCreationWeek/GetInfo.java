package FileCreationWeek;

import java.io.File;

public class GetInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\potwa\\Desktop\\example.txt");

        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
        } else {
            System.out.println("File Not Found");
        }
    }

}
