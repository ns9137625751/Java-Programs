import java.util.Scanner;
class Wipro23
{
  public static void main(String args[])
  {
    System.out.print("Enter the size of an array:");
    Scanner input=new Scanner(System.in);
    Integer size=input.nextInt();
    Integer arr[]=new Integer[size];
    Integer min=2147483647,max=0;
    System.out.print("Enter array elements:");
    for(Integer i=0;i<size;i++)
    {
      arr[i]=input.nextInt();
      if(max<arr[i])
      max=arr[i];
      if(min>arr[i])
      min=arr[i];
    }
    System.out.println("The maximum no in array is:"+max);
    System.out.println("the minimum no in array is:"+min);
  }
}
