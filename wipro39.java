import java.util.Scanner;
class Fruit
{
  protected String name,taste;
  protected int size;
  public void eat()
  {
    System.out.println("name : "+name);
    System.out.println("Taste : "+taste);
  }
  public void getData()
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the fruit name :");
    name=input.next();
    System.out.println("Enter fruit taste :");
    taste=input.next();
    System.out.println("Enter fruit Size :");
    size=input.nextInt();
  }
}
class Apple extends Fruit
{
  public void eat()
  {
    System.out.println("name : "+name);
    System.out.println("Taste : "+taste);
  }
}
class Mango extends Fruit
{
  public void eat()
  {
    System.out.println("name : "+name);
    System.out.println("Taste : "+taste);
  }
}
class Wipro39
{
  public static void main(String[] argv)
  {
    Apple apple=new Apple();
    apple.getData();
    apple.eat();
    Mango mango=new Mango();
    mango.getData();
    mango.eat();
  }
}
