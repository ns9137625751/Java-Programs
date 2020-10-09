class Wipro51
{
  public static void main(String[] args)
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    String string=input.next();
    String subString=input.next();
    String[] arr = string.split(subString);
System.out.println(arr.length);
for(String s:arr)
System.out.println(s);
        if(arr.length==1)
  {
   System.out.print(arr[0].charAt(0));
   if(arr[0].length()==1)
   System.out.print(arr[0].charAt(0));
   else
   System.out.print(arr[0].charAt(arr[0].length()-1));
 }
    else
    for(int i=0;i<arr.length;i++)
    {
      if(i==0)
      System.out.print(arr[0].charAt(arr[0].length()-1));
     else if(i==arr.length-1)
      System.out.print(arr[i].charAt(0));
      else System.out.print(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1));
    }
  }
}
