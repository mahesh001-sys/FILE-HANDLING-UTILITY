import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo {
    public static void main(String[] args) {
        String data="1> B Mahesh Kumar from Hyderabad,Telangana,India.";
        try {
            FileWriter Output=new FileWriter("data1.txt");
            Output.write(data);
            System.out.println("data is written successfully");
            Output.close();
        } catch (Exception e) {
            System.out.println("File Witten error....");
        }
    }
    
}
