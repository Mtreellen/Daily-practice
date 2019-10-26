package bite.singleLinkedlist;

/**
 * @author mtreellen
 * @date 2019-10-26-8:34
 */
public class Test {
    public static void main(String[] args) {
        MySingleLinkedList singleLinkedList1 = new MySingleLinkedList();
        MySingleLinkedList singleLinkedList2 = new MySingleLinkedList();

        singleLinkedList1.addFirst(1);
        singleLinkedList1.addFirst(2);
        singleLinkedList1.addFirst(3);
        singleLinkedList1.display();
        System.out.println();

        singleLinkedList2.addLast(1);
        singleLinkedList2.addLast(2);
        singleLinkedList2.addLast(3);
        singleLinkedList2.display();
        System.out.println();

        singleLinkedList1.addIndex(3,33);
        singleLinkedList1.display();
        System.out.println(singleLinkedList1.getLength());
    }
}
