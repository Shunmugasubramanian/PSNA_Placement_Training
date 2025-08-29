import java.util.*;
public class LLProject {
    class Node {
        String name, dept;
        long number;
        Node next;
        public Node(String name, String dept, long number) {
            this.name = name;
            this.dept = dept;
            this.number = number;
        }
    }
    Node head = null, end = null;

    void insertAtEnd(String name, String dept, long number) {
        Node newnode = new Node(name, dept, number);
        if(head == null) {
            head = newnode;
            end = newnode;
        }
        else {
            end.next = newnode;
            end = newnode;
        }
    }
  
    void insertAtBeginning(String name, String dept, long number) {
        Node newnode = new Node(name, dept, number);
        if(head == null) {
            head = newnode;
            end = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }
  
    void insertAtMiddle(String name, String dept, long number, int pos) {
        Node newnode = new Node(name, dept, number);
        if (head == null) {
            head = newnode;
            end = newnode;
        } else {
            if (pos == 1) {
                newnode.next = head;
                head = newnode;
                return;
            }
            Node c = head;
            int count = 1;
            while (count != pos && c != null) {
                c = c.next;
                count++;
            }
            if (c == null) {
                end.next = newnode;
                end = newnode;
                return;
            }
            newnode.next = c.next;
            c.next = newnode;
        }
    }
  
    void display() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.name+"||"+curr.dept+"||"+curr.number+ "->");
            curr = curr.next;
        }
    }
  
    void delete(long number) {
        if(number == head.number) {
            head = head.next;
            return;
        }
        Node current = head, prev = null;
        while(current.number != number) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        if(prev.next == null) {
            end = prev;
        }
    }
  
    public static void main(String[] args) {
        LLProject l = new LLProject();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("\n1.Insert \n2.Delete \n3.Display \n4.Exit");
            System.out.print("Enter the choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Insert At Beginning \n2.Insert At Middle \n3.Insert At End");
                    System.out.print("Enter the choice: ");
                    int choice1 = s.nextInt();
                    System.out.print("Enter the name: ");
                    String name = s.next();
                    s.nextLine();
                    System.out.print("Enter the Department: ");
                    String dept = s.next();
                    s.nextLine();
                    System.out.print("Enter the Number: ");
                    long number = s.nextLong();
                    switch(choice1) {
                        case 1:
                            l.insertAtBeginning(name, dept, number);
                            break;
                        case 2:
                            System.out.print("Enter the Position: ");
                            int pos = s.nextInt();
                            l.insertAtMiddle(name, dept, number, pos);
                            break;
                        case 3:
                            l.insertAtEnd(name, dept, number);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter the Number to be deleted: ");
                    long num = s.nextLong();
                    l.delete(num);
                    break;
                case 3:
                    l.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
