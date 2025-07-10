import java.util.Arrays;

public class StudentMarksSorter {

    // Function to implement Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {88, 55, 76, 23, 90, 67};

        System.out.println("Original Marks: " + Arrays.toString(marks));

        bubbleSort(marks);

        System.out.println("Sorted Marks (Ascending): " + Arrays.toString(marks));
    }
}
