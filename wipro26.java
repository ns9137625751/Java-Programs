import java.util.Scanner;
class Wipro26
{
  public static void main(String args[])
  {
    System.out.print("Enter array size:");
    Scanner input=new Scanner(System.in);
    Integer size=input.nextInt();
    System.out.print("Enter array elements:");
    Integer arr[]=new Integer[size];
    Integer firstMin=1000000,secondMin=1000000,firstMax=-1000000,secondMax=-1000000;
    for(Integer i=0;i<size;i++)
    {
      arr[i]=input.nextInt();
      if(arr[i]>firstMax)
      firstMax=arr[i];
      if(arr[i]>secondMax&&arr[i]<firstMax)
      secondMax=arr[i];
      if(arr[i]<firstMin)
      firstMin=arr[i];
      if(arr[i]<secondMin&&arr[i]>firstMin)
      secondMin=arr[i];
    }
    if(size==2)
    {
      if(arr[0]<arr[1])
      {
        System.out.println("firstmin:"+arr[0]);
        System.out.println("secondmin:"+arr[1]);
        System.out.println("firstmax:"+arr[1]);
        System.out.println("secondmax:"+arr[0]);
      }
      else if(arr[0]>arr[1])
      {
        System.out.println("firstmin:"+arr[1]);
        System.out.println("secondmin:"+arr[0]);
        System.out.println("firstmax:"+arr[0]);
        System.out.println("secondmax:"+arr[1]);
      }
      else
      {
        System.out.println("firstmin:"+arr[0]);
        System.out.println("secnodmin:"+arr[0]);
        System.out.println("firstmax:"+arr[0]);
        System.out.println("secnodmax:"+arr[0]);
      }
      return;
    }
    if(size==1)
    {
      System.out.println("firstmin:"+arr[0]);
      System.out.println("secnodmin:"+arr[0]);
      System.out.println("firstmax:"+arr[0]);
      System.out.println("secnodmax:"+arr[0]);
      return;
    }
    System.out.println("firstmin:"+firstMin);
    System.out.println("secondmin:"+secondMin);
    System.out.println("firstmax:"+firstMax);
    System.out.println("secnodmax:"+secondMax);
  }
}
