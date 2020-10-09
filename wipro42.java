class Wipro42
{
  public static void main(String[] args)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter first string : ");
    String str1=input.next();
    System.out.print("Enter second string : ");
    String str2=input.next();
    String str3="";
    if(str1.charAt(str1.length()-1)==str2.charAt(0))
    {
        str3=str1;
        String temp=str2.substring(1,str2.length());
        str3+=temp;
    }
    else str3=str1+str2;
    str3=str3.toLowerCase();
    System.out.println(str3);
  }
}
