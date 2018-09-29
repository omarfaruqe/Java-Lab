package main;

public class Circuit {

}
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class circuit{
public static final double e = 2.71828;
	
	public static double v(int R, int B, double C, int t) {
		double v = B * (1 - Math.pow(e, (-t / (double)(R * C))));
		return v;
	}
	
	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(new File("params.txt"));
			int B = input.nextInt();
			int R = input.nextInt();
			double C = input.nextDouble();
			int beginning = input.nextInt();
			int finishing = input.nextInt();
			
			FileWriter fileWriter = new FileWriter("rc.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			for(int t = beginning; t <= finishing; t += 10) {
				printWriter.printf("%d %f\n", t, v(R, B, C, t));
			}
			printWriter.close();
			input.close();
		} 
		catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
    }

	private static void printf(String string, int b) {
		// TODO Auto-generated method stub
		
	}
}
