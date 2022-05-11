public class MiddleElementLinkedList {

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
        Node result = middleElement(head);
        if(result != null){
            System.out.println(result.data);
        }else{
            System.out.println(result);
        }
    }

    private static Node middleElement(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node first = head, second = head;
        while(first != null && first.next != null){
            second = second.next;
            first = first.next.next;
        }
        return second;
    }
}
