class Wipro41
{
  public static void main(String[] args)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter the String : ");
    String palindrome=input.next();
    boolean check=false;
    int n=palindrome.length(),j=n-1;
    for(int i=0;i<n/2;i++)
    {
      if(palindrome.charAt(i)==palindrome.charAt(j))
      {
        check=true;
        j--;
        continue;
      }
      else {
        check=false;
        break;
         }
    }
    if(check)
      System.out.println("The given string is palindrome!");
    else System.out.println("The given string is not palindrome!");
}
}
