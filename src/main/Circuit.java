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
		// TODO Auto-generated method stub
		try {
			final double e=2.71828183;
			Scanner inp=new Scanner(new File("params.txt"));
			FileWriter output=new FileWriter("rc.txt");
			PrintWriter out = new PrintWriter(output);
		
			int B,R,Tstart,Tfinish,T,step;
			double C,res;
			B=inp.nextInt();
			R=inp.nextInt();
			C=inp.nextDouble();
			Tstart=inp.nextInt();
			Tfinish=inp.nextInt();
			step=(Tfinish-Tstart)/100;
			
			for(int i=1;i<=100;i++) {
				T=step*i;
				res=12*(1-Math.pow(e,(-0.008*T)));
				out.println(T+"  "+res);
			}
			out.close();
		}
		catch(IOException ex) {
			System.out.println("File not found");
		}
	}

}
