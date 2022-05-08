public class InsertionBeginAndEnd {

    /**
     * Initializing a Linked List
     */
    public static void initializeLinkedList() {

        System.out.println("------Insert Begin------");
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        traverseAndPrint(head);

        System.out.println("------Insert End------");
        Node head2 = null;
        head2 = insertEnd(head2, 10);
        head2 = insertEnd(head2, 20);
        head2 = insertEnd(head2, 30);
        traverseAndPrint(head2);

    }

    /**
     * Inserting a node a the beginning of the Linked List
     * 
     * @param head
     * @param x
     * @return
     */
    public static Node insertBegin(Node head, int x) {
        Node newHead = new Node(x);
        newHead.next = head;
        return newHead;
    }

    /**
     * Inserting the node at the end of Linked List
     * 
     * @param head
     * @param x
     * @return
     */
    public static Node insertEnd(Node head, int x) {
        Node newNext = new Node(x);
        if (head == null) {
            return newNext;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNext;
        return head;
    }

    /**
     * Traversing and Printing the Elemnts of the Linked List
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