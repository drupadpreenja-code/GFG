public class ReverseDoublyLinkedList {

    /**
     * Initializing a Linked List
     */
    public static void initializeLinkedList() {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.previous = head;// For 20
        head.next.next.previous = head.next;// For 30
        head.next.next.next.previous = head.next.next;// For 40

        traverseAndPrint(reverseDoublyLinkedList(head));
    }

    /**
     * Reverse the Doubly Linked List
     * 
     * @param head
     * @return
     */
    private static Node reverseDoublyLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head, previous = null;
        while (current != null) {
            previous = current.previous;
            current.previous = current.next;
            current.next = previous;
            current = current.previous;
        }
        return previous.previous;
    }

    /**
     * Traversing and Printing the Elements of the Linked List
     * 
     * @param head
     */
    private static void traverseAndPrint(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
