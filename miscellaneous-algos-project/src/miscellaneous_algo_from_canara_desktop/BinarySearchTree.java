package miscellaneous_algo_from_canara_desktop;

public class BinarySearchTree{
    class Node{
        int key;
        Node left,right;
        Node(int value){
            key = value;
            left = right = null;
        }
    }
    
    Node root;
    
    BinarySearchTree(){
        root = null;
    }
    
    void insert(int value){
        root = insertRec(root,value);
    }
    
    Node insertRec(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        
        if(value > root.key){
            root.right = insertRec(root.right,value);
        } 
        else{
            root.left = insertRec(root.left,value);
        }
        
        return root;
    }
    
    void inorder(){
        inorderRec(root);
    }
    
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.key+"->");
            inorderRec(root.right);
        }
    }
    
    void delete(int value){
        root = deleteRec(root,value);
    }
    
    Node deleteRec(Node root, int value){
        if(root == null){
            return root;
        }
        
        if(value > root.key){
            root.right = deleteRec(root.right,value);
        }
        else if(value < root.key){
            root.left = deleteRec(root.left,value);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            //Replace it with inorder successor
            root.key = getInorderSuccessor(root.right);
            
            //Delete the inorder successor
            root.right =  deleteRec(root.right,root.key);
        }
        
        return root;
    }
    
    int getInorderSuccessor(Node root){
        int min = root.key;
        while(root.left != null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }
    
    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50); 
        bst.insert(30); 
        bst.insert(20); 
        bst.insert(40); 
        bst.insert(70); 
        bst.insert(60); 
        bst.insert(80); 
        
        System.out.println("The inorder traversal of the bst is ");
        bst.inorder();
        
        System.out.println("\nDelete 40");
        bst.delete(40);
        
        System.out.println("The inorder traversal of the bst is ");
        bst.inorder();
    }
}
