import java.util.Scanner;
class Wipro18
{
  public static void main(String args[])
  {
    System.out.print("Enter integer:");
    Scanner input=new Scanner(System.in);
    Byte no=input.nextByte();
    for(Byte i=1;i<=no;i++)
    {
      for(Byte j=1;j<=i;j++)
      System.out.print("*");
      System.out.println();
    }
  }
}
