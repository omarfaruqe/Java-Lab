package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit 
{
	public static final double e = 2.71828;
	
	public static double v(int R, int B, double C, int t) 
	{
		double v = B * (1 - Math.pow(e, (-t / (double)(R * C))));
		return v;
	}
	
	public static void main(String args[]) 
	{
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			int B = sc.nextInt();
			int R = sc.nextInt();
			double C = sc.nextDouble();
			int time0 = sc.nextInt();
			int timeN = sc.nextInt();
			
			FileWriter fileWriter = new FileWriter("rc.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			for(int t = time0; t <= timeN; t += 10) 
			{
				printWriter.printf("%d %f\n", t, v(R, B, C, t));
			}
			printWriter.close();
			sc.close();
		} catch (FileNotFoundException exception) 
		{
			exception.printStackTrace();
		} catch (IOException exception) 
		{
			exception.printStackTrace();
		}
	}
}