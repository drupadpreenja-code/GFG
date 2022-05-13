public class DetectLoopFloydCycleDetection {

    /**
     * Initializing a Linked List with loop
     */
    public static void initializeLinkedList() {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(loopFound(head));
    }

    /**
     * Method to detect if any loop is there in the linked list
     * 
     * @param head
     * @return
     */
    private static Boolean loopFound(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
