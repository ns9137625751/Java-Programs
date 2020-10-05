class Wipro47
{
  public static void main(String[] args)
  {
      java.util.Scanner input=new java.util.Scanner(System.in);
      System.out.print("Enter String : ");
      String str=input.next();
      if((str.charAt(0)=='x'||str.charAt(0)=='X')&&(str.charAt(str.length()-1)=='X'||str.charAt(str.length()-1)=='x'))
      System.out.println(str.substring(1,str.length()-1));
      else System.out.println(str);
  }
}
