package Stack_And_Queue;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>ans=calculateSpan(arr);
        System.out.println(ans);
    }
   static public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 1));
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int a = st.pop();
                ans.set(a, a - i);  // distance between current and the next greater element
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int p = st.pop();  // changed peek() to pop() to avoid infinite loop
            ans.set(p, p + 1); // no greater element found to the left
        }

        return ans;
    }
}
