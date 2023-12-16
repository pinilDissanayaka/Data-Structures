class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class LinkedList {
    Node head;

    public Node insert(int data){
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
        return newNode;
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

    public void inserAfter(Node node, int data){
        Node newNode = new Node(data);

        if(node == null){
            return;
        }else{
            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

    }

    public void deleteNode(Node node){
        if(node == null){
            return;
        }else{
            Node currNode = head;
            while (currNode.next != node) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }
    }

    public void rotete(){
        Node currNodePre = null;
        Node currNode = head;
        Node currNodeNext = null;

        while (currNode != null) {
            currNodeNext = currNode.next;
            currNode.next = currNodePre;
            currNodePre = currNode;
            currNode = currNodeNext;
        }

        head = currNode;
    }
}


