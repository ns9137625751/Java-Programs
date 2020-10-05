# Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.
# Return the power of the string.

import java.util.Scanner;

public class ConsecutiveCharacters{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int result = maxPower(str);
		System.out.println(result);
	}
	public static int maxPower(String s) {
        if(s.length()==1){
            return 1;
        }
        int count=1;
        int max=0;
        char ch = s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            char test=s.charAt(i);
            if(test==ch){
                count++;
            }else{
                ch=test;
                count=1;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}
