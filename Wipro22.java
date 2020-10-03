import java.util.Scanner;
class Wipro22
{
  public static void main(String args[])
  {
    System.out.print("Enter the size of an array:");
    Scanner input = new Scanner(System.in);
    Integer size=input.nextInt();
    Integer arr[]=new Integer[size];
    Integer sum=0,average;
    System.out.print("Enter array elements:");
    for(Integer i=0;i<size;i++)
    {
      arr[i]=input.nextInt();
      sum+=arr[i];
    }
    average=sum/size;
    System.out.println("sum of array is:"+sum+"\naverage of array is:"+average);
  }
}
