import java.util.*;

public class QueueStack1 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enQueue(int[] arr) {
        for (int num : arr) {
            s1.push(num);
            System.out.println(" s1 Element: " + num);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
    }

    public int deQueue() {
        if (s1.empty() && s2.empty()) {
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                int ele = s1.pop();
                s2.push(ele);
                System.out.println(" s2 Element : " + ele);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        }
        return s2.pop();
    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 8, 9, 18, 30 };
        System.out.println("Real Array Size: " + arr.length + " " + Arrays.toString(arr));
        QueueStack1 queue = new QueueStack1();
    
        System.out.println("Enqueued Values:");
        queue.enQueue(arr);
    
        System.out.println("Dequeued Values:");
        int size = arr.length; 
    
        List<Integer> dequeuedValues = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int value = queue.deQueue();
            dequeuedValues.add(value);
        }
        
        System.out.println("Final Result: " + dequeuedValues); 
    }
}    
