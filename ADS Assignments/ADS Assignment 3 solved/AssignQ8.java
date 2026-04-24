class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class AssignQ8 {
    Node head;

    int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        AssignQ8 list = new AssignQ8();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Total nodes: " + list.count());
    }
}