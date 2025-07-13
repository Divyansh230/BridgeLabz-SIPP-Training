public class FibonacciiComparison {

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50}; // Try small and large values

        System.out.printf("%-12s%-20s%-20s\n", "Fibonacci(N)", "Recursive (ms)", "Iterative (ms)");
        System.out.println("--------------------------------------------------------");

        for (int n : testValues) {
            // Recursive (may timeout or crash for high n)
            double recursiveTime = -1;
            try {
                long startRec = System.nanoTime();
                int resultRec = fibonacciRecursive(n);
                long endRec = System.nanoTime();
                recursiveTime = (endRec - startRec) / 1_000_000.0;
            } catch (StackOverflowError e) {
                System.out.println("Recursive failed for n = " + n);
            }

            // Iterative
            long startIt = System.nanoTime();
            int resultIt = fibonacciIterative(n);
            long endIt = System.nanoTime();
            double iterativeTime = (endIt - startIt) / 1_000_000.0;

            System.out.printf("%-12d%-20s%-20.5f\n",
                    n,
                    recursiveTime == -1 ? "Unfeasible" : String.format("%.5f", recursiveTime),
                    iterativeTime);
        }
    }

    // Naive Recursive (Exponential Time: O(2^N))
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative (Linear Time: O(N))
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
