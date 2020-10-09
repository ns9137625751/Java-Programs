class Wipro44
{
  public static void main(String[] args)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter String : ");
    String str=input.next();
    if(str.length()%2==0)
    {
      str=str.substring(0,str.length()/2);
      System.out.print(str);
    }
    else System.out.print("null");
  }
}
