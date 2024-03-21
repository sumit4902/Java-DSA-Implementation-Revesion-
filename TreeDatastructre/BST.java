package TreeDatastructre;

public class BST {
    
  public static class Node{
    Node left;
    int data;
    Node right;
    Node( int data)
    {
       this.data=data;
       this.right=null;
       this.left=null;
    }
  } 
    public static class BSTtree{

        Node buildTree(Node root,int value)
        {

          if(root==null)
          {
             root = new Node(value);
            return root;
          }
            if(root.data<value)
            {
                root.left=buildTree(root.left, value);
            }
          else
            {
                root.right=buildTree(root.right, value);
            }
            return root;
        }
      
        void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }

        void preorder(Node root)
       {
          if(root==null)
          {
            return;
          }
          System.out.print(root.data);
          preorder(root.left);
          preorder(root.right);
       }
       void postorder(Node root)
       {
          if(root==null)
          {
            return;
          }
          postorder(root.left);
          postorder(root.right);
          System.out.print(root.data);
       }
    }

public static void main(String [] args)
{
    int [] nodes = {5,1,3,8,9};
    System.out.println("BST");

    BSTtree tree = new BSTtree();
    Node root = null;
    for(int i=0;i<nodes.length;i++)
    {
     root = tree.buildTree(root, nodes[i]);
    }
    tree.inorder(root);
     System.out.println();
    tree.preorder(root);
    System.out.println();
    tree.postorder(root);
    // level order is remaining //
}

     
}
