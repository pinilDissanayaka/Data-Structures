public class DoublyLinkedList {
    Node head;

    static class Node{
        int data;
        public Node prev;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = next;
        }
    }
    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
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

    }

    public void print(){
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
    }

    public void inserFront(int data){
        Node newNode = new Node(data);

        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        head = newNode;

    }

    public void inserAfter(Node node, int data){
        if(node == null){
            return;
        }else{
            Node newNode = new Node(data);

            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }

            newNode.next = currNode.next;
            currNode.next = newNode;
            newNode.prev = currNode;

            if(newNode.next == null){
                return;
            }else{
                newNode.next.prev = newNode;
            }
        }
    }

    public void inserBefore(Node node, int data){
        if(node == null){
            return;
        }
        else{
            Node newNode = new Node(data);
            Node currNode = head;
            while (currNode != node) {
                currNode = currNode.next;
            }

            newNode.next = currNode;
            newNode.prev = currNode.prev;
            currNode.prev = newNode;

            if(newNode.prev == null){
                head = newNode;
            }else{
                newNode.prev.next = newNode;
            }
        }
    }

    public void delete(Node node){
        if(node == null){
            return;
        }else{
            Node currNode = head;
            while(currNode != node){
                currNode = currNode.next;
            }

            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
        }
    }    
}
