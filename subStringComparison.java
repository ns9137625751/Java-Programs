
// Java Sub String Comparison
// Contributed By Gopal Jain

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k)
     {  String smallest = "";
        String largest = "";
        for(int i=0;i<k;i++)
        {
            smallest+='z';
            largest+='a';
        }
        String temp;
        for(int i=0;i<s.length()-2;i++)
        {
                    temp=s.substring(i,i+k);
                   // System.out.println(temp);
                    if(largest.charAt(0)<temp.charAt(0))
                    largest=temp;
                    if(smallest.charAt(0)>temp.charAt(0))
                    smallest=temp;
                 /*   if(largest.charAt(0)==temp.charAt(0))
                    {
                        if(largest.charAt(1)<temp.charAt(1))
                        largest=temp;
                        else smallest=temp;
                    }*/
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
