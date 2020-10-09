import java.util.Scanner;
class Wipro28
{
  public static void main(String args[])
  {
    System.out.print("Enter the size of an array:");
    Scanner input=new Scanner(System.in);
    Integer size=input.nextInt();
    System.out.print("enter array elements:");
    Integer arr[]=new Integer[size];
    for(Integer i=0;i<size;i++)
    arr[i]=input.nextInt();
    for(Integer i=0;i<size;i++)
    {
      for(Integer j=i-1;j>=0;j--)
      {
        if(arr[i]==arr[j])
        {
          Integer temp=del(i,arr,size);
          size=temp;
        }
        else continue;
      }
    }
    for(Integer i=0;i<size;i++)
    System.out.print(arr[i]+"\t");
  }
  static int del(Integer indexNo,Integer arr[],Integer size)
  {
    for(Integer i=indexNo;i<size-1;i++)
    arr[i]=arr[i+1];
     return(size-1);
  }
}
