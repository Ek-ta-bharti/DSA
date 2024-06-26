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

    // public void InsertAtFirst(int newData) {
    //     Node newNode = new Node(newData);
    //     while (head == null) {
    //         head = new Node(newData);
    //         return;
    //     }
    //     newNode.next = null;
    //     Node temp = head;
    //     while(temp.next !=  null){
    //          temp = temp.next;
    //     }
    //     temp.next = newNode;
    //     return;
    // }
    public void InsertAtFirst( int newData){
     Node newNode = new Node(newData);
     newNode.next =head;
     head = newNode;
    }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print("---> "  +current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedBeginning  list = new LinkedBeginning ();
        list.InsertAtFirst(2);
        list.InsertAtFirst(9);
        list.InsertAtFirst(10);

        System.out.println("Before insertion of 10");
        list.display();
        System.out.println();

        list.InsertAtFirst(79);
        System.out.println("After insertion of 10");
        list.display();
        System.out.println();
    }
    }

