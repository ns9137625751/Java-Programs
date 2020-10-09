class MyClass extends Exception
{
  public MyClass(String str)
  {
    super(str);
  }
  public static int pow(int a,int b) throws MyClass
  {
    if(a==0||b==0)
    {
       throw new MyClass("a and b both are zero!");
    }
    if(a<0||b<0)
    {
      throw new MyClass("a or b are negative!");
    }
    return((int)Math.pow(a,b));
  }
}
class Test7
{
  public static void main(String[] argv)
  {
    int a,b;
     a=2;
     b=5;
    try
    {
    int c=  MyClass.pow(a,b);
    System.out.println(c);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
