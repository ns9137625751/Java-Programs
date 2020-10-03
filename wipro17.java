import java.util.Scanner;
class Wipro17
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter no:");
    Integer no=input.nextInt();
    Integer sum=0;
    while(no>0)
    {
      sum+=no%10;
      no/=10;
    }
    System.out.println("Sum of its digits is:"+sum);
  }
}
