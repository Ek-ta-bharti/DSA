public class LinkedBeginning {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void LinkedEnd(int newData) {
        Node newNode = new Node(newData);
        while (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while(temp.next !=  null){
            
        }

    }

    public static void main(String[] args) {

    }
}
