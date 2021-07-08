package linkedlists;

public class Node {
    private Object data;
    private Node next;

    public Node(Object dataIn, Node nextIn){
        this.data = dataIn;
        this.next = nextIn;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
