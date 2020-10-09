class Wipro49
{
  public static void main(String[] argv)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter First String : ");
    String str1=input.next();
    System.out.print("Enter Second String : ");
    String str2=input.next();
    int n = str1.length()>str2.length()?str1.length():str2.length();
    for(int i=0;i<n;i++)
    {
      if(i<str1.length())
        System.out.print(str1.charAt(i));
      if(i<str2.length())
        System.out.print(str2.charAt(i));
    }
  }
}
