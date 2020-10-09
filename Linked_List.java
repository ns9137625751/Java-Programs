//https://www.facebook.com/zawed.akhtar.7923/posts/965508713932178
//Subscribed by MySirG.com
import java.util.*;
import java.lang.*; 
class Node
 {
  private int data;
  private Node next;
  
  public Node()
 {
	 data=0;
	 next=null;
 }
 public Node(int d,Node n)
 {
	 data=d;
	 next=n;
 }
 public void setData(int d)
 {
   data=d;
 }
 public void setNext(Node n)
 {
  next=n;
 }
 public int getData()
 {
  return(data);
 }
 public Node getNext()
 {
	 return(next);
  }
 }
 class LinkedList
 {
	 private int size;
	 private Node start;
 public LinkedList()
 {
	 size=0;
	 start=null;
 }
 public boolean isEmpty()
 {
	 if(start==null)
		 return(true);
	      else
		 return(false);
 }
 public int getListSize()
 {
	return(size);
 }
 public void viewList()
 {
	 Node t;
	if(isEmpty())
	{
	  System.out.println("List is empty");
	}
	else
	{
	 t=start;
	 for(int i=1;i<=size;i++)
	 {
		System.out.print(" "+t.getData());
		t=t.getNext();
	 }
	}
	System.out.print("\n");
  }
  public void insertAtFirst(int val)
  {
	 Node n;
	 n=new Node();
	 n.setData(val);
	 n.setNext(start);
	 start=n;
	 size=size+1;
  }
  public void insertAtLast(int val) 
  {
	 Node n,t;
	 n=new Node();
	 n.setData(val);
	 if(start==null)
	 {
		 start=n;
	 }
	 else
	 {
		t=start;
		while(t.getNext()!=null)
		{
		  t=t.getNext();
		}
	 t.setNext(n);
	 }
	 size=size+1;
  }
  public void insertAtPos(int val,int pos)
  {
	Node n,t;
	if(pos==1)
	{
		insertAtFirst(val);
	}
	else if(pos==size+1)
    {
		insertAtLast(val);
	}
	else if(pos>1 && pos<=size)
	{
	    n=new Node(val,null);
		t=start;
		for(int i=1;i<pos-1;i++)
		{
			t=t.getNext();
		}
		n.setNext(t.getNext());
		    t.setNext(n);
			size=size+1; 
	    }			
       else
	   { 
	   System.out.println("Insertion not possible at position" +pos);
   } 
 }
  public void deleteFirst()
  {
	if(start==null)
	{
	  System.out.println("List is empty");
	}
	else
	{
		start=start.getNext();
		size=size-1;
	}
  }
  public void deleteLast()
  {
	if(start==null)
	{
	  System.out.println("List is empty");
	}
	else if(size==1)
	{
	  start=null;
	  size=size-1;
	}
	else
	{
    Node t;
    t=start;
    for(int i=1;i<size-1;i++)
	{
     t=t.getNext();
    }
    t.setNext(null);
	}
	size=size-1;
  }	
  public void deleteAtPos(int pos)
  {
	if(start==null)
	  System.out.println("List is empty");
    else if(pos<1 || pos>size)
	  System.out.println("Invalid Position");
    else if(pos==1)
      deleteFirst();
    else if(pos==size)
      deleteLast();
    else
	{
     Node t,t1;
     t=start;
     for(int i=1;i<pos-1;i++)
      t=t.getNext();
    t1=t.getNext();
	t.setNext(t1.getNext());
	size--;
    }
  }
 }		
 public class Test
 {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 LinkedList list=new LinkedList();
		 boolean flag=true;
		 while(flag)
		 {
		 System.out.println("1.Add item to the list of start");
		 System.out.println("2.Add item to the list of last");
		 System.out.println("3.Add item to the list of position");
		 System.out.println("4.Delete First item from the list");
		 System.out.println("5.Delete Last item from the list");
		 System.out.println("6.Delete item from the list which given position");
		 System.out.println("7.View List");
		 System.out.println("8:Exit");
		 System.out.println("Enter your choice");
		 int ch=sc.nextInt();
		 int position,value;
		 switch(ch)
		 {
			 case 1:
			        System.out.println("Enter value of list item:");
					value=sc.nextInt();
					list.insertAtFirst(value);
					break;
			 case 2:
			        System.out.println("Enter value of list item:");
					value=sc.nextInt();
					list.insertAtLast(value);
					break;
			 case 3:
			        System.out.println("Enter the position:");
					position=sc.nextInt();
					System.out.println("Enter value of list item:");
					value=sc.nextInt();
					list.insertAtPos(value,position);
					break;
			 case 4:
			        list.deleteFirst();
					break;
			 case 5:
			        list.deleteLast();
					break;
			 case 6:
			        System.out.println("Enter the position:");
					position=sc.nextInt();
					list.deleteAtPos(position);
					break;
			 case 7:
			        list.viewList();
					break;
			default:
			   System.out.println("Invalid Choice. . . .");
			
		 
	  }
    }
  }
 }
