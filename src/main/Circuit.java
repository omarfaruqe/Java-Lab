package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public static double Back(int B,int R,int C,int t)
{
	double volt = B * (1 - Math.pow(e, (-t / (double)(R * C))));
	return volt;
}

public class Circuit{
	public static void main(String[] args) throw FileNotFoundException {
		
		Scanner input = new Scanner(new File("params.txt"));
		
		int B = input.nextInt();
		int R = input.nextInt();
		int C = input.nextDouble();
		int Beg = input.nextInt();
		int End = input.nextInt();
		
		FileWriter FWriter = new FileWriter("rc.txt");

		for(int i = beg; i <= End; i = i + 10) {
			printWriter.printf("%d %f\n", t, Back(B, R, C, t));
			printWriter.close();
			in.close();
		}
		
	}

}
