class Wipro46
{
  public static void main(String[] args)
  {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter First String : ");
    String str1 =input.next();
    System.out.print("Enter Second String : ");
    String str2 =input.next();
    if(str1.length()>str2.length())
    System.out.println(str2+str1+str2);
    else System.out.println(str1+str2+str1);

  }
}
