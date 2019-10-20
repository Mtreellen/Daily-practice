package stack;

/**
 * @author mtreellen
 * @date 2019-10-20-10:04
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "722+2*6-4/2";
        ArrayStack1 numStack = new ArrayStack1(10);
        ArrayStack1 operStack = new ArrayStack1(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while(true){
            ch = expression.substring(index, index+1).charAt(0);
            if(operStack.isOper(ch)){
                if(!operStack.isEmpty()){
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
                }else{
                    operStack.push(ch);
                }
            }else{
//                numStack.push(ch - 48);
                keepNum += ch;
                if(index == expression.length() - 1){
                    numStack.push(Integer.parseInt(keepNum));
                }else{
                    if(operStack.isOper(expression.substring(index+1, index+2).charAt(0))){
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }

            }
            index++;
            if(index >= expression.length()){
                break;
            }
        }
        while(true){
            if(operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        System.out.println("表达式" + expression + " = " + numStack.pop());
    }
}
class ArrayStack1{
    private int maxSize;
    private int top = -1;
    private int[] stack;

    public ArrayStack1(){}
    public ArrayStack1(int maxSize){
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
    public void show(){
        if(isEmpty()){
            System.out.println("栈空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println("stack[" + i+ "] = " + stack[i]);
        }
    }
    public int peek(){
        return stack[top];
    }
    public boolean isOper(char val){
        return val == '*' || val == '/' || val == '+' || val == '-';
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
    public int cal(int num1, int num2, int oper){
        int res = 0;
        switch(oper){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
        }
        return res;
    }
}