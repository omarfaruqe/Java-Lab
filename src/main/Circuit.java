package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Circuit{
	double B,R,C,t,v;
	private Scanner sc1;
	public Circuit(){
		try {
			sc1 = new Scanner(new File("params.txt"));
			
			B=sc1.nextDouble();
			R=sc1.nextDouble();
			C=sc1.nextDouble();
		}
		catch (Exception ex) {
			System.out.println("Error in File Reading");
		}
	}
	
	public void calculate() {
		FileWriter fw = null;
		try {
			fw= new FileWriter("rc.txt");
			
			for(t=0;t<=1000;t=t+10) {
				v=B*(1-Math.pow(Math.E,-(t/(R*C))));
				fw.write(t+"  "+v+"\n");
			}
			fw.close();
			
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
