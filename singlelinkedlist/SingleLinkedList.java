package linkedlist.singlelinkedlist;

import org.junit.Test;

import java.util.Stack;

/**
 * @author mtreellen
 * @create 2019-10-19-19:13
 */
public class SingleLinkedList {
    @Test
    public void test(){
        SingleLinkedList linkedList = new SingleLinkedList();
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Rachel");
        Node no3 = new Node(3,"Phoebe");

        linkedList.add(no1);
        linkedList.add(no2);
        linkedList.add(no3);
        linkedList.show();
        System.out.println("*********逆序打印*********");
        linkedList.backPrint();
        System.out.println("*********利用栈逆序打印*********");
        linkedList.backPrint1();
        System.out.println("*********链表反转***********");
        linkedList.reverse();
        linkedList.show();
    }
    @Test
    public void test1(){
        SingleLinkedList linkedList = new SingleLinkedList();
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Rachel");
        Node no3 = new Node(3,"Phoebe");

        linkedList.addByOrder(no3);
        linkedList.addByOrder(no1);
        linkedList.addByOrder(no2);
        linkedList.addByOrder(no1);
        linkedList.show();
        System.out.println("该链表有效节点个数为：" + linkedList.size());
        linkedList.printK(3);
    }
    @Test
    public void test2(){
        SingleLinkedList linkedList = new SingleLinkedList();
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Rachel");
        Node no3 = new Node(3,"Phoebe");

        linkedList.addByOrder(no3);
        linkedList.addByOrder(no1);
        linkedList.addByOrder(no2);
        linkedList.addByOrder(no1);
        linkedList.show();


        System.out.println("**********删除节点**************");
        linkedList.delete(1);
        linkedList.show();
        System.out.println("**********更新节点**************");
        linkedList.update(new Node(2, "Green"));
        linkedList.show();
        System.out.println("**********查询节点**************");
        System.out.println(linkedList.findNo(2));
    }


    private Node head = new Node();

    public void add(Node node){
        Node tmp = head;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            tmp = tmp.getNext();
//            tmp.setNext(tmp.getNext());//error
            //  tmp.next = tmp.next;
        }
        tmp.setNext(node);
    }

    public void addByOrder(Node node){
        Node tmp = head;
        boolean flag = false;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            if(tmp.getNext().getNo() > node.getNo()){
                break;
            }else if(tmp.getNext().getNo() == node.getNo()){
                flag = true;
                break;
            }
            tmp = tmp.getNext();
        }
        if(flag){
            System.out.println("编号为" + node.getNo() + "的结点已经存在了");
        }else{
            if(tmp.getNext() == null){
                tmp.setNext(node);
            }else{
//                node.getNext() = tmp.getNext();//wrong
                node.setNext(tmp.getNext());
                tmp.setNext(node);
            }
        }
    }

    public void show(){
        Node tmp = head.getNext();
        while(true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp);
            tmp = tmp.getNext();
        }
    }

    public void delete(int no) {
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        Node tmp = head;
        boolean flag = false;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            if(tmp.getNext().getNo() == no){
                flag = true;
                break;
            }
            tmp = tmp.getNext();
        }
        if(flag){
            tmp.setNext(tmp.getNext().getNext());
        }else{
            System.out.println("编号为" + no + "的节点不存在");
        }
    }

    public void update(Node node){
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        Node tmp = head;
        boolean flag = false;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            if(tmp.getNext().getNo() == node.getNo()){
                flag = true;
                break;
            }
            tmp = tmp.getNext();
        }
        if(flag){
//            tmp.getNext().getName() = node.getName();
            tmp.getNext().setName(node.getName());
        }
    }

    public Node findNo(int no){
        if(head.getNext() == null){
//            System.out.println("链表为空");
//            return;
            throw new RuntimeException("链表为空");
        }
        Node tmp = head;
        boolean flag = false;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            if(tmp.getNext().getNo() == no){
                flag = true;
                break;
            }
            tmp = tmp.getNext();
        }
        if(flag){
            return tmp.getNext();
        }else{
            throw new RuntimeException("该节点不存在");
        }
    }
    public void printK(int key){
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        if(key <= 0 || key > size()){
            System.out.println("输入不合法");
            return;
        }
        Node cur = head;
        for (int i = 0; i < size()-key; i++) {
            cur = cur.getNext();
        }
        System.out.println(cur.getNext());
    }
    public int size(){
        if(head.getNext() == null){
            return -1;
        }
        Node tmp = head;
        int count = 0;
        while(true){
            if(tmp.getNext() == null){
                break;
            }
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }
    public void backPrint(){
        if(head.getNext() == null){
            return;
        }
        for (int key = 1; key <= size() ; key++) {
            printK(key);
        }
    }
    public void backPrint1(){
        Stack<Node> stack = new Stack<>();
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Rachel");
        Node no3 = new Node(3,"Phoebe");
        stack.push(no1);
        stack.push(no2);
        stack.push(no3);
        for (int i = 0; i < size(); i++) {
            System.out.println(stack.pop());
        }
    }
    public void reverse(){
        if(head.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        Node newHead = new Node();
        Node cur1 = head.getNext();
        Node cur2 = null;
        while(cur1 != null){
            cur2 = cur1.getNext();
            cur1.setNext(newHead.getNext());
            newHead.setNext(cur1);
            cur1 = cur2;
        }
        head = newHead;
    }
}
class Node{
    private int no;
    private String name;
    private Node next;

    public Node(){}

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}