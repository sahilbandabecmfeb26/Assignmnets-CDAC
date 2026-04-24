class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class AssignQ5 {
    Node head;

    void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AssignQ5 list = new AssignQ5();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.deleteLast();
        list.display();
    }
}