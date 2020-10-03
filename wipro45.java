class Wipro45
{
  public static void main(String[] args)
  {
    java.util.Scanner input= new java.util.Scanner(System.in);
    System.out.print("Enter String : ");
    String str=input.next();
    str=str.substring(1,str.length()-1);
    System.out.println(str);
  }
}
