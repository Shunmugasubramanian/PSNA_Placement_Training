public class LinkedList {    //Main Class
    class Node {             //Node Class for creating Node (Nested)
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null, end = null;
  
    void insert(int data) { 
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
    }
    void display() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.display();
    }
}
