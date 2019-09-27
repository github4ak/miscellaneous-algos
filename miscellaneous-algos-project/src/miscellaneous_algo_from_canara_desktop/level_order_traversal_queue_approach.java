package miscellaneous_algo_from_canara_desktop;


import java.util.*;

public class level_order_traversal_queue_approach{

class Node{
    int data;
    Node left;
    Node right;
    Node(int key){
        data = key;
        left = null;
        right = null;
    }
}

class Tree{
    Node root;
    Tree(){
        root = null;
    }
    
    void printLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            
            if(temp.left!=null){
                queue.add(temp.left);
            }
            
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }
    
    public void main(String args[]){
        Tree t = new Tree();
        t.root = new Node(1); 
        t.root.left = new Node(2); 
        t.root.right = new Node(3); 
        t.root.left.left = new Node(4); 
        t.root.left.right = new Node(5); 
		
		System.out.println("The level order traversal of the tree is");
		
		printLevelOrder(t.root);
    }
}
}