import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn =  new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i= 0;i< n;i++){
        arr[i] =  scn.nextInt();
    }
    int count = (int)Math.pow(2,n);
    for(int i=0;i<count;i++){
        int bin = dtob(i);
        int div = (int)Math.pow(10,n -1);
        for(int j=0 ; j<arr.length; j++){
            int q = bin /div;
            int r = bin%div;
            if(q==0){
                System.out.print("-	");
            }else{
                System.out.print(arr[j] + "	");
            }
            bin =r;
            div/=10;
        }
        System.out.println();
    }
    
 }
public static int dtob(int n){
    int ans = 0;
    int power = 1;
    
    while(n != 0){
        int rem = n%2;
        n= n/2;
        ans = ans +(rem*power);
        power*= 10;
    }
    return ans;
}
}
