public class TraversingLinkedList {
    
    /**
     * Initializing a Linked List
     */
    public static void initializeLinkedList(){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverseAndPrint(head);
    }

    /**
     * Traversing and Printing the Elemnts of the Linked List
     * @param head
     */
    private static void traverseAndPrint(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
