class Singleton
{
  private static Singleton obj=new Singleton();
  private Singleton()
  {
    super();
  }
  public static Singleton getSingleton()
  {
    return obj;
  }
  public void display()
  {
    System.out.println("hey i am single!!");
  }
}
class Test6
{
  public static void main(String[] args)
  {
    Singleton obj1=Singleton.getSingleton();
    obj1.display();
    Singleton obj2 = Singleton.getSingleton();
    obj2.display();
    if(obj1==obj2)
    {
      System.out.println("Yes it is singleton!");
    }
    else System.out.println("it is not singleton!!");
  }
}
