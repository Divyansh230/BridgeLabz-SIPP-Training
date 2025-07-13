import java.util.Arrays;
import java.util.Random;

public class SearchPerfromanceComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 10_000, 1_000_000};
        int target = -1; // Target unlikely to exist

        System.out.printf("%-15s%-20s%-20s\n", "Dataset Size", "Linear Search (ms)", "Binary Search (ms)");
        System.out.println("------------------------------------------------------------");

        for (int size : sizes) {
            int[] dataset = generateRandomArray(size);

            // Measure Linear Search time
            long startLinear = System.nanoTime();
            linearSearch(dataset, target);
            long endLinear = System.nanoTime();
            double linearTime = (endLinear - startLinear) / 1_000_000.0;

            // Sort for Binary Search
            Arrays.sort(dataset);

            // Measure Binary Search time
            long startBinary = System.nanoTime();
            binarySearch(dataset, target);
            long endBinary = System.nanoTime();
            double binaryTime = (endBinary - startBinary) / 1_000_000.0;

            // Print results
            System.out.printf("%-15d%-20.5f%-20.5f\n", size, linearTime, binaryTime);
        }
    }

    // Generates random array of given size
    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10); // Random values
        }
        return arr;
    }

    // Linear Search (O(N))
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search (O(log N))
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
