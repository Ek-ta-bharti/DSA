public class LinkedEnd {
    Node head;
    class Node{
        int data;
        Node next;
// Constructor to create a new node
        Node(int d){
            data=d;
            next =null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if(head== null){
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next =  newNode;
        return;
    }
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedEnd list = new LinkedEnd();
        list.insertAtEnd(2);
        list.insertAtEnd(9);
        list.insertAtEnd(7);

        System.out.println("Before insertion of 10");
        list.displayLL();
        System.out.println();

        list.insertAtEnd(79);
        System.out.println("After insertion of 10");
        list.displayLL();
        System.out.println();
    }
}
