package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public static double Back(int B,int R,int C,int t)
{
	double volt = B * (1 - Math.pow(e, (-t / (double)(R * C))));
	return volt;
}

public class Test {
	public static void main(String[] args) throw FileNotFoundException {
		
		Scanner in = new Scanner(new File("params.txt"));
		

	}

}
