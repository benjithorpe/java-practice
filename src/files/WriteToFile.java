package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteToFile {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try (FileWriter fileWriter = new FileWriter(file);
                PrintWriter printWriter = new PrintWriter(fileWriter, true)) {

            printWriter.println("Hello world in a file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
