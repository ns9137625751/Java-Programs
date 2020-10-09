package wipro10;
import java.lang.*;
import java.util.*;
class Wipro10
{
   public static void main(String args[])
   {
       Scanner input=new Scanner(System.in);
       Character ch=input.next().charAt(0);
       Integer ascii=(int)ch;
       if(ascii>96&&ascii<123)
       System.out.println(Character.toUpperCase(ch));
       else System.out.println(Character.toLowerCase(ch));   
   }
}