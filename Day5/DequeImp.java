import java.util.*;

public class DequeImp {
    public static void main(String[] args) {
        Deque<Integer> p = new ArrayDeque<>();
            System.out.println("Deque output look like: " +p);
            p.addFirst(5);
            p.addFirst(9);
            p.addFirst(15);
            p.addFirst(50);
            p.addFirst(8);
            p.addFirst(7);
            p.addFirst(90);
            p.addFirst(1);
            System.out.println("Deque output Add First: " +p);
            p.offerFirst(0);
            System.out.println("Deque output Add First: " +p);
            p.removeFirst();
            System.out.println("Deque output Remove First: " +p);
            p.pollFirst();
            System.out.println("Deque output Remove First: " +p);      
            System.out.println("First element: " + p.getFirst());
            System.out.println("First element (peek): " + p.peekFirst());
            System.out.println("Deque output look like: " + p);
            p.pollLast();
            System.out.println("Deque output Remove last: " + p);
            System.out.println("Deque output look like: " + p.offerLast(100));
            System.out.println("Last element (peek): " + p.peekLast());
            System.out.println("Deque output look like: " + p);

    }
}



// Summary of Deque methods
// First Element (Head)	                                              Last Element (Tail)
//                 Throws exception	Special value	                 Throws exception	Special value
// Insert	       addFirst(e)	offerFirst(e)	                     addLast(e)	offerLast(e)
// Remove	       removeFirst()	pollFirst()	                     removeLast()	pollLast()
// Examine	       getFirst()	peekFirst()	                         getLast()	peekLast()


// Comparison of Queue and Deque methods
// Queue Method	Equivalent Deque Method
// add(e)	addLast(e)
// offer(e)	offerLast(e)
// remove()	removeFirst()
// poll()	pollFirst()
// element()	getFirst()
// peek()	peekFirst()


// Comparison of Stack and Deque methods
// Stack Method	Equivalent Deque Method
// push(e)	addFirst(e)
// pop()	removeFirst()
// peek()	peekFirst()

