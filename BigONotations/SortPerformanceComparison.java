import java.util.Arrays;
import java.util.Random;

public class SortPerformanceComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 10_000, 100_000}; // Bubble sort skipped for 1 million due to time

        System.out.printf("%-15s%-20s%-20s%-20s\n", "Dataset Size", "Bubble Sort (ms)", "Merge Sort (ms)", "Quick Sort (ms)");
        System.out.println("----------------------------------------------------------------------");

        for (int size : sizes) {
            int[] original = generateRandomArray(size);

            // Bubble Sort
            double bubbleTime = -1;
            if (size <= 10000) { // Avoid very large sizes
                int[] bubbleArr = Arrays.copyOf(original, original.length);
                long start = System.nanoTime();
                bubbleSort(bubbleArr);
                long end = System.nanoTime();
                bubbleTime = (end - start) / 1_000_000.0;
            }

            // Merge Sort
            int[] mergeArr = Arrays.copyOf(original, original.length);
            long startMerge = System.nanoTime();
            mergeSort(mergeArr, 0, mergeArr.length - 1);
            long endMerge = System.nanoTime();
            double mergeTime = (endMerge - startMerge) / 1_000_000.0;

            // Quick Sort
            int[] quickArr = Arrays.copyOf(original, original.length);
            long startQuick = System.nanoTime();
            quickSort(quickArr, 0, quickArr.length - 1);
            long endQuick = System.nanoTime();
            double quickTime = (endQuick - startQuick) / 1_000_000.0;

            // Output results
            System.out.printf("%-15d%-20s%-20.2f%-20.2f\n",
                    size,
                    bubbleTime == -1 ? "Skipped" : String.format("%.2f", bubbleTime),
                    mergeTime,
                    quickTime);
        }
    }

    // Generate random array
    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(size * 10);
        return arr;
    }

    // Bubble Sort (O(N²))
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization
        }
    }

    // Merge Sort (O(N log N))
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];
    }

    // Quick Sort (O(N log N))
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
