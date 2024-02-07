class Node{
    int data;
    char data1;
    Node next;
    Node prev;

    public Node(int data, char data1){
        this.data = data;
        this.data1 = data1;
        this.next = null;
        this.prev = null;
    }    
}

public class DoublyLinkedList {
    Node head;
    public Node insert(int data, char data1){
        Node newNode = new Node(data, data1);
        if(head == null){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }else{
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.prev = currNode;
            newNode.next = null;
        }
        return newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("can not print... linkedlist is empty...");
            return;
        }else{
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + ",");
                System.out.print(currNode.data1);
                System.out.print("-->");
                currNode = currNode.next;
            }
        }
    }

    public void insertFront(int data, char data1){
        Node newNode = new Node(data, data1);

        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void inserRear(int data , char data1){
        Node newnode = new Node(data, data1);
        if(head == null){
           head = newnode;
           newnode.next = null;
           newnode.prev = null; 
        }
        else{
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newnode;
            newnode.prev = currNode;
            newnode.next = null;
        }
    }

    public void inserAfter(Node node, int data, char data1){
        if(node ==null){
            return;
        }else{
            Node newNode = new Node(data, data1);

            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }

            newNode.next = currNode.next;
            currNode.next = newNode;
            newNode.prev = currNode;

            if(newNode.next != null){
                newNode.next.prev = newNode;
            }
        }
    }

    public void insertBefore(Node node, int data, char data1){
        if(node == null){
            return;
        }
        else{
            Node newNode = new Node(data, data1);
            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }

            newNode.next = currNode;
            newNode.prev = currNode.prev;
            currNode.prev.next = newNode;

            if(newNode.next == null){
                head = newNode;
            }else{
                newNode.next.prev = newNode;
            }
        }
    }

    public void delete(Node node){
        if(node == null){
            return;
        }else if (node == head) {
            node.next.prev = null;
            head = node.next;            
        }else{
            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }
            
            currNode.next.prev = currNode.prev;
            currNode.prev.next = currNode.next;

        }

        }

    }