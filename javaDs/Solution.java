import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
   public static void main(String[] args)
   {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       ArrayList<Integer> al=new ArrayList();
       for(int i=0;i<n;i++)
       {
          int temp = sc.nextInt();
           if(i==0)
           al.add(temp);
           else if(i!=0&&al.get(i-1)==temp)
           continue;
           else al.add(temp);
       }
       int t=sc.nextInt();
       for(int k=1;k<=t;k++)
       {
          int temp=sc.nextInt();
          int i = al.indexOf(temp);
          if(i!=-1)
          System.out.println(i+1);
          else
          {
              for(i=0;i<al.size()-1;i++)
              {
                  if(al.get(i)<temp)
                  {
                      al.set(i,temp);
                      System.out.println(al.indexOf(temp)+1);
                      break;
                  }
                  else if(al.get(al.size()-1)>temp)
                  {
                      al.add(temp);
                      System.out.println(al.indexOf(temp)+1);
                      break;
                  }
                  else if(al.get(i)>temp&&al.get(i+1)<temp)
                  {
                      al.set(i+1,temp);
                      System.out.println(al.indexOf(temp)+1);
                      break;
                  }
                  else continue;
              }
          }
       }
   }

}
