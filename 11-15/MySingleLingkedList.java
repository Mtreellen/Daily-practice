package linkedlist.test.single.head;

/**
 * @author ellen
 * @date 2019-11-15 16:35
 * @description
 */
public class MySingleLingkedList extends SingleLinkedList{
    private Node head = new Node();
    /**
     * 头插法
     * @param data
     */
    @Override
    public void addFirst(String data) {
        Node node = new Node(data);
        if(this.head.getNext() == null){
            this.head.setNext(node);
        }else{
            node.setNext(this.head.getNext());
            this.head.setNext(node);
        }
    }

    /**
     * 尾插法
     * @param data
     */
    @Override
    public void addLast(String data) {
        if(this.head.getNext() == null){

        }
        Node node = new Node(data);
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }

    @Override
    public boolean addIndex(int index, String data) {

        return false;
    }

    @Override
    public boolean contains(Node key) {
        if(this.head.getNext() == null){
            throw new RuntimeException("链表为空");
        }
        Node cur = head.getNext();
        while(cur != null){
            if(cur.getName().equals(key.getName())){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    public boolean contains(String key) {
        if(this.head.getNext() == null){
            throw new RuntimeException("链表为空");
        }
        Node cur = head.getNext();
        while(cur != null){
            if(cur.getName().equals(key)){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    @Override
    public void remove(String key) {

    }

    @Override
    public void removeAllKey(String key) {

    }

    @Override
    public int size() {
        int count = 0;
        Node cur = head.getNext();
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }

    @Override
    public void display() {
        if (this.head.getNext() == null) {
            System.out.println("链表为空");
            return;
        }
        Node cur = head.getNext();
        while(cur != null){
            System.out.println(cur);
            cur = cur.getNext();
        }
    }
    public Node search(String name){
        if(this.head.getNext() == null){
            throw new RuntimeException("链表为空");
        }
        Node cur = head.getNext();
        while(cur != null){
            if(cur.getName().equals(name)){
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
    @Override
    public void clear() {

    }
}
