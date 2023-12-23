public class Stack {
    int stackArr[];
    int top;
    public Stack(int size){
        stackArr = new int[size];
        top = -1;
    }

    public int push(int data){
        if(top == stackArr.length - 1){
            System.out.println("Stack is full.. can not push...");
            return 0;
        }
        else{
            top +=1;
            stackArr[top] = data;
        }
        return data;
    }

    public int pop(){
        int popEl;
        if(top == -1){
            System.out.println("Stack is empty....");
            return 0;
        }
        else{
            popEl = stackArr[top];
            top -= 1;
        }
        return popEl;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void printStack(){
        for(int i = stackArr.length -1; i >= 0;i--){
            System.out.println(stackArr[i]);
            System.out.println("|");
        }
    }
    
}
