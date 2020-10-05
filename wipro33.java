class Calculator
{
  static Integer powerInt(Integer num1,Integer num2)
  {
    Integer result=1;
    for(Integer i=1;i<=num2;i++)
    result*=num1;
    return result;
  }
  static double powerDouble(double num1,int num2)
  {
    double result=1;
    for(Integer i=1;i<=num2;i++)
    result*=num1;
    return(result);
  }
}
class Wipro33
{
public static void main(String args[])
{
  Integer ans1=Calculator.powerInt(2,5);
  double ans2 = Math.pow(2,5);
  if(ans1==ans2)
  System.out.println("both value are same:"+ans1+"\t"+ans2);
  else System.out.println("both value are not same:"+ans1+"\t"+ans2);
  double result1=Calculator.powerDouble(2.5,3);
  double result2=Math.pow(2.5,3);
  if(result1==result2)
  System.out.println("both value are same:"+result1+"\t"+result2);
  else System.out.println("both value are not same:"+result1+"\t"+result2);
}
}
