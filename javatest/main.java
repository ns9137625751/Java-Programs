class linkedList
{
  private class node
  {
    int data;
    node next;
  }
  node start;
  linkedList()
  {
    start=null;
  }
  public void insertAtBeg(int item)
  {
        node n=new node();
        n.data=item;
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
}
class Main
{
  public static void main(String... argv)
  {
    linkedList l=new linkedList();
    l.insertAtBeg(10);
      l.insertAtBeg(20);
        l.insertAtBeg(30);
          l.insertAtBeg(40);
            l.insertAtBeg(50);
    l.display();
  }
}
