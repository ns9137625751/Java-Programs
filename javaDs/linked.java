import java.util.Scanner;
class linkedList
{
  private class node
  {
    int data;
    node next;
  }
  private node start;
  public static int count=0;
  linkedList()
  {
    start=null;
  }
  public void insertAtBeg(int data)
  {
    node n=new node();
    n.data=data;
    if(start==null)
    {
      start=n;
      n.next=null;
    }
    else
    {
      n.next=start;
      start=n;
    }
    count++;
    System.out.println("element insert at begining!!");
  }
  public void insertAtLast(int data)
  {
    node n=new node();
    n.data=data;
    n.next=null;
    if(start==null)
    {
      start=n;
    }
    else
    {
      node temp=new node();
      temp=start;
      while(temp.next!=null)
        {
          temp=temp.next;
        }
      temp.next=n;
    }
    count++;
  }
  public void insertAtGivenPosition(int data,int pos)
  {
    if(count<pos)
    {
      System.out.println("position does not exsit!!");
      return;
    }
    else if(count==pos)
    insertAtLast(data);
    else if(count==0)
    insertAtBeg(data);
    else
    {

        node n=new node();
        n.data=data;
        node temp=new node();
        temp=start;
        for(int i=1;i<pos-1;i++)
        {
          temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }
    count++;
    System.out.println("element insert at:"+pos);
  }
  public void deleteAtBeg()
  {
    if(start==null)
     {
       System.out.println("linked list is empty!!");
       return;
     }
     else
     {
       start=start.next;
     }
     count--;
     System.out.println("element deleted at begining!!");
  }
  public void deleteAtEnd()
  {
    if(start==null)
    {
      System.out.println("linked list is empty!!");
      return;
    }
    else
    {
        node temp=new node();
        temp=start;
        for(int i=1;i<count-1;i++)
        temp=temp.next;
        temp.next=null;
    }
    count--;
    System.out.println("element deleted at end!!");
  }
  public void deleteAtGivenPosition(int pos)
  {
    if(count<pos)
    {
        System.out.println("position does not exist!!");
        return;
    }
    else if(count==pos)
    deleteAtEnd();
    else if(count==0)
    deleteAtBeg();
    else
    {
      node temp=new node();
      temp=start;
      node temp1=new node();
      temp1=start.next;
      for(int i=1;i<pos-1;i++)
      {
        temp=temp.next;
        temp1=temp1.next;
      }
      temp.next=temp1.next;
    }
    System.out.println("element deleted at position:"+pos);
    count--;
  }
  public void display()
  {
    node temp=new node();
    temp=start;
    while(temp.next!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println(temp.data);
  }
  public void nodeCount()
  {
    System.out.println("node present in linked list is:"+count);
  }
public void sorting()
{
    node temp=new node();
    temp=start;
    for(int i=1;i<count-1;i++)
    {
      for(temp=start;temp.next!=null;temp=temp.next)
      {
        node temp1=new node();
        temp1=temp.next;
        if(temp.data>temp1.data)
        {
          int a=temp.data;
          temp.data=temp1.data;
          temp1.data=a;
        }
        else continue;
      }
    }
 }
 public void search(int data)
 {
   node temp=new node();
   temp=start;
   if(start==null)
   {
     System.out.println("Linked list is empty!!");
     return;
   }
   int i=0;
   while(temp.next!=null)
   {
     i++;
     if(temp.data==data)
     {
       System.out.println("element is present in :"+i+" positon");
       return;
     }
     temp=temp.next;
   }
   if(temp.data==data&&temp.next==null)
   {
     System.out.println("element is present in :"+i+" positon");
   }
 else
 {
   System.out.println("element is not present in linked list");
 }
 }
 public void create()
 {
   int i=0,choice;
   Scanner input=new Scanner(System.in);
   do {
        i++;
     System.out.println("Enter the element which you want to insert at "+i+" node");
     int data=input.nextInt();
     insertAtLast(data);
     System.out.printf("element are inserted at %d node:\n",i);
     System.out.printf("press 1 for create another node or 0 for not(1/0):\n");
     choice=input.nextInt();
     while(choice!=1&&choice!=0)
     {
        System.out.printf("enter the coorect option:\n");
        System.out.printf("press 1 for create another node or 0 for not create another node(1/0):\n");
        choice=input.nextInt();
     }
   } while (choice==1);
 }
public void reverse()
{
  reverse(start);
}
private void reverse(node s)
{
  if(s.next!=null)
  reverse(s.next);
    System.out.print(s.data+"\t");
    return;
}
}
class Linked
{
  public static void main(String[] argv)
  {
    linkedList list=new linkedList();
    int n,ch,pos;
    boolean b=true;
    while(b)
    {
      System.out.printf("\n\n\n\n");
  System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*       _______Java Singly Linked List______        *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*      (1) for create linked list                   *\n");
  System.out.printf("\t\t*      (2) for inserting                            *\n");
  System.out.printf("\t\t*      (3) for deleting                             *\n");
  System.out.printf("\t\t*      (4) for searching                            *\n");
  System.out.printf("\t\t*      (5) reverse print in singly linked list      *\n");
  System.out.printf("\t\t*      (6) for display singly linked list           *\n");
  System.out.printf("\t\t*      (7) for sorting linked list                  *\n");
  System.out.printf("\t\t*      (8) for exit.....                            *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t*                                                   *\n");
  System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
  Scanner input=new Scanner(System.in);
  int choice=input.nextInt();
  switch(choice)
  {
      case 1: list.create();
             break;
      case 2:
      {    while(b)
      {
      System.out.printf("\n\n\n\n");
System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*     (1) for insert at begining                    *\n");
System.out.printf("\t\t*     (2) for insert at last                        *\n");
System.out.printf("\t\t*     (3) for insert at nth position                *\n");
System.out.printf("\t\t*     (4) for insert after position                 *\n");
System.out.printf("\t\t*     (5) for insert before position                *\n");
System.out.printf("\t\t*     (6) for display singly linked list            *\n");
System.out.printf("\t\t*     (7) for main menu                             *\n");
System.out.printf("\t\t*     (8) for exit...                               *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t*                                                   *\n");
System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
          ch=input.nextInt();
        switch(ch)
        {
          case 1: System.out.printf("enter the element which you insert at node1:\n");
                  n=input.nextInt();
                  list.insertAtBeg(n);
                  break;
          case 2: System.out.printf("enter the element which you insert at last node:\n");
                  n=input.nextInt();
                  list.insertAtLast(n);
                  System.out.println("element insert at end!!!! ");
                  break;
          case 3: System.out.printf("enter the position of node:\n");
                  pos=input.nextInt();
                  System.out.printf("enter the element which you insert at %d position:\n",pos);
                  n=input.nextInt();
                  list.insertAtGivenPosition(n,pos);
                  break;
          case 4: System.out.printf("enter the position of node for inserting element after node:\n");
                   pos=input.nextInt();
                  System.out.printf("enter the element:\n");
                  n=input.nextInt();
                  list.insertAtGivenPosition(n,pos+1);
                  break;
          case 5: System.out.printf("enter the position of node for inserting element before node:\n");
                   pos=input.nextInt();
                  System.out.printf("enter the element:\n");
                  n=input.nextInt();
                  list.insertAtGivenPosition(n,pos-1);
                  break;
          case 6: list.display();
                 char c=input.next().charAt(0);
                  break;
          case 7:  break;
          case 8: System.out.printf("thank you......\n\n\n\n\n\n\n");
                   b=false;
                   break;
          default : System.out.printf("please enter correct choice:\n");

  }
  if(ch==7)
  break;
}

    break;  }
      case 3: {    while(b)
                   {
                  System.out.printf("\n\n\n\n");
System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*      (1) for delete at begining                             *\n");
System.out.printf("\t\t*      (2) for delete at last                                 *\n");
System.out.printf("\t\t*      (3) for delete at nth position                         *\n");
System.out.printf("\t\t*      (4) for delete after position                          *\n");
System.out.printf("\t\t*      (5) for delete before position                         *\n");
System.out.printf("\t\t*      (6) for display singly linked list                     *\n");
System.out.printf("\t\t*      (7) for main menu                                      *\n");
System.out.printf("\t\t*      (8) for exit.....                                      *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t*                                                             *\n");
System.out.printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
          ch=input.nextInt();
            switch(ch)
                    {
                      case 1: list.deleteAtBeg();
                              break;
                      case 2: list.deleteAtEnd();
                              break;
                      case 3: System.out.printf("enter the position which you delete in link list:\n");
                              n=input.nextInt();
                              list.deleteAtGivenPosition(n);
                              break;
                      case 4: System.out.printf("enter the positon of node for deleting element after position:\n");
                              n=input.nextInt();
                              list.deleteAtGivenPosition(n+1);
                              break;
                      case 5: System.out.printf("enter the position of node for deleting element before position:\n");
                              n=input.nextInt();
                              list.deleteAtGivenPosition(n-1);
                              break;
                      case 6: list.display();
                             char c=input.next().charAt(0);
                               break;
                      case 7: break;
                      case 8:System.out.printf("thank you......\n\n\n\n\n\n\n");
                              b=false;
                               break;
                      default : System.out.printf("please enter correct choice:\n");
                                break;
                              }
                              if(ch==7)
                              break;
                               }
                               break;
                          }
               case 4: System.out.printf("enter the element which you search in linked list:\n");
                      n=input.nextInt();
                      list.search(n);
                       break;
                case 6: list.display();
                char c=input.next().charAt(0);
                        break;
                case 8:System.out.printf("thank you......\n\n\n\n\n\n\n");
                       b=false;
                         break;
                default : System.out.printf("please enter coorect choice:\n");
                          break;
                case 5: list.reverse();
                        String a=input.next();
                        break;
                case 7: list.sorting();
                        break;
  }


    }
  }
}
