package demo;
import java.io.*;
class Customer implements Serializable
{
  String name,email;
  int marks;
  public Customer(String name,String email,int marks)
  {
    this.name=name;
    this.email=email;
    this.marks=marks;
  }
  
}
 public class Demo
{
public static void main(String[] argv)throws Exception
 {
     try
     {
         Customer c=new Customer("gopal","jaingopal09@gmail.com",475);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
      }
     catch(Exception e)
     {
         e.printStackTrace();
     }
        /* try
         {
           FileOutputStream fos=new FileOutputStream("C:\Users\hp\Documents\java(wipro)");
           ObjectOutputStream oos=new ObjectOutputStream(fos);
         }*/
 }
}
