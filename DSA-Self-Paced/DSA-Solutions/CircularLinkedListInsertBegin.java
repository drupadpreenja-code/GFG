public class CircularLinkedListInsertBegin {
    /**
     * Initializing a Circular Linked List
     */
    public static void initializeLinkedList() {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        traverseAndPrint(insertBegin(head, 5));
    }

    private static Node insertBegin(Node head, int data) {
        Node newFirst = new Node(data);
        if (head == null) {
            newFirst.next = newFirst;
            return newFirst;
        } else {
            newFirst.next = head.next;
            head.next = newFirst;

            int value = head.data;
            head.data = newFirst.data;
            newFirst.data = value;
        }
        return head;
    }

    /**
     * Traversing and Printing the Elements of the Circular Linked List
     * 
     * @param head
     */
    private static void traverseAndPrint(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}
