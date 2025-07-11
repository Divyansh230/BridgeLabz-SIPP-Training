import java.util.Arrays;

public class EmployeeIdSorter {

    // Function to implement Insertion Sort
    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];          // The current element to be inserted
            int j = i - 1;

            // Move elements of ids[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;          // Insert the key in its correct position
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108};

        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));

        insertionSort(employeeIDs);

        System.out.println("Sorted Employee IDs (Ascending): " + Arrays.toString(employeeIDs));
    }
}
