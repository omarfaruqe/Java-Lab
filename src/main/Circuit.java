package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input file: ");
		String inputFileName = console.next();
		
		System.out.print("Output file: ");
		String outputFileName = console.next();
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		while (in.hasNextDouble())
		{
			double B = in.nextDouble();
			double R = in.nextDouble();
			double C = in.nextDouble();
			double Starting_t = in.nextDouble();
			double Ending_t = in.nextDouble();

			double steps = (Ending_t - Starting_t ) / 100.0;
			double RC = (1.0 / (R * C ));
			double ans = 0.0;
			
			for(double i = Starting_t; i <= Ending_t; i = i + steps)
			{
				ans = B * (1 - Math.exp(-i*RC));
				//System.out.println( +i  + " " +ans);
				out.printf("%1f %1f\n",i,ans);
			}
		}
		
		in.close();
		
		out.close();
	}

}