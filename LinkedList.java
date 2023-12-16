public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
    
        if(head == null){
            head = newNode;
        }else{
            Node currNode  = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;  
        }
    }

    public void print(){
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--");
            currNode = currNode.next;
        }
    }

    public void inserFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}


