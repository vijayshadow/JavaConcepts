package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\testout.txt", true));
            writer.append("\nThis is appended text.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
