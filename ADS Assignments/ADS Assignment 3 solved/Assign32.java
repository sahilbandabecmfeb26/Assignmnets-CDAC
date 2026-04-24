class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Assign32 {
    Node head;

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        Assign32 list = new Assign32();
        list.insertBeginning(30);
        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertBeginning(5);
        list.display();
    }
}