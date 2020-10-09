#https://www.facebook.com/harsha.gupta.1610/posts/2375944699218906
#subscribed by Harsha Kumari

import java.util.*;  
class Complex { 

	int real, imag; 
	Complex() 
	{ 
	} 
	Complex(int tempReal, int tempImag) 
	{ 
		real = tempReal; 
		imag = tempImag; 
	}
	Complex(Complex com)
	{
		real=com.real;
		imag=com.imag;
	}
	void showComplex() 
	{ 
		System.out.println("Complex number: "+ real + " + "+ imag + "i"); 
	} 
	Complex addComplex(Complex C) 
	{ 
		Complex temp = new Complex(); 
		temp.real = real + C.real; 
		temp.imag = imag + C.imag; 
		return temp; 
	} 
	Complex subtractComplex(Complex C) 
	{ 
		Complex temp = new Complex();
		temp.real = real - C.real; 
		temp.imag = imag - C.imag; 
		return temp; 
	} 
	Complex multiplyComplex(Complex C) 
	{ 
		Complex temp = new Complex();
		temp.real = real * C.real; 
		temp.imag = imag * C.imag; 
		return temp; 
	} 
	
} 


public class Complexdemo { 
	public static void main(String[] args) 
	{ 
		Complex C1 = new Complex(3, 2); 
		C1.showComplex(); 
		Complex C2 = new Complex(9, 5); 
		C2.showComplex(); 
		Complex C3 = new Complex();

		System.out.println("Copy constructor called");
		Complex C4 = new Complex(C1);    
   		C4.showComplex();

		C3 = C1.addComplex(C2); 
		System.out.print("Sum of "); 
		C3.showComplex(); 
		C3 = C1.subtractComplex(C2); 
		System.out.print("Difference of "); 
		C3.showComplex();
		C3 = C1.multiplyComplex(C2); 
		System.out.print("Multiply of "); 
		C3.showComplex(); 
	} 
} 
