class Shape
{
  public void draw()
  {
    System.out.println("Drawing.....");
  }
  public void erase()
  {
    System.out.println("Erasing......");
  }
}
class Triangle extends Shape
{

    public void draw()
    {
      System.out.println("Drawing Triangle.....");
    }
    public void erase()
    {
      System.out.println("Erasing Triangle......");
    }
}
class Circle extends Shape
{
    public void draw()
    {
      System.out.println("Drawing Circle.....");
    }
    public void erase()
    {
      System.out.println("Erasing Circle......");
    }
}
class Square extends Shape
{

    public void draw()
    {
      System.out.println("Drawing Square.....");
    }
    public void erase()
    {
      System.out.println("Erasing Square......");
    }
}
class Wipro40
{
  public static void main(String[] args)
  {
    Shape triangle=new Triangle();
    Shape circle=new Circle();
    Shape square=new Square();
    triangle.draw();
    triangle.erase();
    circle.draw();
    circle.erase();
    square.draw();
    square.erase();
  }
}
