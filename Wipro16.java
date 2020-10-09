class Wipro16
{
  public static void main(String args[])
  {
    Integer count=0;
    for(Integer i=10;i<=99;i++)
    {
      count=0;
      for(Integer j=2;j<=i/2;j++)
      {
        if(i%j==0)
        count++;
        else continue;
      }
      if(count==0)
      System.out.println("prime no:"+i);

    }
  }
}
