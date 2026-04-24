class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class AssignQ6 {
    Node head;

    void deleteValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
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
        AssignQ6 list = new AssignQ6();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.deleteValue(30);
        list.display();
    }
}