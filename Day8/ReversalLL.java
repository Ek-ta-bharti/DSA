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
        newNode.next =head;
        head = newNode;
    }

    public void Reverse(){
        Node temp = head;
        Node prev = null;
        Node nextptr = null;
        while(temp != null){
           nextptr = temp.next;
           temp.next = prev;
           prev = temp;
           temp = nextptr;
        }
        head =prev;
    }

    public void Display(){
        Node curr = head;
        while(curr != null){
            System.out.print(" --> " +curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        ReversalLL List = new ReversalLL();
        List.InsertAtFirst(9);
        List.InsertAtFirst(6);
        List.InsertAtFirst(5);
        List.InsertAtFirst(12);
        List.InsertAtFirst(1);
        List.Display();
        System.out.println();
        List.Reverse();
        List.Display();
        System.out.println();
    }

}
