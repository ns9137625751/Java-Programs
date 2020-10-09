import java.util.Scanner;
class Wipro15
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number:");
    Integer no=input.nextInt();
    Integer count=0;
    if(no==0||no==1)
    {
      System.out.println(no+" is neither prime nor composite!");
      return;
    }
    for(Integer i=2;i<=no/2;i++)
    {
      if(no%i==0)
       count++;
      else continue;
    }
    if(count==0)
    System.out.println(no+" is a prime no!");
    else System.out.println(no+" is not a prime no!");
  }
}
