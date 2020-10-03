import java.util.Scanner;
interface LibarrayUsers
{
  public abstract void registerAccount();
  public abstract void requestBook();
}
class KidUsers implements LibarrayUsers
{
  private int age;
  private String bookType;
  public void registerAccount()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter age : ");
    age=input.nextInt();
    if(age<=12)
    System.out.println("You have successfully registered under a kids account ");
    else System.out.println("Soory, age must be less than or equall to 12 ");
  }
  public void requestBook()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Book Type : ");
    bookType=input.next();
    if(bookType.equals("kids"))
    System.out.println("Book Issued Sucessfully, please return with in 10 days!");
    else System.out.println("Oops, you are allowed to take only kids book!");
  }
}
class AdultUsers implements LibarrayUsers
{
  private int age;
  private String bookType;
  public void registerAccount()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter age : ");
    age=input.nextInt();
    if(age>12)
    System.out.println("You have successfully registered under an Adult account ");
    else System.out.println("Soory, age must be greater than 12 ");
  }
  public void requestBook()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Book Type : ");
    bookType=input.next();
    if(bookType.equals("fiction"))
    System.out.println("Book Issued Sucessfully, please return with in 7 days!");
    else System.out.println("Oops, you are allowed to take only adult fiction book!");
  }
}
class Wipro59
{
  public static void main(String[] args)
  {
    KidUsers kid=new KidUsers();
    kid.registerAccount();
    kid.requestBook();
    AdultUsers adult=new AdultUsers();
    adult.registerAccount();
    adult.requestBook();
  }
}
