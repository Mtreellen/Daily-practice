package bite.singleLinkedlist;

/**
 * @author mtreellen
 * @date 2019-10-26-8:26
 */
public class MySingleLinkedList extends SingleLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.setNext(this.head);
            this.head = node;
        }
    }

    /**
     * 第一次插入的节点和之后插入的节点同一时间只发生一个
     * @param data
     */
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = null;
        boolean flag = false;
        if(this.head == null){
            this.head = node;
//            cur = this.head;
        }else{
            cur = this.head;
            while(true){
                if(cur.getNext() == null){
                    flag = true;
                    break;
                }
                cur = cur.getNext();
            }
            if(flag){
                cur.setNext(node);
            }
        }
//        cur.setData(node.getData());
    }

    public int getLength(){
        int count = 0;
        for (Node cur = this.head; cur != null; cur = cur.getNext()) {
            count++;
        }
        return count;
    }

    private void checkIndex(int index){
        if(index < 0 || index > getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }
    private Node searchIndex(int index){
        checkIndex(index);
        int count = 0;
        Node cur = this.head;
        while(count < index - 1){
            cur = cur.getNext();
            count++;
        }
        return cur;
    }
    @Override
    public boolean addIndex(int index, int data) {
        checkIndex(index);
        if(index == 0){
            addFirst(data);
            return true;
        }else{
            Node cur = searchIndex(index);
            Node node = new Node(data);
            node.setNext(cur.getNext());
            cur.setNext(node);
            return true;
        }
//        int count = 0;
//        Node cur = this.head;
//        boolean flag = false;
//        while(cur != null){
//            count++;
//            if(index == count){
//                flag = true;
//                break;
//            }
//            cur = cur.getNext();
//        }
//       if(flag){
//           Node node = new Node(data);
//           node.setNext(searchIndex(index).getNext());
//           searchIndex(index).setNext(node);
//           return true;
//       }else {
//           return false;
//       }
    }

    @Override
    public boolean contains(int key) {
        if(this.head == null){
            return false;
        }
        Node cur = this.head;
        while(cur != null){
            if(cur.getData() == key){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    @Override
    public void remove(int key) {
        if(this.head == null){
            return;
        }
        if(this.head.getData() == key && this.head.getNext() == null){
            this.head = null;
        }
        Node cur = head;
        boolean flag = false;
        while(cur.getNext() != null){
            if(cur.getNext().getData() == key){
                flag = true;
                break;
            }
            cur = cur.getNext();
        }
        if(flag){
            cur.setNext(cur.getNext().getNext());
        }
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {
        if(this.head == null){
            return;
        }
        Node cur = this.head;
        while(cur != null){
            System.out.println(cur);
            cur = cur.getNext();
        }
    }

    @Override
    public void clear() {

    }
}
