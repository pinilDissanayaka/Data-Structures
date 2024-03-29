public class QNode{
    int data;
    QNode next;

    public QNode(int data){
        this.data = data;
        this.next = null;
    }    
}
public class Queue {
    QNode front;
    QNode rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        QNode newNode = new QNode(data);
        if(front == null || rear == null){
            newNode.next = null;
            front = newNode;
            rear = newNode;
        }else{
            QNode currNode = front;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            rear = newNode;
        }
    }

    public int deQueque(){
        int deQuequeData;
        if(front == null || rear == null){
            System.out.println("Can not dequeue.. Queue is empty.. ");
            return 0;
        }else{
            deQuequeData = front.data;
            front = front.next;
            return deQuequeData;
        }
    }

    public int peek(){
        int deQueuePeek;
        if(front == null || rear == null){
            System.out.println("Can not peek.. Queue is empty.. ");
            return 0;
        }else{
            deQueuePeek = front.data;
            return deQueuePeek;
        }
    }

    public void print(){
        if(front == null || rear == null){
            System.out.println("Can not print.. Queue is empty.. ");
            return;
        }else{
            QNode currNode = front;
            while (currNode != null) {
                System.out.print(currNode.data + "--->");
                currNode = currNode.next;
            }
        }
    }

    public boolean isEmpty(){
        if(front == null || rear == null){
            return true;
        }
        else{
            return false;
        }
    }    
}
