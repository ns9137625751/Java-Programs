class Test extends RuntimeException
{
  Test(String str)
  {
    super(str);
  }
}
class Test8
{
  public static void main(String[] args)
  {
    if(Integer.parseInt(args[0])<18)
    {
      throw new Test("old age exception");
    }
  }
}
