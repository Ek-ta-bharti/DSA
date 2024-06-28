public class ReversalLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void InsertAtFirst(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
            Node temp = head;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        ReversalLL List = new ReversalLL();
    }

}
