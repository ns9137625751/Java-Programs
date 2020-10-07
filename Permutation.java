/* This code will find all permutations of a given string
Recursion is used here*/
import java.util.ArrayList;

public class Permutation1 {
public static void main(String[] args) {
   printPer("1234","");
}

//this method will find all permutations
   public static void printPer(String ques,String ans){
       if(ques.length()==0){
           System.out.println(ans);
           return;
       }
       for(int i=0;i<ques.length();i++){
            char c=ques.charAt(i); 
            String ros=ques.substring(0,i)+ques.substring(i+1);
                  printPer(ros,ans+c);
       }
   } 
}
