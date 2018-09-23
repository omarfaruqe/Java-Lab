package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class circuit {
	static double B;
	static double R;
	static double C;
	static double voltage;
	static double t1;
	static double t2;
	static double i=0;
	static double step;
	public static void main(String[] args) {
		File input = new File("params.txt");
		try {
			Scanner in = new Scanner(input);
			B = in.nextDouble();
			R = in.nextDouble();
			C = in.nextDouble();
			t1 = in.nextDouble();
			t2 = in.nextDouble();
			in.close();
		}catch (FileNotFoundException e) {
			
				System.out.println("File Not Found");
		}
		try {
				FileWriter out = new FileWriter("rc.txt");
				step=(t2-t1)/100;
				for(i=t1;i<=t2;i+=step) {
					voltage = B*(1-Math.pow(Math.E,-i*(R*C)));
					out.write(i + " " + voltage + "\n\n");			
				}
			out.close();				
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}
}
