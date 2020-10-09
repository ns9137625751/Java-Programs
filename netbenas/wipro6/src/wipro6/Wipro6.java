package wipro6;
//import java.lang.*;
//import java.util.*;
public class Wipro6 
{
    public static void main(String[] args)
    {
        Integer i=0;
      for(i=0;i<args.length -1;i++)
     {
        System.out.print(args[i]+",");
     }
      if(i!=0)
          System.out.println(args[i]);
      else System.out.print("There is no command line argument!");
    }
    
}
