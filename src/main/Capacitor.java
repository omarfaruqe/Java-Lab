package main;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Capacitor {


	public static void main(String[] args) {
		try{
			FileReader input = new FileReader("params.txt");
			Scanner scan = new Scanner(input);
			
			PrintWriter write = new PrintWriter("rc.txt");
			double B,R,C,V;
			int tStart,tEnd,Step;
			B = scan.nextDouble();
			R = scan.nextDouble();
			C = scan.nextDouble();
			tStart = scan.nextInt();
			tEnd = scan.nextInt();
			Step = (tEnd-tStart)/100;
			for(int i= 0; i<100; i++){
				V = B*(1-Math.exp(-Step/(R*C)));
				write.print(Step);
				write.print("   ");
				write.println(V);
				Step =Step+10;
			}
			write.close();
			scan.close();	
		}
		catch(IOException exceptin){
			System.out.println("ok");
		}
	}
}

