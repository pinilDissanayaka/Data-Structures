public class Main {
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.push(15);
            q.push(16);
            q.push(17);
            q.push(18);
            q.push(19);

            System.out.println(q.pop());
            q.printQueque();

            q.push(20);
            System.out.println();
            q.printQueque();






    }
}
