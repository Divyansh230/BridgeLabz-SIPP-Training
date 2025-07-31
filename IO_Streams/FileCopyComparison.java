package IO_Streams;

import java.io.*;

public class FileCopyComparison {
    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void main(String[] args) {
        String sourcePath = "largefile.dat";         // Source file (change as needed)
        String unbufferedDestPath = "copy_unbuffered.dat"; // Destination for unbuffered copy
        String bufferedDestPath = "copy_buffered.dat";     // Destination for buffered copy

        try {
            // Unbuffered file copy
            long unbufferedTime = copyFileUnbuffered(sourcePath, unbufferedDestPath);
            System.out.println("Unbuffered Stream Time: " + unbufferedTime + " ns");

            // Buffered file copy
            long bufferedTime = copyFileBuffered(sourcePath, bufferedDestPath);
            System.out.println("Buffered Stream Time: " + bufferedTime + " ns");

            System.out.println("Faster Method: " + (bufferedTime < unbufferedTime ? "Buffered" : "Unbuffered"));
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }

    // Unbuffered copy method
    private static long copyFileUnbuffered(String source, String dest) throws IOException {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Buffered copy method
    private static long copyFileBuffered(String source, String dest) throws IOException {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
