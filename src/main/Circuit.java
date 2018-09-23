
package main;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.Math;
public class Circuit {
	public static void main(String[] args) {
		try {
		final double e=2.71828183;
		Scanner in = new Scanner(new File("params.txt"));
		FileWriter output=new FileWriter("rc.txt");
		PrintWriter out = new PrintWriter(output);
		
		int B,R,t_start,t_end,t,step;
		double C,v;
		B=in.nextInt();
		R=in.nextInt();
		C=in.nextDouble();
		t_start=in.nextInt();
		t_end=in.nextInt();
		step=(t_end-t_start)/100;
		for(int i=1;i<=100;i++) {
			t=step*i;
			v=12*(1-Math.pow(e,(-0.008*t)));
			out.println("v("+t+")="+v);
		}
		out.close();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
