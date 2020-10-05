import java.util.Scanner;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string");  
      original = sc.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Enter string is palindrome.");  
      else  
         System.out.println("Enter string is not a palindrome.");   
   }  
}  
