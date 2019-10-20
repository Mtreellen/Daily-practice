package stack;

import java.util.Scanner;

/**
 * @author mtreellen
 * @create 2019-10-19-22:48
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        while(loop){
            System.out.println("----------------------------------------");
            System.out.println("------------show:表示显示栈内信息-------");
            System.out.println("------------exit:表示退出程序-----------");
            System.out.println("------------push:表示添加数据到栈-------");
            System.out.println("------------pop:表示从栈取出数据--------");
            System.out.println("----------------------------------------");
            System.out.print("请输入相应的操作名称：");
            key = scanner.next();
            switch(key){
                case "show":
                    stack.show();
                    break;
                case "push":
                    System.out.print("请输入一个数：");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try{
                        int pop = stack.pop();
                        System.out.println(pop);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                    default:
                        System.out.print("输入有误，请重新输入");
                        break;
            }
        }
        System.out.println("程序退出~~");
    }
}
class ArrayStack{
    private int maxSize;
    private int top = -1;
    private int[] stack;

    public ArrayStack(){}
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
    public boolean isFull(){
        return top == maxSize - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int i){
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = i;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈空");
        }
        int value = top;
        top--;
        return stack[value];
    }
    public void show() {
        if (isEmpty()) {
            System.out.println("栈空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("stack[" + i + "] = " + stack[i]);
        }
    }
}