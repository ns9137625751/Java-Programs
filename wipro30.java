class Wipro30
{
  public static void main(String args[])
  {
    if(args.length!=4)
    {
      System.out.println("Please enter 4 integer numbers!");
      return;
    }
    Integer arr[][]=new Integer[2][2];
    arr[0][0]=Integer.parseInt(args[0]);
    arr[0][1]=Integer.parseInt(args[1]);
    arr[1][0]=Integer.parseInt(args[2]);
    arr[1][1]=Integer.parseInt(args[3]);
    System.out.println("The given array is:");
    for(Integer i=0;i<2;i++)
    {
      for(Integer j=0;j<2;j++)
      System.out.print(arr[i][j]+"\t");
      System.out.println();
    }
    System.out.println("The reverse of array is:");
    Integer k=1,l=1;
    for(Integer i=0;i<1;i++)
    {
      for(Integer j=0;j<2;j++)
      {
        Integer temp=arr[i][j];
               arr[i][j]=arr[k][l];
               arr[k][l]=temp;
               l--;
      }
      k--;
    }
    for(Integer i=0;i<2;i++)
    {
      for(Integer j=0;j<2;j++)
      System.out.print(arr[i][j]+"\t");
      System.out.println();
    }
 }
}
