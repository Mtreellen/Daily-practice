package josephu.exercise1;

/**
 * @author mtreellen
 * @date 2019-10-22-21:20
 */
public class Josephu {
    public static void main(String[] args) {
        CircleSingleLinkedList linkedList = new CircleSingleLinkedList();
        linkedList.add(5);
        linkedList.show();
        System.out.println("***********************************");
        linkedList.countNode(1, 2, 5);
    }
}
