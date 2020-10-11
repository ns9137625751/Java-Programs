#https://www.facebook.com/jeet/posts/2729372946102639
# Subscribed by Code House

import java.util.Scanner;
public class Area
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }            
}
