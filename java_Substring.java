import java.util.*;
class java_Substring{
	public static void main(String args[]){
		String s="";
		int start=0,end=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		for(int i=0;i<2;i++){
			if(i==0)
			  start=sc.nextInt();
			else
			  end=sc.nextInt();
		}

	System.out.println(s.substring(start,end));
	}

}