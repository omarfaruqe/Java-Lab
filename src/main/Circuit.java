package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit {
	public static double e = 2.71828;
	 
	
	public static double v (int B,int R,double C,int t) {
		double v = B * (1 - Math.pow(e, (-t / (double)(R * C))));
		return  v;
	}

	public static void main(String args[]) {

		try {

			Scanner in = new Scanner(new File("params.txt"));

			int B = in.nextInt();

			int R = in.nextInt();
			
			double C =in.nextDouble();

			int T0 = in.nextInt();

			int T1 = in.nextInt();
			

			FileWriter fileWriter = new FileWriter("rc.txt");

			PrintWriter printWriter = new PrintWriter(fileWriter);

			

			for(int t = T0; t <= T1; t += 10) {

				printWriter.printf("%d %f\n", t, v(B,R,C,t));

			}

			printWriter.close();

			 in.close();

		} catch (FileNotFoundException exception) {

			exception.printStackTrace();

		} catch (IOException exception) {

			exception.printStackTrace();

		}
	}
}
