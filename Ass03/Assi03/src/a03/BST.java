package a03;

public class BST {
	class Node { 
        String key; 
        Node left, right; 
   
        public Node(String data){ 
            key = data; 
            left = right = null; 
        } 
    } 
    // BST root node 
    Node root; 
  
   // Constructor for BST =>initial empty tree
    	BST(){ 
        root = null; 
    } 
   
    // insert a node in BST 
    void insert(String key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, String key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        int check = key.compareTo(root.key);
        if (check < 0)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (check > 0)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    } 
    
    boolean search(Node root, String key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, String key) 
    { 
        // Base Cases: root is null or key is present at root 
        if (root==null || key.compareTo(root.key)==0) 
            return root; 
        // val is greater than root's key 
        int check = key.compareTo(root.key);
        if (check <	 0) 
            return search_Recursive(root.left, key); 
        // val is less than root's key 
        return search_Recursive(root.right, key); 
    }
 
// method for inorder traversal of BST 
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
}
