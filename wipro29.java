import java.util.Scanner;
class Wipro29
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
    Integer sum=0,j;
    for(Integer i=0;i<size;i++)
    {
      if(arr[i]==6&&i!=size-1)
      {
        for(j=i;arr[j]!=7&&j<size&&arr[j+1]!=6;j++);
        if(arr[j]==7)
        i=j+1;
      }
      sum+=arr[i];
    }
  System.out.println(sum);
 }
}
