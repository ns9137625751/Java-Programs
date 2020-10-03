class Wipro21
{
  public static void main(String args[])
  {
    Integer count=0,i=30;
    while(count<5)
    {
      if(i%2==0&&i%3==0&&i%5==0)
      {
        System.out.println(i);
        count++;
      }
      i++;
    }
  }
}
