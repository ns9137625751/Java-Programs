package wipro8;
import java.lang.*;
import java.util.*;
public class Wipro8 
{
public static void main(String[] args) 
{
 Character ch;
 Integer asciiValue;
 Scanner input=new Scanner(System.in);
 ch=input.next().charAt(0);
 asciiValue=(int)ch;
 if(asciiValue>96&&asciiValue<123||asciiValue>64&&asciiValue<91)
     System.out.println("alphabet!");
 else if(asciiValue>47&&asciiValue<58)
     System.out.println("Digits!");
 else System.out.println("Special Character!");
}
    
}
