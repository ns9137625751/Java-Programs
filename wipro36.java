class Animal
{
  public void eat()
  {
    System.out.println("Animal eat!");
  }
  public void sleep()
  {
    System.out.println("Animal sleep!");
  }
}
class Bird extends Animal
{
  public void eat()
  {
    System.out.println("Bird eat!");
  }
  public void sleep()
  {
    System.out.println("Bird sleep!");
  }
  public void fly()
  {
    System.out.println("Bird fly!");
  }
}
class Wipro36
{
  public static void main(String[] args)
  {
    Animal dog=new Animal();
    dog.eat();
    dog.sleep();
    Bird b=new Bird();
    b.eat();
    b.sleep();
    b.fly();
  }
}
