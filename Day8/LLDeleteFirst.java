public class LLDeleteFirst {
        Node head;
    
        class Node {
            int data;
            Node next;
    
            Node(int d) {
                data = d;
                next = null;
            }
        }
    
        public void InsertAtFirst( int newData){
         Node newNode = new Node(newData);
         newNode.next =head;
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
        }
        public void display(){
            Node current = head;
            while (current != null) {
                System.out.print("---> "  +current.data);
                current = current.next;
            }
        }
    
        public static void main(String[] args) {
            LLDeleteFirst  list = new LLDeleteFirst();
            list.InsertAtFirst(2);
            list.InsertAtFirst(9);
            list.InsertAtFirst(10);
    
            System.out.println("Before insertion of 10");
            list.display();
            System.out.println();
    
            list.DeleteFirst(2);
            System.out.println("After insertion of 10");
            list.display();
            System.out.println();
        }
        }
    
    