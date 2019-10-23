package josephu.exercise1;

/**
 * @author mtreellen
 * @date 2019-10-22-21:20
 */
public class CircleSingleLinkedList {
    private Node first = null;

    public void add(int nums) {
        if(nums < 1){
            return;
        }
        Node cur = null;
        for (int i = 1; i <= nums; i++) {
            Node node = new Node(i);
            if(i == 1){
                first = node;
                first.setNext(first);
                cur = first.getNext();
            }else{
                cur.setNext(node);
                node.setNext(first);
                cur = node;
            }
        }
    }
    public void show(){
        if(first == null){
            return;
        }
        Node cur = first;
        while(true){
            System.out.println(cur);
            if(cur.getNext() == first){
                break;
            }
            cur = cur.getNext();
        }
    }
    public void countNode(int startNo, int countNum, int nums){
        if(first == null || startNo < 1 || startNo > nums){
            return;
        }
        Node cur1 = first;
        while(true){
            if(cur1.getNext() == first){
                break;
            }
            cur1 = cur1.getNext();
        }
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            cur1 = cur1.getNext();
        }
        while(true){
            if(cur1 == first){
                break;
            }
            for (int i = 0; i < countNum - 1; i++) {
                cur1 = cur1.getNext();
                first = first.getNext();
            }
            System.out.println(first);
            first = first.getNext();
            cur1.setNext(first);
        }
        System.out.println(first);
    }
}
