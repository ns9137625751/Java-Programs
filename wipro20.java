import java.util.Scanner;
class Wipro20
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    String str1=input.next();
    String str2="";
    for(Integer i=str1.length()-1;i>=0;i--)
    str2+=str1.charAt(i);
    if(!(str1==str2))
    System.out.println("String is palindrome "+str1);
    else System.out.println("String is not palindrome "+str1);
  }
}
