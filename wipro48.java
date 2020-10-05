class Wipro48
{
  public static void main(String[] args)
  {
    java.util.Scanner input =new java.util.Scanner(System.in);
    System.out.print("Enter String : ");
    String str=input.next();
    int i=0;
    if((str.charAt(0)!='*'||str.charAt(1)!='*'))
    System.out.print(str.charAt(0));
    for(i=1;i<str.length()-1;i++)
    {
      if(str.charAt(i)=='*'||str.charAt(i+1)=='*'||str.charAt(i-1)=='*')
      continue;
      else System.out.print(str.charAt(i));
    }
      if((str.charAt(i)!='*'||str.charAt(i-1)!='*'))
      System.out.print(str.charAt(i));
  }
}
