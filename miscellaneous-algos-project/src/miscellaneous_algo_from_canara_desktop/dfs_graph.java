package miscellaneous_algo_from_canara_desktop;

import java.util.*;

public class dfs_graph{
    private int v;
    private LinkedList<Integer> adjList[];
    
    @SuppressWarnings("unchecked")
	dfs_graph(int vertices){
        v = vertices;
        adjList = new LinkedList[v];
        
        for(int i=0;i<v;i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }
    
    void addEdge(int v,int w){
        adjList[v].add(w);
    }
    
    void DFS(){
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i] == false){
                DFSUtil(i,visited);
            }
        }
    }
    
    void DFSUtil(int index,boolean visited[]){
        visited[index] = true;
        System.out.print(index+" ");
        
        Iterator<Integer> it = adjList[index].listIterator();
        
        while(it.hasNext()){
            int temp = it.next();
            if(!visited[temp]){
                visited[temp] = true;
                DFSUtil(temp,visited);
            }
        }
    }
    
    public static void main(String args[]){
        dfs_graph g = new dfs_graph(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is the DFS - including disconnected components"); 
  
        g.DFS();
    }
}