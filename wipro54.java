abstract class Instrument
{
  public abstract void play();
}
class Piano extends Instrument
{
  public void play()
  {
    System.out.println("Piano is playing tan tan tan tan");
  }
}
class Flute extends Instrument
{
  public void play()
  {
    System.out.println("Flute is playing toot toot toot toot");
  }
}
class Guitar extends Instrument
{
  public void play()
  {
    System.out.println("Guitar is playing tin tin tin tin");
  }
}
class  TestInstruments
{
  public static void main(String[] args)
  {
    java.util.Random rand = new java.util.Random();
    Instrument[] arr=new Instrument[10];
    for(int i=0;i<10;i++)
    {
      int n=rand.nextInt(3);
      switch(n)
      {
        case 0:arr[i]= new Piano();
                break;
        case 1:arr[i]= new Flute();
                break;
        case 2:arr[i]= new Guitar();
                break;
      }
      arr[i].play();
      System.out.println(arr[i].getClass().getName()+" Object Is Stored in "+i+" index");
/*
      else if(arr[i] instanaceof Flute)
      System.out.println("Flute Object Is Stored in "+i+" index");

      if(arr[i] instanaceof Guitar)
      System.out.println("Guitar Object Is Stored in "+i+" index");
      */
    }
  }
}
