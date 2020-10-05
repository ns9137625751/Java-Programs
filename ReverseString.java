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
