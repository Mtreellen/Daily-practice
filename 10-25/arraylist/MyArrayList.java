package bite.arraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-10-22-17:22
 */
class MyArrayList{
    private int usedSize;
    private int[] elem;
    private final int CAPACITY = 10;//顺序表容量
    /**
     * 创建顺序表
     * @param usedSize：顺序表有效的长度（有效数据个数）
     */
    public MyArrayList(int usedSize){
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }
    /**
     * 判断顺序表是否已满
     * @return
     */
    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    /**
     * 打印顺序表中的元素
     */
    public void display(){
        if(this.usedSize == 0){
            return;
        }
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print("elem[" + i + "] = " + this.elem[i] + "\t");
        }
        System.out.println();
    }
    /**
     * 扩容
     * @param elem
     * @return
     */
    public int[] capacity(int[] elem){
        int[] arr = Arrays.copyOf(elem, elem.length * 2);
        return arr;
    }
    /**
     * @param pos：要插入元素的位置
     * @param data：要在pos位置插入的数据
     */
    public void add(int pos, int data){
        if(isFull()){
            //数组满了，则扩容
            this.elem = capacity(this.elem);
        }
        if(pos < 0 || pos > elem.length){
            return;
        }
        //pos后的数据往后移动一个单位
        for(int i = this.usedSize; i > pos; i--){
            this.elem[i] = this.elem[i - 1];
        }
        //插入数据
        this.elem[pos] = data;
        this.usedSize++;
    }

    /**
     * 顺序表长度
     * @return：有效数据的个数
     */
    public int size(){
        return this.usedSize;
    }
    public boolean contains(int toFind){
        if(this.usedSize <= 0){
            return false;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        if(this.usedSize == 0){
            return -1;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        if(this.usedSize <= 0 || pos < 0 || pos > this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }
    public void setPos(int pos, int value){
        if(this.usedSize <= 0 || pos < 0 || pos > this.elem.length){
            System.out.println("输入不正确");
            return;
        }
        if(isFull()){
            this.elem = capacity(this.elem);
        }
        for (int i = this.usedSize; i > pos; i++) {
            this.elem[i] = this.elem[i - 1];
        }
        this.elem[pos] = value;
    }

    /**
     * 清空顺序表
     * @return
     */
    public boolean clear(){
//        if(this.usedSize <= 0){
////            return false;
////        }
////        for (int i = 0; i < this.usedSize; i++) {
////            this.elem[i] = 0;
////        }
////        return true;
        this.usedSize = 0;
        return true;
    }
    public void remove(int pos){
        if(this.usedSize <= 0 || pos < 0 || pos >= this.usedSize){
            return;
        }
        for (int i = pos; i < this.usedSize; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }
    public void removeValue(int toRemove){
        if(this.usedSize <= 0){
            return;
        }
        int search = search(toRemove);
        if(search == -1){
            return;
        }
        for (int i = search; i < this.usedSize; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }
}
class Test{
    public static void main(String[] args) {
        /*MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.add(6,7);
        myArrayList.add(5,55);
        System.out.println(myArrayList.size());
        myArrayList.display();
        //contains
        System.out.println(myArrayList.contains(55));
        //search
        System.out.println(myArrayList.search(55));
        //getPos
        System.out.println(myArrayList.getPos(4));
        //size
        System.out.println(myArrayList.size());
        //remove
        myArrayList.remove(2);
        myArrayList.display();
        //removeValue
        myArrayList.removeValue(55);
        myArrayList.display();
        //clear
        myArrayList.clear();
        myArrayList.display();*/
        test();
//        meau();
    }

    public static void test() {
        MyArrayList myArrayList = new MyArrayList(10);
        Scanner scanner = new Scanner(System.in);
        boolean key = true;
        while(key){
            meau();
            System.out.print("请选择您的操作> ");
            int input = scanner.nextInt();
            switch (input){
                case 1:
//                    int i = 0;
                    //TODO:有问题
                    System.out.print("输入您要插入的元素下标> ");
                    int index = scanner.nextInt();
                    System.out.print("输入您要插入的元素内容> ");
                    int value = scanner.nextInt();
                    myArrayList.add(index, value);
                    break;
                case 2:
                    System.out.print("输入您要删除的下标> ");
                    myArrayList.remove(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("输入您要删除的元素> ");
                    myArrayList.removeValue(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("输入您要查看的下标> ");
                    System.out.println("此下标对应元素为：" + myArrayList.getPos(scanner.nextInt()));
                    break;
                case 5:
                    myArrayList.display();
                    break;
                case 6:
                    System.out.println("当前顺序表的长度为：" + myArrayList.size());
                    break;
                case 7:
                    System.out.print("输入您要查找的元素> ");
                    System.out.println("此元素是否存在：" + myArrayList.contains(scanner.nextInt()));
                    break;
                case 8:
                    myArrayList.clear();
                    System.out.println("链表成功清空");
                    break;
                case 9:
                    key = false;
                    break;
                    default:
                        System.out.println("输入有误");
                        break;
            }
        }
    }
    public static void meau(){
        System.out.println("|********************************************\t|");
        System.out.println("|*************1.添加元素\t\t\t\t\t\t|");
        System.out.println("|*************2.删除指定下标元素\t\t\t\t|");
        System.out.println("|*************3.删除指定内容元素\t\t\t\t|");
        System.out.println("|*************4.查看指定下标元素内容\t\t\t|");
        System.out.println("|*************5.打印顺序表\t\t\t\t\t\t|");
        System.out.println("|*************6.打印顺序表长度\t\t\t\t\t|");
        System.out.println("|*************7.查看指定元素是否存在\t\t\t|");
        System.out.println("|*************8.清空顺序表\t\t\t\t\t\t|");
        System.out.println("|*************9.退出程序\t\t\t\t\t\t|");
        System.out.println("|********************************************\t|");
    }
}