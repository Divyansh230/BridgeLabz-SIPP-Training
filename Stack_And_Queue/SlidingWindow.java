package Stack_And_Queue;
import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array
        System.out.print("Enter the elements of the array separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Read the window size k
        System.out.print("Enter the window size k: ");
        int k = scanner.nextInt();

        // Compute the sliding window maximums
        SlidingWindow SlidingWindow = new SlidingWindow();
        int[] result = SlidingWindow.maxSlidingWindow(nums, k);

        // Display the result
        System.out.print("The maximum elements in each sliding window are: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices of elements smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index to the deque
            deque.offerLast(i);

            // The front of the deque is the maximum for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
