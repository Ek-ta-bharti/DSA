public class LLDeleteAnywhere {
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

    public void DeleteFirst(int position){
            if(head == null){
                return;
            }
            Node temp = head;
            if(position  ==0){
                head = temp.next;
                return;
            }
            for(int i =0; temp!=null && i<position-1; i++){
                temp =temp.next;
            }
            if(temp ==null && temp.next == null){
                return;
            }
            temp.next = temp.next.next;
        }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("---> " + current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LLDeleteAnywhere list = new LLDeleteAnywhere();
        list.InsertAtFirst(2);
        list.InsertAtFirst(9);
        list.InsertAtFirst(10);
        list.InsertAtFirst(90);
        list.InsertAtFirst(19);
        list.InsertAtFirst(4);

        System.out.println("Before Deletion of node");
        list.display();
        System.out.println();

        list.DeleteFirst(4);
        System.out.println("After Deletion of node");
        list.display();
        System.out.println();
    }
}
