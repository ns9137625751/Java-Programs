package wipro7;
import java.util.*;
public class Wipro7 
{
    public static void main(String[] args) 
    {
      // Character ch1,ch2;
       Scanner input=new Scanner(System.in);
       Character ch1,ch2;
       ch1=input.next().charAt(0);
       ch2=input.next().charAt(0);
       if(ch1>ch2)
           System.out.println(ch2+","+ch1);
           else
           System.out.println(ch1+","+ch2);
    }
    
}
