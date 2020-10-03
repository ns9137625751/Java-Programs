abstract class Compartment
{
  public abstract String notice();
}
class FirstClass extends Compartment
{
  public String notice()
  {
    return "This is FirstClass Compartment";
  }
}
class Ladies extends Compartment
{
  public String notice()
  {
    return "This is Ladies Compartment";
  }
}
class General extends Compartment
{
  public String notice()
  {
    return "This is General Compartment";
  }
}
class Luggage extends Compartment
{
  public String notice()
  {
    return "This is Luggage Compartment";
  }
}
class TestCompartment
{
  public static void main(String[] args)
  {
    java.util.Random rand=new java.util.Random();
    Compartment[] arr=new Compartment[10];
    for(int i=0;i<9;i++)
    {
      int n=rand.nextInt();
      switch(n)
      {
        case 0:arr[i]=new FirstClass();
               break;
        case 1:arr[i]=new Ladies();
               break;
        case 2:arr[i]=new General();
               break;
        case 3:arr[i]=new Luggage();
               break;
      }
      System.out.println(arr[i].notice());
    }
  }
}
