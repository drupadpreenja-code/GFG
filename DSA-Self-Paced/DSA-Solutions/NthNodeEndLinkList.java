public class NthNodeEndLinkList {
    
    /**
     * Initializing a Circular Linked List
     */
    public static void initializeLinkedList() {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        Node result = nthNodeFromEnd(head, 3);
        if (result != null) {
            System.out.println(result.data);
        } else {
            System.out.println(result);
        }
    }

    /**
     * Method to find the Middle elemnt of the linked list
     * In case of even length it will print the right element
     * 
     * @param head
     * @return
     */
    private static Node nthNodeFromEnd(Node head, int n) {
        if (head == null) {
            return head;
        }
        Node first = head, second = head;
        int count = 0 ;
        while (first != null && first.next != null) {
            if(count > n - 2){
                second = second.next;
            }
            first = first.next;
            count++;
        }
        return second;
    }
}
