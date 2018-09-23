package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Circuit {
	
	public static void main(String args[]) {

		try {
			Scanner input = new Scanner(new File("params.txt"));
			double B = input.nextDouble();
			double R = input.nextDouble();
			double C = input.nextDouble();
			double strt = input.nextDouble();
				
			double endt = input.nextDouble();
				
			double ps = 1/(R * C);
			double incriment = (endt - strt)/100.0;
				
			double t = (-1) * incriment;
				
			FileWriter fileWriter = new FileWriter("rc.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
				
			for(int i=0;i<100;i++) {
				t=t+incriment;
				
				double v = (1-(Math.exp((ps*t)*(-1))))*B;
					
				printWriter.printf("%f %f \n",t,v);
	
			}		
				
			printWriter.close();
			input.close();
			
		}catch(FileNotFoundException exception) {
			exception.printStackTrace();
		}catch(IOException exception) {
			exception.printStackTrace();
		}
	}


}
