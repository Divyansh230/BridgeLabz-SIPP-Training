public class StringConcatenationBenchmark {

    public static void main(String[] args) {
        int N = 1_000_000; // Number of concatenations
        String text = "hello";

        // 1. Using String (Immutable - O(N^2))
        long startString = System.nanoTime();
        String resultStr = "";
        for (int i = 0; i < N; i++) {
            resultStr += text; // Avoid in practice
        }
        long endString = System.nanoTime();
        System.out.println("Time taken using String: " + (endString - startString) / 1_000_000 + " ms");

        // 2. Using StringBuilder (Mutable - O(N))
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(text);
        }
        long endSB = System.nanoTime();
        System.out.println("Time taken using StringBuilder: " + (endSB - startSB) / 1_000_000 + " ms");

        // 3. Using StringBuffer (Thread-safe - O(N))
        long startSBF = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append(text);
        }
        long endSBF = System.nanoTime();
        System.out.println("Time taken using StringBuffer: " + (endSBF - startSBF) / 1_000_000 + " ms");
    }
}
