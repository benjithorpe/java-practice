package files;

import java.io.File;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileWriter fw = new FileWriter(file);) {
            fw.write("Hello world in a file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
