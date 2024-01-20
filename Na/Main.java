public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.print();
        System.out.println();
        list.insertBack(50);
        list.print();


    }
}
