import java.util.Arrays;

public class SalaryDemandSorter {

    // Function to implement Heap Sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root (max) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // left child index
        int right = 2 * i + 2;    // right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {55000, 42000, 80000, 30000, 65000};

        System.out.println("Original Salary Demands: " + Arrays.toString(salaryDemands));

        heapSort(salaryDemands);

        System.out.println("Sorted Salary Demands (Ascending): " + Arrays.toString(salaryDemands));
    }
}
