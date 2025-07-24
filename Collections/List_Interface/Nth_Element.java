package List_Interface;
import java.util.*;

public class Nth_Element {

    static <T> T nth_fromLast(List<T> arr, int n) {
        if (arr == null || n <= 0 || n > arr.size()) {
            throw new IllegalArgumentException("Invalid value of n: " + n);
        }
        // Directly access the (size - n)th index
        return arr.get(arr.size() - n);
    }

    public static void main(String[] args) {
        List<Character> ls = Arrays.asList('A', 'B', 'C', 'D', 'E');

        System.out.println("2nd from last: " + nth_fromLast(ls, 2)); // Output: D
    }
}
