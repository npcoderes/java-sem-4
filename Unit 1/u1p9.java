// Java program to find compound interest for 
// given values. 
import java.io.*;
class u1p9
{ 
	public static void main(String args[]) 
	{ 
		double principal = 5000, rate = 6.5, time = 5; 

		/* Calculate compound interest */
		double CI = principal * 
					(Math.pow((1 + rate / 100), time)); 
		
		System.out.println("Compound Interest is "+ CI); 
	} 
} 
// This code is contributed by Anant Agarwal. 

