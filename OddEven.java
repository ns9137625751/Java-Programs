#Program For Check Whether No Even OR Odd

import java.io.DataInputStream;
import java.io.IOException;
class OddEven

{
	public static void main(String args[])
	{
	int x=0;
	System.out.println("Program For Check Whether No Even OR Odd");
	DataInputStream t=new DataInputStream(System.in);
	try{
	System.out.println("Enter No");
	x=Integer.parseInt(t.readLine());
	}
	catch(IOException ioe)
	{
	}
	if(x%2==0)
	{
		System.out.println("No is Odd");
	}
	else
	{
		System.out.println("No is Even");
	}
}
}
