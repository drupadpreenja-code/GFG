public class SimplyLinkedListImpl {

    public static void implementation() {
        Node head = new Node(10);
        Node second = new Node(20);
        Node last = new Node(30);

        head.next = second;
        second.next = last;
    }

}
