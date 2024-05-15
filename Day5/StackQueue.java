import java.util.*;

public class StackQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void add(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(data);
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    static int remove() {
        while (q1.isEmpty()) {
            System.out.println("Queue is overflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        StackQueue n = new StackQueue();
        System.out.println("add element from the stack is " + n.add(40));
        n.add(4);
        n.add(2);
        n.add(5);
        n.add(9);
        System.out.println("Delete element from the stack is " + n.remove());
        n.add(23);
        n.add(50);
        System.out.println("Delete element from the stack is " + n.remove());
        System.out.println("Delete element from the stack is " + n.remove());
        System.out.println("Delete element from the stack is " + n.remove());
    }
}
