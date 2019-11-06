package tree.binarytree;

/**
 * @author mtreellen
 * @date 2019-11-05 14:40
 * @description
 */
public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    private Node pre = null;
    /**
     *
     * @param node : 当前需要线索化的节点
     */
    public void threadedNodes(Node node){
        if(node == null){
            return;
        }
        // 线索化左子树
        threadedNodes(node.getLeftNode());
        // 线索化当前节点
        if(node.getLeftNode() == null){
            node.setLeftNode(pre);
            node.setLeftType(1);
        }
        if(pre.getRightNode() == null){
            pre.setRightNode(node);
            pre.setRightType(1);
        }

        pre = node;
        // 线索化右子树
        threadedNodes(node.getRightNode());

    }

    // 前序遍历
    public void preOrder(){
        if(this.root != null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树为空！！");
        }
    }
    // 中序遍历
    public void infixOrder(){
        if(this.root != null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树为空！！");
        }
    }
    // 后序遍历
    public void postOrder(){
        if(this.root != null){
            this.root.postOrder();
        }else{
            System.out.println("二叉树为空！！");
        }
    }

    // 前序遍历查找
    public Node preOrderSearch(String name){
        if(root != null){
            return this.root.preOrderSearch(name);
        }else{
            return null;
        }
    }
    // 中序遍历查找
    public Node infixOrderSearch(String name){
        if(this.root != null){
            return this.root.infixOrderSearch(name);
        }else{
            return null;
        }
    }
    // 后序遍历查找
    public Node postOrderSearch(String name){
        if(this.root != null){
            return this.root.postOrderSearch(name);
        }else{
            return null;
        }
    }
    // 删除节点
    public void delete(String name){
        if(this.root != null){
            if(root.getName().equals(name)){
                root = null;
            }else{
                this.root.delete(name);
            }
        }else{
            System.out.println("二叉树为空");
        }
    }
}
