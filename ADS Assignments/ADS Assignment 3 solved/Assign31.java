class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Assign31 {
    Node head;

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
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
        Assign31 list = new Assign31();
        list.insertEnd(5);
        list.insertEnd(10);
        list.insertEnd(15);
        list.insertEnd(20);
        list.insertEnd(25);
        list.display();
    }
}