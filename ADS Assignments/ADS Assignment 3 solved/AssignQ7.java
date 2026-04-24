class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class AssignQ7 {
    Node head;

    int search(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        AssignQ7 list = new AssignQ7();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        int res = list.search(30);
        System.out.println("Element found at index " + res);
    }
}