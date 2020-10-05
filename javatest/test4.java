package pkg2;
import pkg1.A;
class B extends A
{
     void m2()
     {
       a=10;
       system.out.println(a);
     }
}
class C extends B
{
  public static void main(String[] args)
  {
  /*  A a=new A();
    a.m1();
    B b=new B();
    b.m1();*/
    C c=new C();
    c.m1();
    /*B b1=new C();
    b1.m1();
    A a1=new B();
    a1.m1();*/
  }
}
