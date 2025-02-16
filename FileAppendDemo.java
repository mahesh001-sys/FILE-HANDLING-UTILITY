import java.io.FileWriter;
import java.io.IOException;
public class FileAppendDemo {
    public static void main(String[] args) {
        String data="Studying in Anurag University.";
        try {
            FileWriter Output=new FileWriter("data1.txt",true);
            Output.write(data);
            System.out.println("Data Appended Successfully.");
            Output.close();
        } catch (IOException ex) {
            System.out.println("File Append Error....");
        }
    }
    
}
