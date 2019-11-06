package tree.binarytree;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-05 14:31
 * @description
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
//        testBinaryTree();
//        testBinaryTreeSearch();
//        testDelete();
        testThreadedNodes();
    }
    public static void testThreadedNodes(){
        Node root = new Node(1, "Monica");
        Node no2 = new Node(3, "Rose");
        Node no3 = new Node(6, "Rachel");
        Node no4 = new Node(8, "Phoebe");
        Node no5 = new Node(10, "Joey");
        Node no6 = new Node(14, "Chandler");

        root.setLeftNode(no2);
        root.setRightNode(no3);
        no2.setLeftNode(no4);
        no2.setRightNode(no5);
        no3.setRightNode(no6);

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(root);
        binaryTree.threadedNodes(root);

        System.out.println(no5.getLeftNode());
    }

    public static void testBinaryTree(){
        Node root = new Node(0, "Ellen");
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Rose");
        Node no3 = new Node(3, "Rachel");
        Node no4 = new Node(4, "Phoebe");
        Node no5 = new Node(5, "Joey");
        Node no6 = new Node(6, "Chandler");

        BinaryTree binaryTree = new BinaryTree();

        /**
         * 手动创建二叉树
         *
         *                 root
         *               /     \
         *              no1    no2
         *            /   \
         *          no3   no4
         *        /   \
         *      no5   no6
         */

        binaryTree.setRoot(root);
        root.setLeftNode(no1);
        root.setRightNode(no2);
        no1.setLeftNode(no3);
        no1.setRightNode(no4);
        no3.setLeftNode(no5);
        no3.setRightNode(no6);

        // 前序遍历
        System.out.println("前序遍历");
        binaryTree.preOrder();
        // 中序遍历
        System.out.println("中序遍历");
        binaryTree.infixOrder();
        // 后序遍历
        System.out.println("后序遍历");
        binaryTree.postOrder();
    }
    public static void testBinaryTreeSearch(){
        Node root = new Node(0, "Ellen");
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Ross");
        Node no3 = new Node(3, "Rachel");
        Node no4 = new Node(4, "Phoebe");
        Node no5 = new Node(5, "Joey");
        Node no6 = new Node(6, "Chandler");

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(root);
        root.setLeftNode(no1);
        root.setRightNode(no2);
        no1.setLeftNode(no3);
        no1.setRightNode(no4);
        no3.setLeftNode(no5);
        no3.setRightNode(no6);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要查找的人的姓名：");
        String input = scanner.next();

        preOrderSearch(binaryTree, input);
        infixOrderSearch(binaryTree, input);
        postOrderSearch(binaryTree, input);
    }
    public static void preOrderSearch(BinaryTree binaryTree, String input){
        System.out.println("============前序遍历查找============");
        Node node = binaryTree.preOrderSearch(input);
        if(node != null){
            System.out.println("找到您要找的节点了，详细信息如下：");
            System.out.println(node);
        }else{
            System.out.println("您要查找的节点不存在于此二叉树中！");
        }
    }

    public static void infixOrderSearch(BinaryTree binaryTree, String input){
        System.out.println("============中序遍历查找[]============");
        Node node = binaryTree.infixOrderSearch(input);
        if(node != null){
            System.out.println("找到您要找的节点了，详细信息如下：");
            System.out.println(node);
        }else{
            System.out.println("您要查找的节点不存在于此二叉树中！");
        }
    }
    public static void postOrderSearch(BinaryTree binaryTree, String input){
        System.out.println("============后序遍历查找============");
        Node node = binaryTree.postOrderSearch(input);
        if(node != null){
            System.out.println("找到您要找的节点了，详细信息如下：");
            System.out.println(node);
        }else{
            System.out.println("您要查找的节点不存在于此二叉树中！");
        }
    }
    public static void testDelete(){
        Node root = new Node(0, "Ellen");
        Node no1 = new Node(1, "Monica");
        Node no2 = new Node(2, "Ross");
        Node no3 = new Node(3, "Rachel");
        Node no4 = new Node(4, "Phoebe");
        Node no5 = new Node(5, "Joey");
        Node no6 = new Node(6, "Chandler");

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(root);
        root.setLeftNode(no1);
        root.setRightNode(no2);
        no1.setLeftNode(no3);
        no1.setRightNode(no4);
        no3.setLeftNode(no5);
        no3.setRightNode(no6);

        binaryTree.preOrder();

        binaryTree.delete("Rachel");
        System.out.println("======删除后=======");
        binaryTree.preOrder();

    }
}
