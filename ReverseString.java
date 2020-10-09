
public class Main
{
	public static void main(String[] args) {
		String s="I love my India";
		int i=s.length()-1;
		String ans="";
		while(i>=0)
		{
		    if(i<0)
		    break;
		    while(i>=0 && s.charAt(i)==' ')
		    i--;
		    int j=i;
		    while(i>=0 && s.charAt(i)!=' ')
		    i--;
		    if(ans.isEmpty()){
		        ans=ans.concat(s.substring(i+1,j+1));
		    }else{
		        ans=ans.concat(" "+s.substring(i+1,j+1));
		    }
		}
		System.out.println(ans);
	}
}
// Java program to ReverseString using ByteArray. 
import java.lang.*; 
import java.io.*; 
import java.util.*; 

// Class of ReverseString 
class ReverseString { 
	public static void main(String[] args) 
	{ 
		String input = "GeeksforGeeks"; 

		// getBytes() method to convert string 
		// into bytes[]. 
		byte[] strAsByteArray = input.getBytes(); 

		byte[] result = new byte[strAsByteArray.length]; 

		// Store result in reverse order into the 
		// result byte[] 
		for (int i = 0; i < strAsByteArray.length; i++) 
			result[i] = strAsByteArray[strAsByteArray.length - i - 1]; 

		System.out.println(new String(result)); 
	} 
} 
