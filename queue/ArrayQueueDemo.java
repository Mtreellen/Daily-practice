package queue;

import java.util.Scanner;

/**
 * @author mtreellen
 * @create 2019-10-09-16:51
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("s(show): 显示队列");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头数据");
            System.out.println("e(exit): 退出队列");
            key = scanner.next().charAt(0);//接受一个字符
            switch(key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入一个数字：");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try{
                        int res = arrayQueue.getQueue();
                        System.out.print("取出的数据为：" + res);
                        System.out.println();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是：%d\n", res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                    default:
                        break;
            }
        }
        System.out.println("程序退出~~");
    }
}
//使用数组模拟队列，编写一个ArrayQueue类
class ArrayQueue{
    private int maxSize;//队列的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//存放数据的数组，模拟队列

    //创建队列的构造器
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
        front = -1;//指向队列头部，队列头的前一个位置
        rear = -1;//指向队列尾部，队列最后一个数据
    }
    //判断队列是否满了
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    //判断队列为空
    public boolean isEmpty(){
        return rear == front;
    }
    //添加数据到队列
    public void addQueue(int data){
        //判断队列是否满了
        if(isFull()){
            System.out.println("队列已经满了，不能再添加了");
            return;
        }
        rear++;//rear后移动
        arr[rear] = data;
    }
    //数据出队列
    public int getQueue(){
        if(isEmpty()){
            //System.out.println("队列为空");
            //通过抛出异常来处理
            throw new RuntimeException("队列为空");
        }
        front++;//front后移动
        return arr[front];
    }
    //显示队列所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
    //显示队列头数据
    public int headQueue(){
        if(isEmpty()){
            //System.out.println("队列为空");
            throw new RuntimeException("队列为空");
        }
        return arr[front+1];
    }
}
