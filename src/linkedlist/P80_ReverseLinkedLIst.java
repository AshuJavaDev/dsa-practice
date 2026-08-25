package linkedlist;

public class P80_ReverseLinkedLIst {

    static void traverse(Node head) {
        Node current = head;
        while(current != null)  {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
            System.out.println("null");
    }

    static Node reverse(Node head)  {
        Node prev = null;
        Node current = head;

        while(current != null)  {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

            return prev;
    }

    public static void main(String[] args)  {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        traverse(head);

        head = reverse(head);
        traverse(head);
    }

}
