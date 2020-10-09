package tree;
import java.util.Scanner;
class Bst
{
    Node root; 
     class Node
   {
    Node left;
    int data; 
    Node right;
   }
   Bst()
   {
     root=null;
   }
  public void insert(int data)
  {
    Node node=new Node();
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
        if(temp.right==null)
        temp.right=node;
        
        temp=temp.right;
      }
      while(temp.data>data)
      {
      
        if(temp.left==null)
        temp.left=node;
          
        temp=temp.left;
      }
    }
    else if(root.data>data)
    {
      Node temp=root;
      while(temp.data>data)
      {
        if(temp.left==null)
        temp.left=node;
        temp=temp.left;
      }
      while(temp.data<data)
      {
        if(temp.right==null)
        temp.right=node;
        
        temp=temp.right;
      }
    }
    else System.out.println("Duplicate not allowed in tree");
  }
  public void delete(int data)
  {
      if(root.data==data)
      {
          if(root.right==null&&root.left==null)
              root=null;
          else if(root.right==null&&root.left!=null)
          root=root.left;
          else if(root.right!=null&&root.left==null)
              root=root.right;
          else if(root.right!=null&&root.left!=null)
          {
              Node temp=root.left;
              root.data=temp.data;
              root.left=temp.left;
              Node temp2=root.right;
              while(temp2.left!=null)
               temp2=temp2.left;
              temp2.left=temp.right;
          }
      }
      else if(root.data<data)
      {
          Node temp=root.right;
          if(temp.data!=data&&temp!=null)
          {
              while(temp.data<data)
              {
                  
              }
          }
         /* Node temp=root.right;
          if(temp.data==data)
          {
               if(temp.right==null&&temp.left==null)
             temp=null;
         else if(temp.right==null&&temp.left!=null)
         temp=temp.left;
         else if(temp.right!=null&&temp.left==null)
             temp=temp.right;
         else if(temp.right!=null&&temp.left!=null)
         {
             Node temp1=temp.left;
             temp.data=temp.data;
             temp.left=temp.left;
             Node temp2=temp.right;
             while(temp2.left!=null)
              temp2=temp2.left;
             temp2.left=temp.right;
         }
       }
           */   
      }
  }
  public void display(Node test)
  {
      if(test==null)
          return;
    System.out.println(test.data);
    display(test.left);
    display(test.right);
  }
}
class TestTree
{
  public static void main(String args[])
  {
        boolean check;
      Scanner sc=new Scanner(System.in);
    Bst tree=new Bst();
    do {
        System.out.println("Enter the element which you want to insert in tree");
        int n;
        n=sc.nextInt();
        tree.insert(n);
        System.out.println("Do you want to insert another element");
        n=sc.nextInt();
        if(n==1)
        check=true;
        else check=false;
      } while (check);
      tree.display(tree.root);
       System.out.println("Enter the element which you want to delete in tree");
        int n;
        n=sc.nextInt();
        tree.delete(n);
        System.out.print("after deleteing element in tree");
            tree.display(tree.root);  

  }
}
