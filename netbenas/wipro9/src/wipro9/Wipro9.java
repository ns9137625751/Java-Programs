package wipro9;
import java.lang.*;
import java.util.*;
class Wipro9
{
    public static void main(String args[])
    {
        Integer age= Integer.parseInt(args[1]);
        //System.out.print(age);
        String s=args[0];
        if(s== "Female"&&age>0&&age<59)
        System.out.println("Percentage of interest is 8.2%");
        if(s=="Female"&&age>59&&age<=100)
        System.out.println("Percentage of interest is 9.2%");
        if(s=="Male")&&(age>0&&age<59)
        System.out.println("Percentage of interest is 8.4%");
        if(s=="Male"&&age>59&&age<=100)
        System.out.println("Percentage of interest is 10.5%");
    }
}
