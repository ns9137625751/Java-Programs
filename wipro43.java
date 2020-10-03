class Wipro43
{
  public static void main(String[] args)
  {
      java.util.Scanner input=new java.util.Scanner(System.in);
      System.out.print("Enter String : ");
      String str =input.next();
      int n=str.length();
      str=str.substring(0,2);
      for(int i=1;i<=n;i++)
      System.out.print(str);    
  }
}
