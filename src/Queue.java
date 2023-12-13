public class Queue {
    private int top;

    private int arr[];

    public Queue(int size){
        this.top = -1;
        arr = new int[size];
    }

    public void push(int data){
        if(top >= arr.length - 1){
            System.out.println("Can not push.... Queue is full...");
            return;
        }else{
            top ++;
            arr[top] = data;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Cannot pop.. Queque is empty..");
            return 0;
        }
        else{
            int popEl = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }
            top --;
            return popEl;
        }
    }

    public void printQueque(){
        for(int i = 0; i <= top; i ++){
            System.out.print(arr[i] + "-->");
        }
    }
}
