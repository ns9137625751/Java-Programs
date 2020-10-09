package pkg;
import pkg.Person;
public class Employee extends Person
{
    double annualSalary;
    int yearOfJoining;
    String nationalInsuranceNo;
    public Employee()
    {
    annualSalary=0.0;
    yearOfJoining=0000;
    nationalInsuranceNo="";
    }
    public Employee(String name,double annualSalary,int yearOfJoining,String nationalInsuranceNo)
    {
        super(name);
        this.annualSalary=annualSalary;
        this.yearOfJoining=yearOfJoining;
        this.nationalInsuranceNo=nationalInsuranceNo;
    }
    public void setAnnualSalary(double annualSalary)
    {
    this.annualSalary=annualSalary;
    }
    public void setYearOfJoining(int yearOfJoining)
    {
    this.yearOfJoining=yearOfJoining;
    }
    public void setNationalInsuranceNo(String nationalInsuranceNo)
    {
    this.nationalInsuranceNo=nationalInsuranceNo;
    }
    public double getAnnualSalary()
    {
    return annualSalary;
    }
    public int getYearOfJoining()
    {
    return yearOfJoining;
    }
    public String getNationalInsuranceNo()
    {
    return nationalInsuranceNo;
    }
    public void display()
    {
      System.out.println("Name : "+name);
      System.out.println("Annual salary : "+annualSalary);
      System.out.println("year of joining : "+yearOfJoining);
      System.out.println("National insurance no : "+nationalInsuranceNo);
    }
}
