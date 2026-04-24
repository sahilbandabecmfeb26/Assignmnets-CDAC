class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class AssignQ9 {
    Node head;

    void reverse() {
        Node prev = null, curr = head, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void display() {
        if (head == null) {
            System.out.println("LinkedList: (empty)");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AssignQ9 list = new AssignQ9();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.reverse();
        list.display();
    }
}