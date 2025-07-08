package Stack_And_Queue;
import java.util.*;

public class Queue_through_Stack {
    Stack<Integer> enqueue = new Stack<>();
    Stack<Integer> dequeue = new Stack<>();

    public void offer(int element) {
        enqueue.push(element);
    }

    boolean isEmpty() {
        return enqueue.isEmpty() && dequeue.isEmpty();
    }

    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        if (dequeue.isEmpty()) {
            while (!enqueue.isEmpty()) {
                int x = enqueue.pop();
                dequeue.push(x);
            }
        }
        return dequeue.pop();
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        if (dequeue.isEmpty()) {
            while (!enqueue.isEmpty()) {
                int x = enqueue.pop();
                dequeue.push(x);
            }
        }
        return dequeue.peek();
    }

    public static void main(String[] args) {
        Queue_through_Stack queue = new Queue_through_Stack();

        // Enqueue elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Front element: " + queue.front()); // Output: 10

        System.out.println("Dequeued: " + queue.poll());   // Output: 10
        System.out.println("Dequeued: " + queue.poll());   // Output: 20

        queue.offer(40);
        System.out.println("Dequeued: " + queue.poll());   // Output: 30
        System.out.println("Dequeued: " + queue.poll());   // Output: 40

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}
