class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Assign33 {
    Node head;

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void insertPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
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
        Assign33 list = new Assign33();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        list.insertPosition(25, 2);
        list.display();
    }
}