package tree.arrbinarytree;

/**
 * @author mtreellen
 * @date 2019-11-06 15:32
 * @description
 */
public class ArrayBinaryTree {
    private int[] arr;
    public ArrayBinaryTree(int[] arr){
        this.arr = arr;
    }
    public void preOrder(int index){
        if(index < 0 || arr == null || arr.length <= 0){
            System.out.println("数组为空或下标不合法");
            return;
        }
        System.out.println(arr[index]);
        if(index * 2 + 1 < arr.length){
            preOrder(2 * index + 1);
        }
        if(index * 2 + 2 < arr.length){
            preOrder(2 * index + 2);
        }
    }
    public void preOrder(){
        this.preOrder(0);
    }
}
class Test{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
        arrayBinaryTree.preOrder();
    }
}