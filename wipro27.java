import java.util.Scanner;
class Wipro27
{
  public static void main(String args[])
  {
    System.out.print("Enter the size of an array:");
    Scanner input=new Scanner(System.in);
    Integer size=input.nextInt();
    Integer arr[]=new Integer[size];
    System.out.print("Enter array elements:");
    for(Integer i=0;i<size;i++)
    arr[i]=input.nextInt();
    System.out.println("Array before sort:");
    for(Integer i=0;i<size;i++)
    System.out.print(arr[i]+"\t");
    for(Integer i=0;i<size-1;i++)
    {
      for(Integer j=i+1;j<size;j++)
        if(arr[i]>arr[j])
        {
          Integer temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
    }
    System.out.println();
    System.out.println("Array after sort:");
    for(Integer i=0;i<size;i++)
    System.out.print(arr[i]+"\t");
  }
}
