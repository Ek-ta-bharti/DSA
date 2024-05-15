import java.util.*;

public class QueueStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enQueue(int data) {
        s1.push(data);
    }

    static int dnQueue() {
        int ele;
        if (s1.empty() && s2.empty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                ele = s1.pop();
                s2.push(ele);
            }
        }
        ele = s2.pop();
        return ele;
    }

    public static void main(String[] args) {
        QueueStack E = new QueueStack();

        E.enQueue(1);
        E.enQueue(2);
        E.enQueue(3);
        E.enQueue(4);
        E.enQueue(5);
        E.enQueue(6);
        E.enQueue(7);
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
        System.out.println(E.dnQueue());
    }
}
