package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalculateVoltage {
	public static void main(String[] args) {
		final int TEN=10;
		final int ZERO=0;
		final int ONE=1;
		final int MINUS=-1;
		final double e=2.71828;
		int i=ZERO;
		double Voltage;
		try {
			Scanner in = new Scanner(new File("F:\\Users\\cse\\eclipse-workspace\\VoltageCalculation\\src\\main\\params.txt"));
			PrintWriter out = new PrintWriter(new File("F:\\Users\\cse\\eclipse-workspace\\VoltageCalculation\\src\\main\\rc.txt"));
			double B = in.nextDouble();
			double Resistance = in.nextDouble();
			double Capacity = in.nextDouble();
			int Start = in.nextInt();
			int End = in.nextInt();
			for(i=Start;i<=End;i=i+TEN) {
				out.print(i);
				out.print("  ");
				Voltage = B*(ONE - Math.pow(e , (MINUS*i/(Resistance*Capacity))));
				out.println(Voltage);
			}
			out.close();
		}
		catch(IOException exception) {
			System.out.println("Opps! Error Opening File!");
		}
	}

}