import java.util.*;

public class SearchStructureComparison {

    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};
        int target = -1; // unlikely to exist (worst case search)

        System.out.printf("%-15s%-20s%-20s%-20s\n", "Dataset Size", "Array Search (ms)", "HashSet Search (ms)", "TreeSet Search (ms)");
        System.out.println("-------------------------------------------------------------------------");

        for (int size : sizes) {
            // Generate dataset
            int[] dataArray = generateRandomArray(size);

            // Array Search
            long startArray = System.nanoTime();
            boolean foundInArray = linearSearch(dataArray, target);
            long endArray = System.nanoTime();
            double timeArray = (endArray - startArray) / 1_000_000.0;

            // HashSet Search
            HashSet<Integer> hashSet = new HashSet<>();
            for (int val : dataArray) hashSet.add(val);

            long startHash = System.nanoTime();
            boolean foundInHashSet = hashSet.contains(target);
            long endHash = System.nanoTime();
            double timeHash = (endHash - startHash) / 1_000_000.0;

            // TreeSet Search
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int val : dataArray) treeSet.add(val);

            long startTree = System.nanoTime();
            boolean foundInTreeSet = treeSet.contains(target);
            long endTree = System.nanoTime();
            double timeTree = (endTree - startTree) / 1_000_000.0;

            System.out.printf("%-15d%-20.4f%-20.4f%-20.4f\n", size, timeArray, timeHash, timeTree);
        }
    }

    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(size * 10);
        return arr;
    }

    static boolean linearSearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) return true;
        }
        return false;
    }
}
