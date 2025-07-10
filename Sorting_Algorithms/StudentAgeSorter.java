import java.util.Arrays;

public class StudentAgeSorter {

    // Function to implement Counting Sort for ages between 10 and 18
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];       // Count array
        int[] output = new int[ages.length]; // Output array

        // Step 1: Store the frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output array (traverse original array in reverse for stability)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy output to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {15, 12, 10, 18, 14, 13, 12, 11, 17, 16};

        System.out.println("Original Student Ages: " + Arrays.toString(studentAges));

        countingSort(studentAges);

        System.out.println("Sorted Student Ages (Ascending): " + Arrays.toString(studentAges));
    }
}
