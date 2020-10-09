class Patient
{
  private String patientName;
  private double height,weight;
  Patient(String name,double hei,double wei)
  {
    patientName=name;
    height=hei;
    weight=wei;
  }
  double computeBMI()
  {
    return(weight/(height*height));
  }
}
class Wipro34
{
  public static void main(String args[])
  {
    java.util.Scanner input=new java.util.Scanner(System.in);
    System.out.print("Enter patient name:");
    String name=input.next();
    System.out.print("Enter patient height(meter):");
    double height=input.nextDouble();
    System.out.print("Enter patient weight(kg):");
    double weight=input.nextDouble();
    Patient man=new Patient(name,height,weight);
    double BMI=man.computeBMI();
    System.out.println("the computeBMI is:"+BMI);
  }
}
