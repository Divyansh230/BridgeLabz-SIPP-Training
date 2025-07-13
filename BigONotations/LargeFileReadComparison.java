import java.io.*;
import java.nio.charset.StandardCharsets;

public class LargeFileReadComparison {

    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Update this to point to a real large file

        // Test FileReader
        long startFR = System.nanoTime();
        int lineCountFR = readUsingFileReader(filePath);
        long endFR = System.nanoTime();
        double timeFR = (endFR - startFR) / 1_000_000.0;

        // Test InputStreamReader
        long startISR = System.nanoTime();
        int lineCountISR = readUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();
        double timeISR = (endISR - startISR) / 1_000_000.0;

        System.out.println("FileReader Time: " + timeFR + " ms | Lines Read: " + lineCountFR);
        System.out.println("InputStreamReader Time: " + timeISR + " ms | Lines Read: " + lineCountISR);
    }

    // Reads using FileReader (Character Stream)
    public static int readUsingFileReader(String filePath) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.err.println("FileReader error: " + e.getMessage());
        }
        return count;
    }

    // Reads using InputStreamReader (Byte Stream + Decoding)
    public static int readUsingInputStreamReader(String filePath) {
        int count = 0;
        try (
                FileInputStream fis = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr)
        ) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.err.println("InputStreamReader error: " + e.getMessage());
        }
        return count;
    }
}
