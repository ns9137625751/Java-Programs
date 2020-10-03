package wipro4;
import java.lang.*;
import java.util.*;
class Wipro4
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no:");
        Integer no=input.nextInt();
        input.close();
        if(no>0)
            System.out.println("no is positive!");
        else if(no<0)
            System.out.println("no is negative!");
        else System.out.println("no is zero!");       
    }
}