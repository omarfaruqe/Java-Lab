package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit {
	public static void main(String[] args) throws FileNotFoundException {
		
		final int TEN=10;
		final int ZERO=0;
		final int ONE=1;
		final int MINUS=-1;
		final double e=2.71828;
		int i=ZERO;
		double Voltage;
		try{
		
		File  inputFile = new File ("params.txt");
		PrintWriter out = new PrintWriter ("rr.txt");
		Scanner in = new Scanner (inputFile);
		
        double B= in.nextDouble();
		double R=in.nextDouble();
	    double C= in.nextDouble();
		int  ti=in.nextInt();
		int  tf = in.nextInt();
		for(i=ti;i<=tf;i=i+TEN) {
			out.print(i);
			out.print("  ");
			Voltage = B*(ONE - Math.pow(e , (MINUS*i/(R*C))));
			out.println(Voltage);
		}
		in.close();
		out.close();
		}
		catch(IOException exception) {
			System.out.println("Opps! Error Opening File!");
		}

	}

}
© 2018 GitHub, Inc.
Terms
Privacy
