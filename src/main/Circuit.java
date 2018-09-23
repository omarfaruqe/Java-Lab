package main;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Lab1 {
	private static Scanner scn;

	public static void main(String[] args) throws FileNotFoundException
	{
		File file1 = new File("F:\\Users\\cse\\Desktop\\ManHunt\\input.txt"); 
		scn = new Scanner(file1); 
			  
		if (scn.hasNextDouble())
		{
			double StartingTime = scn.nextInt();
			double EndingTime = scn.nextInt();
			
			double B = scn.nextDouble();
			double R = scn.nextDouble();
			double C = scn.nextDouble();
			double e = 2.71828;
			double rc = 1/(R*C);
			
			double T;
			T= EndingTime/100;
			for(double i=StartingTime; i<=EndingTime; i=i+T)
			{
				double ep;
				ep = 1 / (Math.pow(e, (rc*i)));
				double p;
				p = B*(1-ep);
				System.out.println(i+"   "+p);
			}
		}	      
	}
}
