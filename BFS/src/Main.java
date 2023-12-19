public class Main {

    public static void main(String[] args) {
        AdjList adj = new AdjList(5);

        adj.insertEd(0, 1);
        adj.insertEd(1, 2);
        adj.insertEd(2, 2);
        adj.insertEd(3, 3);
        adj.insertEd(2, 4);
        adj.insertEd(3, 4);
        adj.insertEd(4, 4);
        adj.insertEd(2, 1);
        adj.insertEd(4, 1);
        adj.insertEd(2, 1);

        adj.BFS(1);

    }
    
}
