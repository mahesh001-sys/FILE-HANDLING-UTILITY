import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String args[]) {
        File myFile = new File("data1.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException ex) {
            System.out.println("File Error......");
            ex.printStackTrace(); 
        }
    }
}
