package linkedlist;

//        class Node  {
//            int value;
//            Node next;
//
//            Node(int value) {
//                this.value = value;
//                this.next = null;
//            }
//        }

public class P79_DeleteNode {

    static Node deleteAtHead(Node head) {
            if(head == null)    return null;
            return head.next;
    }

    static Node deleteAtTail(Node head) {
        if(head == null || head.next == null)    {
            return null;
        }

        Node current = head;
        while(current.next.next != null)    {
            current = current.next;
        }

        current.next = null;
        return head;
    }

    static Node deleteAtPosition(Node head, int position)   {
        if(head == null)    return null;

        if(position == 0)   {
            return head.next;
        }

        Node current = head;
        for(int i = 0; i < position - 1; i++)   {
                current = current.next;
        }

            current.next = current.next.next;
                return head;
    }

        static void traverse(Node head) {
            Node current = head;
            while(current != null)  {
                System.out.print(current.value + " -> ");
                    current = current.next;
            }
                System.out.println("null");
        }

    public static void main(String[] args)  {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        traverse(head);

        Node head2 = new Node(100);
        head2.next = new Node(200);
        head2.next.next = new Node(300);
        head2.next.next.next = new Node(400);

        traverse(head2);
        head2 = deleteAtPosition(head2, 2);
        traverse(head2);

        head = deleteAtHead(head);
        traverse(head);

        head = deleteAtTail(head);
        traverse(head);
    }

}
