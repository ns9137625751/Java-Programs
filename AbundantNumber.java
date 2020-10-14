import java.io.*;  
import java.math.*; 
  
// Function to calculate sum of divisors 
class GFG{ 
    static int getSum(int n) 
    { 
        int sum = 0; 
    
       // Note that this loop runs till square  
       // root of n 
        for (int i=1; i<=(Math.sqrt(n)); i++) 
        { 
            if (n%i==0) 
            { 
             // If divisors are equal,take only  
             // one of them 
                if (n/i == i) 
                   sum = sum + i; 
    
                else // Otherwise take both 
                { 
                   sum = sum + i; 
                   sum = sum + (n / i); 
                } 
            } 
        } 
    
        // calculate sum of all proper divisors  
       // only 
        sum = sum - n; 
        return sum; 
    } 
    
    // Function to check Abundant Number 
    static boolean checkAbundant(int n) 
    { 
      // Return true if sum of divisors is  
      // greater than n. 
      return (getSum(n) > n); 
    } 
    
    /* Driver program to test above function */
    public static void main(String args[])throws 
                                   IOException 
    { 
      if(checkAbundant(12)) 
          System.out.println("YES"); 
      else
          System.out.println("NO"); 
      if(checkAbundant(15)) 
          System.out.println("YES"); 
      else
          System.out.println("NO"); 
    } 
} 
