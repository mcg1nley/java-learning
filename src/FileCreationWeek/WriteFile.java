package FileCreationWeek;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\potwa\\Desktop\\example.txt");
            myWriter.write("I am writing something in this file now");
            myWriter.close();
            System.out.println("Success. File has been written in");
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
            // TODO: handle exception
        }

    }

}
