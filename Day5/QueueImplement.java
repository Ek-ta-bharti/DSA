import java.util.*;

public class QueueImplement {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        System.out.println("Queue Value: " + q);
        System.out.println("Queue Size: " + q.size());
        q.remove();
        q.remove();
        q.remove();
        System.out.println("Queue after remove: " + q);
        System.out.println("Queue New Size: " + q.size());
        System.out.println("Queue Value: " + q.peek());
    }

}


// Summary of Queue methods
// Throws exception	Returns special value
// Insert	add(e)	offer(e)
// Remove	remove()	poll()
// Examine	element()	peek()
