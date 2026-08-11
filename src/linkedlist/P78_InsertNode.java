package linkedlist;


//class Node  {
//    int value;
//    Node next;
//
//    Node(int value) {
//        this.value = value;
//        this.next = null;
//    }
//}
public class P78_InsertNode {

        static Node insertAtHead(Node head, int value)  {
            Node newNode = new Node(value);
            newNode.next = head;
                return newNode;
        }

        static Node insertAtTail(Node head, int value) {
            Node newNode = new Node(value);

            if(head == null)    {
                return newNode;
            }

            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
                current.next = newNode;
                return head;

        }

        static void traverse(Node head)    {
            Node current = head;

            while(current != null)  {
                System.out.print(current.value + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args)  {
            Node head = new Node(20);
            head.next = new Node(30);

            traverse(head);

            head = insertAtHead(head, 10);
            traverse(head);

            head = insertAtTail(head, 40);
            traverse(head);
        }

    }

