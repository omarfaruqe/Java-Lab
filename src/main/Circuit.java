package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit 
{
		public static final double e = 2.71828;
			
			public static double v(int R, int B, double C, int t) {
				double v = B * (1 - Math.pow(e, (-t / (double)(R * C))));
				return v;
			}
	
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
		
		int B = in.nextInt();
		int R = in.nextInt();
		double C = in.nextDouble();
		int startingTime = in.nextInt();
		int endingTime = in.nextInt();
		
		for(int t = startingTime; t <= endingTime; t += 10) {
			out.printf("%d %f\n", t, v(R, B, C, t));
		}
		
		in.close();
		
		out.close();
	}

}