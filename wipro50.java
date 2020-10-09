class Wipro50
{
  public static void main(String[] args)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter String : ");
    String str=input.next();
    System.out.print("Enter Integer : ");
    int no=input.nextInt();
    int n=str.length()-no;
    for(int i=0;i<no;i++)
    System.out.print(str.substring(n,str.length()));
  }
}
