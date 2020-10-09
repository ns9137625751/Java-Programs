abstract class GeneralBank
{
  public abstract double getSavingsInterestRate();
  public abstract double getFixedDepositeInterestRate();
}
class ICICI extends GeneralBank
{
   public double getSavingsInterestRate()
  {
    return 4;
  }
  public double getFixedDepositeInterestRate()
  {
    return 8.5;
  }
}
class KotMBank extends GeneralBank
{
  public double getSavingsInterestRate()
 {
   return 6;
 }
 public double getFixedDepositeInterestRate()
 {
   return 9;
 }
}
class Wipro52
{
  public static void main(String[] args)
  {
    ICICI a=new ICICI();
    double saving=a.getSavingsInterestRate();
    double fixed=a.getFixedDepositeInterestRate();
    System.out.println("Savings Interest Rate For ICICI Bank : "+saving+"%");
    System.out.println("Fixed Interest Rate For ICICI Bank : "+fixed+"%");
    KotMBank b=new KotMBank();
    saving=b.getSavingsInterestRate();
    fixed=b.getFixedDepositeInterestRate();
    System.out.println("Savings Interest Rate For KotMBank Bank : "+saving+"%");
    System.out.println("Fixed Interest Rate For KotMBank Bank : "+fixed+"%");
    GeneralBank c=new KotMBank();
     saving=c.getSavingsInterestRate();
     fixed=c.getFixedDepositeInterestRate();
    System.out.println("Savings Interest Rate For KotMBank Bank : "+saving+"%");
    System.out.println("Fixed Interest Rate For KotMBank Bank : "+fixed+"%");
    GeneralBank d=new ICICI();
    saving=d.getSavingsInterestRate();
    fixed=d.getFixedDepositeInterestRate();
    System.out.println("Savings Interest Rate For ICICI Bank : "+saving+"%");
    System.out.println("Fixed Interest Rate For ICICI Bank : "+fixed+"%");
  }
}
