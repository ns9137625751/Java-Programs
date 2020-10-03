import java.util.Scanner;
class Person
{
  protected String name;
  protected String dateOfBirth;
  public Person()
  {
    name="";
    dateOfBirth="";
  }
  public  Person(String name,String dateOfBirth)
  {
    this.name=name;
    this.dateOfBirth=dateOfBirth;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setDateOfBirth(String dateOfBirth)
  {
    this.dateOfBirth=dateOfBirth;
  }
  public String getName()
  {
    return name;
  }
  public String getDateOfBirth()
  {
    return dateOfBirth;
  }
}
class Teacher extends Person
{
  private double salary;
  private String subject;
  public Teacher()
  {
    salary=0.0;
    subject="";
  }
  public Teacher(String name,String dateOfBirth,double salary,String subject)
  {
    super(name,dateOfBirth);
    this.salary=salary;
    this.subject=subject;
  }
  public void getData()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter name : ");
    name=input.next();
    System.out.print("Enter Date of birth : ");
    dateOfBirth=input.next();
    System.out.print("Enter salary : ");
    salary=input.nextDouble();
    System.out.print("Enter subject which you teach : ");
    subject=input.next();
  }
  public void showData()
  {
    System.out.println("    Faculty detail...");
    System.out.print("Name : "+name+"\nDate of birth : "+dateOfBirth+"\nSalary : "+salary+"\nSubject : "+subject);
  }
  public void setSalary(double salary)
  {
    this.salary=salary;
  }
  public void setSubject(String subject)
  {
    this.subject=subject;
  }
  public double getSalary()
  {
    return salary;
  }
  public String getSubject()
  {
    return subject;
  }
}
class Student extends Person
{
  protected String studentId;
  public Student()
  {
    studentId="";
  }
  public Student(String name,String dateOfBirth,String studentId)
  {
    super(name,dateOfBirth);
    this.studentId=studentId;
  }
  public void setStudentId(String studentId)
  {
    this.studentId=studentId;
  }
  public String getStudentId()
  {
    return studentId;
  }
  public void getData()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter name : ");
    name=input.next();
    System.out.print("Enter Date of birth : ");
    dateOfBirth=input.next();
    System.out.print("Enter student ID : ");
    studentId=input.next();
  }
  public void showData()
  {
    System.out.println(" Student details ");
    System.out.print("Name : "+name+"\nDate of birth : "+dateOfBirth+"\nStudent ID : "+studentId);
  }
}
class CollegeStudent extends Student
{
    public static String collegeName="Teerthanker Mahaveer University";
    private int year;
    public CollegeStudent()
    {
      year=0000;
    }
    public CollegeStudent(String name,String dateOfBirth,String studentId,int year)
    {
      super(name,dateOfBirth,studentId);
      this.year=year;
    }
    public void getCollegeData()
    {
      Scanner input=new Scanner(System.in);
      getData();
      System.out.print("Enter student Year : ");
      year=input.nextInt();
    }
    public void showCollegeData()
    {
      showData();
      System.out.print("\nStudent year : "+year);
    }
}
class Wipro38
{
  public static void main(String[] args)
  {
    Teacher teacher1=new Teacher();
    teacher1.getData();
    teacher1.showData();
    CollegeStudent student1=new CollegeStudent();
    student1.getCollegeData();
    student1.showCollegeData();
  }
}
