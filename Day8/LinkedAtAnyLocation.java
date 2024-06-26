public class LinkedAtAnyLocation {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // public void InsertAtFirst(int newData) {
    // Node newNode = new Node(newData);
    // while (head == null) {
    // head = new Node(newData);
    // return;
    // }
    // newNode.next = null;
    // Node temp = head;
    // while(temp.next != null){
    // temp = temp.next;
    // }
    // temp.next = newNode;
    // return;
    // }
    // public void InsertAtFirst(int newData) {
    // Node newNode = new Node(newData);
    // newNode.next = head;
    // head = newNode;
    // }

    public void InsertAtAnyWhere(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("The previous node cannot contain null value");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("---> " + current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedAtAnyLocation list = new LinkedAtAnyLocation();
        list.InsertAtAnyWhere(2);
        list.InsertAtAnyWhere(9);
        list.InsertAtAnyWhere(10);

        System.out.println("Before insertion of 10");
        list.display();
        System.out.println();

        list.InsertAtAnyWhere(list.head.next.next, 79);
        System.out.println("After insertion of 10");
        list.display();
        System.out.println();
    }
}
