import java.util.Arrays;

public class ExamScoreSorter {

    // Function to implement Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current i is the index of the minimum
            int minIndex = i;

            // Find the minimum in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {72, 88, 95, 60, 83, 77};

        System.out.println("Original Exam Scores: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("Sorted Exam Scores (Ascending): " + Arrays.toString(examScores));
    }
}
