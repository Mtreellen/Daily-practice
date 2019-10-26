package bite.singleLinkedlist;

/**
 * @author mtreellen
 * @date 2019-10-26-8:26
 */
public class Node {
    private int data;
    private Node next;

    public Node(){}
    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
