class Node 
{
    int key;
    Node left, right;
    public Node(int item) 
    {
      key = item;
      left = right = null;
    }
}

public class BST 
{
  Node root;
  BST() 
  {
    root = null;
  }
  
  void insert(int key) 
  {
    root = insertKey(root, key);
  }
  
  Node insertKey(Node root, int key) 
  {
    if (root == null) 
    {
      root = new Node(key);
      return root;
    }
    if (key < root.key)
      root.left = insertKey(root.left, key);
    else if (key > root.key)
      root.right = insertKey(root.right, key);
    return root;
  }

  void inorder() 
  {
    inorderRec(root);
  }

  void inorderRec(Node root) 
  {
    if (root != null) 
    {
      inorderRec(root.left);
      System.out.print(root.key + " ");
      inorderRec(root.right);
    }
  }

  void preorder() 
  {
    preorderRec(root);
  }
  void preorderRec(Node root) 
  {
    if (root != null) 
    {
      System.out.print(root.key + " ");
      preorderRec(root.left);
      preorderRec(root.right);
    }
  }
  
  void postorder() 
  {
    postorderRec(root);
  }
  void postorderRec(Node root) 
  {
    if (root != null) 
    {
      preorderRec(root.left);
      preorderRec(root.right);
      System.out.print(root.key + " ");
    }
    System.out.println();
  }
  void deleteKey(int key) 
  {
    root = deleteRec(root, key);
  }
  Node deleteRec(Node root, int key) 
  {
    if (root == null)
      return root;
    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else 
    {
      // If The Node Is With Only One Child Or No Child:-
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // If The Node Has Two Children:-
      root.key = minValue(root.right);

      // Delete The Inorder Successor:-
      root.right = deleteRec(root.right, root.key);
    }
    return root;
  }

  // Find The Inorder Successor:-
  int minValue(Node root) 
  {
    int minv = root.key;
    while (root.left != null) 
    {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }

  int maxValue()
  {
    Node curr = root;
    while (curr.right != null)
        curr = curr.right;
    return curr.key;
  }
  public static void main(String[] args) 
  {
    BST bst = new BST();
    bst.insert(8);
    bst.insert(3);
    bst.insert(1);
    bst.insert(6);
    bst.insert(7);
    bst.insert(10);
    bst.insert(14);
    bst.insert(4);

    System.out.print("Inorder Traversal:- ");
    bst.inorder();

    System.out.println("\n\nAfter Deleting 10:- ");
    bst.deleteKey(10);
    
    System.out.print("Inorder Traversal:- ");
    bst.inorder();
    System.out.println();
    
    System.out.print("Preorder Traversal:- ");
    bst.preorder();
    System.out.println();
    
    System.out.print("Postorder Traversal:- ");
    bst.postorder();
    System.out.println();
 
    System.out.println("Maximum Value:- "+ bst.maxValue());
  }
}