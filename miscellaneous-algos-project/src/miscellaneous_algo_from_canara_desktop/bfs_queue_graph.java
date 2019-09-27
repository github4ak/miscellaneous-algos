package miscellaneous_algo_from_canara_desktop;

import java.util.*;

public class bfs_queue_graph{
    private int v;
    private LinkedList<Integer> adjList[];
    
    @SuppressWarnings("unchecked")
	bfs_queue_graph(int vertices){
        v = vertices;
        adjList = new LinkedList[v];
        
        for(int i=0;i<v;i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }
    
    void addEdge(int v,int w){
        adjList[v].add(w);
    }
    
    void BFS(int startingIndex){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        
        q.add(startingIndex);
        visited[startingIndex] = true;
        
        while(q.size()!=0){
            int temp = q.poll();
            System.out.print(temp+" ");
            
            Iterator<Integer> it = adjList[temp].listIterator();
            
            while(it.hasNext()){
                int n = it.next();
                if(!visited[n]){
                    visited[n] =  true;
                    q.add(n);
                }
            }
        }
    }
    
    public static void main(String args[]){
        bfs_queue_graph g = new bfs_queue_graph(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2);
    }
}