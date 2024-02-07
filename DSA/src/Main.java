public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();

        Node n1 = dlist.insert(10, 'A');
        Node n2 = dlist.insert(20, 'B');
        Node n3 = dlist.insert(30, 'C');
        Node n4 = dlist.insert(40, 'D');
        Node n5 = dlist.insert(50, 'E');
        Node n6 = dlist.insert(60, 'F');

        dlist.print();
        System.out.println();

        dlist.delete(n3);
        dlist.print();

    }
        
}

