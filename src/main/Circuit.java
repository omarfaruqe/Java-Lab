package main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Circuit {
	double B,R,C;
	int t_diff,t_start,t_end,t;
	
	public void calculateVoltage() {
		try {
		
			Scanner in=new Scanner(new File("params.txt"));
			FileWriter fileWriter = new FileWriter("rc.txt");
			PrintWriter output = new PrintWriter(fileWriter);
			
		
			B=in.nextDouble();
			R=in.nextDouble();
			C=in.nextDouble();
			t_start=in.nextInt();
			t_end=in.nextInt();
			double voltage;
			t_diff=(t_end-t_start)/100;
			for(t=t_start;t<=t_end;t=t+t_diff) {
				voltage=B*(1-Math.exp(-t/(R*C)));
				output.println(t+" "+voltage);
				
			}
			output.close();
			in.close();
			
		}catch(Exception exception) {
			System.out.println("Exception Found");
		}
		
		
		
		
		
	}

}
