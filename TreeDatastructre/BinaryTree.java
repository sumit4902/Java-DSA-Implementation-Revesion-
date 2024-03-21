package TreeDatastructre;


public class BinaryTree {
    
    public static class Node {
        Node left;
        int data;
        Node right;
      Node(  int data)
      {
        this.left=null;
        this.data=data;
        this.right=null;
      }
    }
    public static class Binarytree {
      
  
      public static int i=-1;
      Node buildtree(int [] nodes)
    {  
        i++;
        // base condition 
        if(nodes[i]==-1)
        {
            return null;
        }
       // WE have to write the code for the single level 
       Node root = new Node(nodes[i]);
       root.left = buildtree(nodes);
       root.right=buildtree(nodes);
        return root;
    }
    
    // preOrder traversal 
    void preordertraversal(Node root)
    {
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

    void inordertraversal(Node root)
    {
        if(root==null)
       {
        return ;
       }
       inordertraversal(root.left);
       System.out.print(root.data);
       inordertraversal(root.right);
    }

    void postordertraversal(Node root)
    {
        if(root==null)
        {
            return ;
        }
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.print(root.data);
    }
 }



 
    public static void main( String [] args)
    {
       int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
         tree.preordertraversal(root);
         System.out.println("\nInorderOrdertraversal");
         tree.inordertraversal(root);
         System.out.println("\nPostorderTraversal");
         tree.postordertraversal(root);
         
    }
     
}
