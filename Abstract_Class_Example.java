//Subscribed by Mritunjay Kumar
//https://www.facebook.com/Mritunjay70/posts/1445812775628125
abstract class Person {
	String name;
	int age;
	
	Person() {
		
	}
	Person(String n, int r) {
		name = n;
		age = r;
	}
	
	void setData(String name1, int age1)
	{
		name = name1;
		age = age1;
	}
	
	void printDetails()
	{
		System.out.print("Name: "+name+"  Age: "+age);
	}
	
	abstract void exceptional();
	
	final void isAdult() {
		if (age > 18) System.out.println("\t Yes");
	}
}  // class Person ends

class Student extends Person
{
	double cpi;
	
	Student() {
		
	}
	Student(String n, int r, double c) {
		
		super(n, r);
		cpi = c;
	}
	
	void setData(String name1, int age1, double cpi1)
	{
		super.setData(name1, age1);
		cpi = cpi1;
	}
	
	void printDetails()
	{
		System.out.println();
		super.printDetails();
		System.out.print(" CPI: "+cpi);
	}
	
	void f() {
		
	}
	
	void exceptional()
	{
		if (cpi > 9.5) System.out.print("   Exceptional ");
	}

	void isAdult(Person p) { 
		
	}
} // class Student ends here

abstract class test extends Student {
	abstract void f();
	void f2(){
		
	}
}

class Faculty extends Person
{
	float noOfPub;
	
	Faculty() {
		
	}
	Faculty(String n, int r, float nop) {
		super(n, r);
		noOfPub = nop;
	}
	
	void setData(String name1, int age1, int nop)
	{
		super.setData(name1, age1);
		noOfPub = nop;
	}
	
	void printDetails()
	{
		System.out.println();
		super.printDetails();
		System.out.print(" No of Pub: "+noOfPub);
	}
	
	void exceptional()
	{
		if (noOfPub > 100) System.out.print("   Exceptional ");
	}
}

public class AbstractDemo {

	public static void main(String[] args)
	{
		Student s1 = new Student(), s2 = new Student();
		Faculty f1 = new Faculty(), f2 = new Faculty();
		
		s1.setData("A", 10, 9.7); s2.setData("B", 10, 7.0);
		f1.setData("C", 70, 300); f2.setData("D", 75, 50);
		
		Person [] p= new Person[4];
		
		p[0] = s1;
		p[1] = s2;
		p[2] = f1;
		p[3] = f2;
		
		for (int index=0; index<p.length; index++)
		{
			p[index].printDetails();
			p[index].exceptional();
			p[index].isAdult();
		}
		
	}

}
