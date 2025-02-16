import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {
        String fileName = "example.txt";
        writeToFile(fileName, "Hi How are you?.\n");
        writeToFile(fileName, "his that everything fine ahh?.\n");
        System.out.println("Contents of the file:");
        readFromFile(fileName);
        appendToFile(fileName, "I'm going to chennai.\n");
        System.out.println("\nContents of the file after modification:");
        readFromFile(fileName);
    }
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    public static void appendToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
