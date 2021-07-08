package linkedlists;

public class MySingLinkedList {

    private Node head;
    private int size;

    public int size() {
        return this.size;
    }

    public void prepend(Object data) {
        // create a new node with the address as null pointer
        Node header = new Node(data, null);
        header.setNext(head);       // set to old head
        this.head = header;
        size++;                     // increment linkedList size
    }

}

