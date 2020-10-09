/* Here is given a phone book that consists of people's names and their phone number.
After that I will take some person's name as query. 
For each query I print the phone number of that person. */

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
    Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
      m.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
        if(m.containsKey(s))
          System.out.println(s+"="+m.get(s));
        else
          System.out.println("Not found");
		}
	}
}



