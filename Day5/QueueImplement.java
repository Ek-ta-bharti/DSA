import java.util.*;

public class QueueImplement {
    
        public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i); // Add each integer i to the queue
        }
        System.out.println("Queue Value: " + q); // Print the contents of the queue
    }
    
}
