public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        //list.print();
        System.out.println();

        list.rotete();

        list.print();
    }
    
}
