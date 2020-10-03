import java.util.Scanner;
class Wipro24
{
  public static void main(String args[])
  {
     System.out.print("Enter array size:");
     Scanner input=new Scanner(System.in);
     Integer size=input.nextInt();
     System.out.print("Enter array elements:");
     Integer arr[]=new Integer[size];
     for(Integer i=0;i<size;i++)
     arr[i]=input.nextInt();
     System.out.print("enter element to search in array:");
     Integer element=input.nextInt();
     for(Integer i=0;i<size;i++)
     if(arr[i]==element)
     {
       System.out.print("Element are present at index no:"+i);
       return;
     }
     System.out.print("Element are not present in array");
  }
}
