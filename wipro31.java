import java.util.Scanner;
class Wipro31
{
  public static void main(String args[])
  {
    if(args.length<9)
    {
      System.out.println("Please enter 9 integers numbers!!");
      return;
    }
    Integer arr[][]=new Integer[3][3];
    Integer k=0,max=-1000000000;
    for(Integer i=0;i<3;i++)
      for(Integer j=0;j<3;j++,k++)
      {
         arr[i][j]=Integer.parseInt(args[k]);
         if(max<arr[i][j])
         max=arr[i][j];
         else continue;
      }
      System.out.println("the given array is: ");
      for(Integer i=0;i<3;i++)
      {
        for(Integer j=0;j<3;j++)
          System.out.print(arr[i][j]+"\t");
          System.out.println();
      }
      System.out.println("The biggest no in given array is:"+max);
  }
}
