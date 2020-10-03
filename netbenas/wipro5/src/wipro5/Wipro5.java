package wipro5;
//import java.lang.*;
import java.util.*;
class Wipro5
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no:");
        Integer no=input.nextInt();
        if(no%2==0)
            System.out.println(no+" Is Even!");
        else System.out.println(no+ " Is Odd");
    }
}