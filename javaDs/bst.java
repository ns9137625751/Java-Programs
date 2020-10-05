java.util.Scanner;
class Bst
{
class Node
   {
    Node left;
    int data;
    Node right;
   }
    Node root;
   Bst()
   {
     root=null;
   }
  public void insert(int data)
  {
    Node node;
    node.data=data;
    node.left=null;
    node.right=null;
    if(root==null)
    root=node;
    else if(root.data<data)
    {
      Node temp=root;
      while(temp.data<data)
      {
        temp=temp.right;
        if(temp==null)
        temp=node;
      }
      while(temp.data>data)
      {
        temp=temp.left;
        if(temp==null)
        temp=node;
      }
    }
    else if(root.data>data)
    {
      Node temp=root;
      while(temp.data>data)
      {
        temp=temp.left;
        if(temp==null)
        temp=node;
      }
      while(temp.data<data)
      {
        temp=temp.right;
        if(temp==null)
        temp=node;
      }
    }
    else System.out.println("Duplicate not allowed in tree");
  }
  public void display(Node root)
  {
    if(root==null)
    return;
    System.out.println(root.data);
    display(root.left);
    display(root.right);
  }
}
class TestTree
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
    Bst tree=new Bst();
    do {
        System.out.println("Enter the element which you want to insert in tree");
        int n;
        n=sc.nextInt();
        tree.insert(n);
        System.out.println("Do you want to insert another element");
        n=sc.nextInt();
        boolean check;
        if(n==1)
        check=true;
        else check=false;
      } while (check);
      tree.display(tree.root);
  }
}
