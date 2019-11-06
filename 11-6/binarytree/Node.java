package tree.binarytree;

/**
 * @author mtreellen
 * @date 2019-11-05 14:31
 * @description
 */
public class Node {
    private int no;
    private String name;
    private Node leftNode;
    private Node rightNode;
    // leftType == 0 : 指向左子树，leftType == 1 : 指向前驱节点
    private int leftType;
    // rightType == 0 : 指向右子树，rightType == 1 : 指向后继节点
    private int rightType;

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

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

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node { " +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        if(this == null){
            return;
        }
        // 先输出当前节点
        System.out.println(this);
        // 递归前序遍历左子树
        if(this.leftNode != null){
            this.leftNode.preOrder();
        }
        // 递归前序遍历右子树
        if(this.rightNode != null){
            this.rightNode.preOrder();
        }
    }
    /**
     *  中序遍历
     */
    public void infixOrder(){
        if(this == null){
            return;
        }
        // 先递归中序遍历左子树
        if(this.leftNode != null){
            this.leftNode.infixOrder();
        }
        // 输出当前节点
        System.out.println(this);
        // 递归中序遍历右子树
        if(this.rightNode != null){
            this.rightNode.infixOrder();
        }
    }

    /**
     *  后序遍历
     */
    public void postOrder(){
        if(this == null){
            return;
        }
        // 先递归中序遍历左子树
        if(this.leftNode != null){
            this.leftNode.postOrder();
        }
        // 递归中序遍历右子树
        if(this.rightNode != null){
            this.rightNode.postOrder();
        }
        // 输出当前节点
        System.out.println(this);
    }

    /**
     * 前序遍历查找
     * @param name
     * @return : 返回this.name equal to name 的 Node
     */
    public Node preOrderSearch(String name){
        System.out.println("前序遍历查找");
        Node res = null;
        if(this.name.equals(name)){
            return this;
        }
        if(this.leftNode != null){
            res = this.leftNode.preOrderSearch(name);
        }
        if(res != null){
            return res;
        }
        if(this.rightNode != null){
            res = this.rightNode.preOrderSearch(name);
        }
        return res;
    }

    /**
     * 中序遍历查找
     * @param name
     * @return
     */
    public Node infixOrderSearch(String name){
        // 不该在这儿 【why】
//        int count = 0;
//        System.out.println("中序遍历查找：" + (++count) + "次。");
        Node res = null;
        if(this.leftNode != null){
            res = this.leftNode.infixOrderSearch(name);
        }
        if(res != null){
            return res;
        }
        System.out.println("中序遍历查找");
        if(this.name.equals(name)){
            return this;
        }
        if(this.rightNode != null){
            res = this.rightNode.infixOrderSearch(name);
        }
        return res;
    }

    /**
     * 后序遍历查找
     * @param name
     * @return
     */
    public Node postOrderSearch(String name){
        // 不该在这儿 【why】
//        int count = 0;
//        System.out.println("后序遍历查找：" + (++count) + "次。");
        Node res = null;
        if(this.leftNode != null){
            res = this.leftNode.infixOrderSearch(name);
        }
        if(res != null){
            return res;
        }
        if(this.rightNode != null){
            res = this.rightNode.infixOrderSearch(name);
        }
        if(res != null){
            return res;
        }
        System.out.println("后序遍历查找");
        if(this.name.equals(name)){
            return this;
        }
        return res;
    }

    public void delete(String name){
        if(this.getLeftNode() != null && this.getLeftNode().getName().equals(name)){
            this.setLeftNode(null);
            return;
        }
        if(this.getRightNode() != null && this.getRightNode().getName().equals(name)){
            this.setRightNode(null);
            return;
        }
        if(this.leftNode != null){
            this.leftNode.delete(name);
        }
        if(this.rightNode != null){
            this.rightNode.delete(name);
        }
    }
}
