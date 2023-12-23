class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

public class LinkedList {
    Node head;
    
    public Node add(int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            newNode.next = null;
            return newNode;
        }else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.next = null;
            return newNode;
        }
    }
    public void printElement(){
        Node currNode = head;
        while (currNode != null) {
            System.out.println("|");
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void isertFront(LinkedList list, int data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            newNode.next = null;
        }else{
            newNode.next = list.head;
            list.head = newNode;
        }
    }

    public Node inserPoint(Node node, int data){
        Node newNode = new Node(data);

        if(node == null){
            return null;
        }else{
            Node curNode = head;
            while (curNode != node) {
                curNode = curNode.next;
            }

            newNode.next = curNode.next;
            curNode.next = newNode;
            return newNode;
        }
    }
    public void insertPosition(int pos, int data){
        Node newNode = new Node(data);
        if(pos < 0){
            return;
        }
        else if (pos == 0) {
            newNode.next = head;
            head = newNode;
        }else{
            Node curNode = head;
            int temp = 0;
            while (temp != pos) {
                if(curNode == null){
                    return;
                }
                else{
                    curNode = curNode.next;
                    temp = temp +1;
                }
            }
            newNode.next = curNode.next;
            curNode.next = newNode;
        }
    }
}

