package stack;

/**
 * @author mtreellen
 * @date 2019-10-20-11:59
 */
public class Calculator1 {
    public static void main(String[] args) {
        System.out.println(calculator("7+2*6-4/2"));
    }
    public static int calculator(String expression){
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if(operStack.isOper(ch)){
                if((operStack.isEmpty())){
                    operStack.push(ch);
                }else{
                    if(operStack.priority(ch) <= operStack.priority(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    }else{
                        operStack.push(ch);
                    }
                }
            }else{
                numStack.push(ch - 48);
            }
            index++;
            if (index >= expression.length()){
                break;
            }
        }
        return res;
    }
}
class ArrayStack2{
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack2(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }
    public int pop(){
        if(isEmpty()){
            throw new  RuntimeException("栈空");
        }
        int tmp = top;
        top--;
        return stack[tmp];
    }
    public void show(){
        if(isEmpty()){
            throw new  RuntimeException("栈空");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("stack[" + i + "] = " + stack[i]);
        }
    }
    public int peek(){
        return stack[top];
    }
    public int priority(int oper){
        if(oper == '*' || oper == '/'){
            return 1;
        }else if(oper == '+' || oper == '-'){
            return 0;
        }else{
            return -1;
        }
    }
    public boolean isOper(int val){
        return val == '*' || val == '/' || val == '+' || val == '-';
    }

    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch(oper){
            case '*':
                res =  num1 * num2;
                break;
            case '/':
                res =  num2 / num1;
            break;
            case '+':
                res =  num1 + num2;
            break;
            case '-':
                res =  num2 - num1;
            break;
        }
        return res;
    }
}