package pkg1;
public class A
{
  protected int a;
   protected void m1()
   {
     System.out.println("A protected");
   }
}
class Test extends A
{
  public void fun()
  {
    a=10;
    System.out.println("Hello!");
  }
  public static void main(String[] args)
  {
    A a=new A();
    a.m1();
    Test t=new Test();
    t.m1();
    t.fun();
    A b=new Test();
    b.m1();

  }
}
