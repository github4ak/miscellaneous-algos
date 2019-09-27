package miscellaneous_algo_from_canara_desktop;

public class level_order_traversal_tree_naive{

class Node{
    int value;
    Node left;
    Node right;
    
    Node(int key){
        value = key;
        left = null;
        right = null;
    }
}

class Tree{
Node root;

Tree(){
    root = null;
}

//Print given level
//height

int getHeight(Node root){
    if(root == null){
        return 0;
    }
    else{
        int lheight = getHeight(root.left);
        int rheight = getHeight(root.right);
        //Got to use the larger one
        if(lheight > rheight){
            return lheight+1;
        }
        return rheight+1;
    }
}

void printLevelOrder(){
    int h = getHeight(root);
    //Since +1 in the height, start iterating from 1
    for(int i=1; i<=h; i++){
        printGivenLevel(root,i);
    }
}

void printGivenLevel(Node root,int level){
    //Double base case
    if(root == null){
        return ;
    }
    if(level == 1){
        System.out.print(root.value+" ");
    } 
    else if(level > 1){
        printGivenLevel(root.left,level-1);
        printGivenLevel(root.right,level-1);
    }
}

public void main(String args[]){
    Tree t = new Tree();
    t.root= new Node(1); 
    t.root.left= new Node(2); 
    t.root.right= new Node(3); 
    t.root.left.left= new Node(4); 
    t.root.left.right= new Node(5);
    
    System.out.println("The level order traversal of the tree is");
    t.printLevelOrder();
    
}

}
}