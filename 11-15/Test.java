package linkedlist.test.single.head;

/**
 * @author ellen
 * @date 2019-11-15 16:52
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        addFirstTest();
//        addLastTest();
//        containsTest();
//        sizeTest();
        searchTest();
    }

    private static void searchTest() {
        MySingleLingkedList lingkedList = buildLast();
        Node joey = new Node("joey");
        if(lingkedList.search(joey.getName()) != null){
            System.out.println(lingkedList.search(joey.getName()));
        }else {
            System.out.println("链表中没有name属性为\"joye\"的节点");
        }
        Node rachel = new Node("Rachel");
        if(lingkedList.search(rachel.getName()) != null){
            System.out.println(lingkedList.search(rachel.getName()));
        }else {
            System.out.println("链表中没有name属性为\"Rachel\"的节点");
        }
    }

    private static void sizeTest() {
        MySingleLingkedList lingkedList = buildLast();
        System.out.println("单链表有 " + lingkedList.size() + "个节点");
    }

    private static void containsTest() {
        MySingleLingkedList lingkedList = buildLast();
        lingkedList.display();
        Node rachel = new Node("Rachel");
        if (lingkedList.contains(rachel)){
            System.out.println("链表中有与节点rachel的name属性相同的节点：" + lingkedList.search(rachel.getName()));
        }else{
            System.out.println(rachel.getName() + "不存在于链表中！！");
        }
        if(lingkedList.contains("Rachel")){
            System.out.println("链表中有节点的name属性与\"Rachel\"相同的节点：" + lingkedList.search("Rachel"));
        }else{
            System.out.println(rachel.getName() + "不存在于链表中！！");
        }
    }
    // 测试尾插法
    private static void addLastTest() {
        buildLast().display();
    }

    /**
     * 尾插法创建一个单链表
     * @return
     *      新的单链表
     */
    public static MySingleLingkedList buildLast(){
        MySingleLingkedList lingkedList = new MySingleLingkedList();
        lingkedList.addLast("Monica");
        lingkedList.addLast("Rose");
        lingkedList.addLast("Phoebe");
        lingkedList.addLast("Rachel");
        lingkedList.addLast("Joey");
        lingkedList.addLast("Chandler");
        return lingkedList;
    }

    // 测试头插法
    public static void addFirstTest(){
        buildFirst().display();
    }

    /**
     * 头插法创建一个单链表
     * @return
     *      新的单链表
     */
    public static MySingleLingkedList buildFirst(){
        MySingleLingkedList lingkedList = new MySingleLingkedList();
        lingkedList.addFirst("Monica");
        lingkedList.addFirst("Rose");
        lingkedList.addFirst("Phoebe");
        lingkedList.addFirst("Rachel");
        lingkedList.addFirst("Joey");
        lingkedList.addFirst("Chandler");
        return lingkedList;
    }
}
