import java.util.Scanner;
class CompareDate2
{
    public static void main(String args[])
    {
         String date1,date2;
         Scanner sc=new Scanner(System.in);
         date1= sc.next();
         date2 = sc.next();
         String arr1[] = date1.split('\');
         String arr2[] = date2.split('-');
         String arr3[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
         if(arr1[0].equals(arr2[0])&&Integer.parseInt(arr1[1])==arr3[Integer.parseInt(arr2[1]-1)]&&arr1[2].equals(arr2[2]))
         System.out.println("Same");
         else System.out.println("Different");

    }
}
