import java.util.Scanner;
class Wipro19
{
  public static void main(String args[])
  {
    System.out.print("Enter Intger no:");
    Scanner input=new Scanner(System.in);
    String no=input.next();
    Integer n=no.length();
    String s="";
    for(Integer i=n-1;i>=0;i--)
    {
      s+=no.charAt(i);
    }
   System.out.println(s);
  }
}
