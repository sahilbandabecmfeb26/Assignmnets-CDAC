class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Assign34 {
    Node head;

    void deleteFirst() {
        if (head != null)
            head = head.next;
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
        Assign34 list = new Assign34();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.deleteFirst();
        list.display();
    }
}