import java.util.*;
public class AdjList {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private Queue<Integer> queue;

    public AdjList(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        queue = new LinkedList<>();

        for(int i = 0; i < vertices; i++){
            adjList[i] = new LinkedList<>();
        }

    }

    public void insertEd(int v, int e){
        adjList[v].add(e);
    }

    public void BFS(int key){

        boolean visited[] = new boolean[vertices];
        int temp;
        visited[key] = true;

        queue.add(key);

        while (queue.size() != 0) {
            temp = queue.poll();

            System.out.print(key);

            for(int i = 0; i < adjList[key].size(); i++){
                temp = adjList[key].get(i);
                
                if(!visited[temp]){
                    queue.add(temp);
                    visited[temp] = true;
                }
            }
        }
    }
}