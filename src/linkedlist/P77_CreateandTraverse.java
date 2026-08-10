package linkedlist;

class Node  {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

    public class P77_CreateandTraverse {

    static void traverse(Node head) {
        Node current = head;

        while(current != null)  {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
            System.out.println("null");
    }

    public static void main(String[] args)  {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        traverse(first);
    }

}
