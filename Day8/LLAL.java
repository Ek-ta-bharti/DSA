class LLAL{
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
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void InsertAnyLocation(Node pre, int newData) {
        if (pre == null) {
            System.out.println("Please provide valid data");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    public void Display() {
        Node curr = head;
        while (curr != null) {
            System.out.print("---> " + curr.data);
            curr = curr.next;
        }
    }

    public Node getNodeAtPosition(int position) {
        Node current = head;
        int count = 0;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        return current;
    }

    public static void main(String[] args) {
        LLAL hn = new LLAL();
        hn.InsertAtFirst(4);
        hn.InsertAtFirst(42);
        hn.InsertAtFirst(8);
        hn.InsertAtFirst(2);
        hn.Display();
        System.out.println();
        
        Node nodeAtPosition = hn.getNodeAtPosition(2);
        hn.InsertAnyLocation(nodeAtPosition, 22);
        hn.Display();
    }
}
