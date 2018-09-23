package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Circuit {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("D:\\Academic\\2-2\\Java_Practice\\eclipse\\Lab Test 1\\src\\input.txt"); 
		Scanner sc = new Scanner(file); 
			  
		if (sc.hasNextDouble()) {
			double B = sc.nextDouble();
			double R = sc.nextDouble();
			double C = sc.nextDouble();
			
			double t0 = sc.nextInt();
			double tn = sc.nextInt();
			
			double e = 2.7183;
			double rc = 1/(R*C);
			
			double T = (tn-t0)/100;
			for(double i = t0; i<=tn; i=i+T) {
				double ep = 1 / (Math.pow(e, (rc*i)));
				double v = B*(1-ep);
				System.out.println(i+"  "+v);
			}
		}	      
	}
}
